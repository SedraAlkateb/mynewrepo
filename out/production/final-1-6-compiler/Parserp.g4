parser grammar Parserp;

options { tokenVocab= Lexerp; }
pages :
 TAG_WHITESPACE*
 (def_page|def_controller)+
;
 body_controller:
 (arr CLOSE)|varequal|
 if|print|switch|foreach|f|for|goto|validation
 ;
def_controller:
 CONTROLLER TAG_NAME CONTROLS (TAG_NAME4 (COMMA4 TAG_NAME5)*)OPENBRACKET4
 (body_controller TAG_WHITESPACE*)*
 CLOSEBRACKET ;
def_page :
 PAGE TAG_NAME   (EXTENDS (TAG_NAME (COMMA TAG_NAME)*) HEADER)*
 OPENBRACKET body_page* TAG_WHITESPACE* CLOSEBRACKET;


body_page:(in|out|link|data|ifp|print|varequal|
foreachp|forp|switchp|f|include);


bodyIN:(TOIN OPENP (N (COMMAM N1)?) CLOSEP);
bodyOUT:(TOOUT OPENPOUT (NOUT (COMMAMOUT NOUT1)?) CLOSEPOUT);
in:IN_OPEN ((NUMBER  OPENP NU?)|(COLOR OPENP H?) |(EMAIL OPENP E?) |( (FILE|IMAGEIN)  OPENP PATH? )
|(NUAMIN OPENP N?)) CLOSEP bodyIN? IN_CLOSE ;
out:
(OUT_OPEN) ((TEXT  OPENPOUT NOUT )|(IMAGEOUT  OPENPOUT PATHOUT ) )CLOSEPOUT bodyOUT? OUT_CLOSE ;

link:SEA_WS* LINK SEA_WS* OPENC TAG_NAME CLOSEC
       (TO OPENC1 (TAG_NAME1 (COMMA1 TAG_NAME2)? )CLOSEC1  )? CLOSE
;

data:
SEA_WS* DATA SEA_WS* OPENC TAG_NAME CLOSEC
  (TO OPENC1 (TAG_NAME1 (COMMA1 TAG_NAME2)? )CLOSEC1  )? CLOSE
;

print:
PRINT_OPEN
((STRINGP)|VARP|NUMP|PRP|F)TAG_WHITESPACE*
 PRINT_CLOSE CLOSE
 ;
arr:
 ARRAY_OPEN bodyarr  ARRAY_CLOSE
  ;
arrv:
 OPENARRV bodyarr  ARRAY_CLOSE
   ;

bodyarr:
bodyarr1
|bodyarr2
|bodyarr3
;
bodyarr1:
(STRINGARR1  (COMMAARR STRINGARR2)*)
;
bodyarr2:
(NUMarr+  (COMMAARR NUMarr1+)*);
bodyarr3:
((VARARR ARRN)  (COMMAARR( VARARR1 ARRN1))*);

varequal:VAREQUAL_OPEN STRINGG EQUALVAR
(arrv |NUME+|FUNCTIONE|ST )
 VAREQUAL_CLOSE
 ;
 foreach:
  FOREACHC_OPEN bodyforeach FOREACH_CLOSE
  OPENBRACKET body+ CLOSEBRACKET
  ;
  foreachp:
   FOREACHP_OPEN bodyforeach FOREACH_CLOSE
    OPENBRACKET bodyP+ CLOSEBRACKET
    ;
 for:
 FOR_OPENC bodyfor FOR_CLOSE
  OPENBRACKET body+ CLOSEBRACKET
  ;
   forp:
    FOR_OPENP bodyforp FOR_CLOSE
    OPENBRACKET bodyP+ CLOSEBRACKET
    ;
bodyfor:
bodyforfirstvar  number1  number2  OP Closef OPNUM number3
// VARF FORNA  BDYFOR VARF FORNA
;
number1:Number Closef;
number2:Number Closef;
number3:Number ;
bodyforp:
bodyforfirstvar  number1  number2  OP Closef OPNUM number3
// VARF FORNA  BDYFOR VARF FORNA
;
bodyforfirstvar:VARF FORNA Closef;
bodyforeach:
bodyforeachFirstArg BDYFOREACH bodyforeachSecondArg
//VAREACH FOREACHN BDYFOREACH VAREACH FOREACHN
;
bodyforeachFirstArg:VAREACH FOREACHN;
bodyforeachSecondArg:VAREACH FOREACHN;

bodyifc:
(FIF
|(((VIF IFN)|(REQ))
 ( (TAG_OPERATOR)?|(VAREQ STR))?))
;
body:
TAG_WHITESPACE*
(goto|varequal|if|for|print|foreach|switchp| FUNCTON|(arr CLOSE))
 TAG_WHITESPACE*
 ;
 bodyP:
 TAG_WHITESPACE*
 (varequal| ifp|forp|print|foreachp|switchp|
  FUNCTON|(arr CLOSE)|LINK|DATA|in|out)
  TAG_WHITESPACE*
  ;
goto:
gotobody1 (gotobody2(gotobody3)*GOTOC)?GOTO_CLOSE;
//GOTO_OPEN GOTON
//( GOTOP GOTOVAR GOTON (GOTOCOMMA GOTOVAR GOTON)*GOTOC)?
//GOTO_CLOSE
// ;
 gotobody1:GOTO_OPEN GOTON;
 gotobody2:GOTOP GOTOVAR GOTON;
 gotobody3:GOTOCOMMA GOTOVAR GOTON;

ifc:
  IF_OPENC bodyifc IF_CLOSE
  ;
  ifcv:
    IF_OPENP bodyifc IF_CLOSE
    ;
if:
 ifc
 ifbody elsebody?
 //OPENBRACKET (body)* CLOSEBRACKET
 //(ELSEIF1 ifc OPENBRACKET (body)*CLOSEBRACKET)*
 //(ELSE11 OPENBRACKET(body)*CLOSEBRACKET)?
  ;
ifbody:OPENBRACKET (body)* CLOSEBRACKET;
elsebody:(ELSE11 OPENBRACKET(body)*CLOSEBRACKET);


  ifp:
    ifcv
   OPENBRACKET bodyP* CLOSEBRACKET
   (ELSEIF ifc OPENBRACKET (bodyP)*CLOSEBRACKET)*
   (ELSE OPENBRACKET(bodyP)*CLOSEBRACKET)?
    ;
switch:
 SWITCH_OPENC body_switch SWITCH_CLOSEC
 (CASE STRINGARR (body)+  PREAK)+ ENDSWITCH
 ;
 switchp:
 SWITCH_OPENP body_switch SWITCH_CLOSEC
  (CASE STRINGARR (bodyP)+  PREAK)+ ENDSWITCH
  ;
body_switch:
 PRSWITCH|TN|(VARSWITCH TN)
 ;
 f:TAG_NAME OPENC ((VAAR TAG_NAME (COMMA  VAAR TAG_NAME)*)|(NUM (COMMA  NUM)*) )* CLOSEC CLOSE;

include:
INCLUDE OPENC  TAG_NAME CLOSEC CLOSE TAG_WHITESPACE*
;
//validn:REQUIREDV|STRINGV|EMAILV|(MINV NUM)|(MAXV NUM);
//validn1:REQUIREDV|STRINGV|EMAILV|(MINV NUM)|(MAXV NUM);
//validation:VALIDATION OPENC REQUEST CLOSEC OPENBRACKET (STRINGARR VALID ((valid(OR valid1 )*)|(validn(OR validn1 )*)) CLOSE )* CLOSEBRACKET;
validation:VALIDATION OPENC REQUEST CLOSEC OPENBRACKET
(TAG_NAME VALID (REQUIREDV|STRINGV|EMAILV|)CLOSE)* CLOSEBRACKET;
/*controller c1 controls gg{validation(request){
  name=> string;
  password=>email;
  }}
*/
//(cs * TAG_WHITESPACE+ PREAK CLOSE  TAG_WHITESPACE+)+
//page p1{in: radio(name);}
//page p1{in: field(name);}
//controller c1 controls gg{if(valid($name, $pass)){print ($x);}}
//page p1{in: radio(name)->val(ff);}
//page p1{in: email(name@fvd.com)->val(id,name);}
/*

page p1{
 @switch(request->name)
  	case:"nwar"
 $A1 = array["red","green","blue"];
  	break;

  	case:"mohammad"
 @if($fd)
  {
  print("d");
  in: radio(name);
  }
  @for($f in $g){
  $s=4;
  in: radio(name);
   @if($fd)
  {

  print("d");
  }
  }
  in: radio(name);
  	break;
endswitch
}


 */
 /* @include(p4);
  controller c1 controls gg{
   $A1 = array["red","green","blue"];
   array["kn"];
   if($d = 1){
for($i;0;8;<;+2 ){
  goto p($d,$fgf);
  print ($cloors);
  $F= "SFS" ;
array["kn"];
print (request->name);
 if($fd > 5)
  {
    print (request->name);
  goto p($d);
  print("d");
  if($fd)
  {
  goto p($d);
  print("d");
  }666666
  }
}}
}*/
/*
controller c1 controls gg{
 switch(request->name)
  	case:"nwar"
 $A1 = array["red","green","blue"];
  	break;

  	case:"mohammad"
 if($fd)
  {
  goto p($d);
  print("d");
  }
  	break;
endswitch
}
*/
/*
 page gg{

 @for($x in $n)
 {
 in: number(1,5);
 in:file(d:\ds\);
 in:image(d:\ds\)->val(sdf,sdas);
 out :image(dsdfcom :\bkj\b\)->val(sdf,sdas);

 }




  }

  */
  /*
  controller c1 controls gg{
  validation ( request ){
  "fdsgfds"=> required|string;
  }
  }

  */