// Generated from D:/compiler/Compiler-5 (1)/Compiler-5/src\Parserp.g4 by ANTLR 4.10.1
package gen;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Parserp}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ParserpVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Parserp#pages}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPages(Parserp.PagesContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#body_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_controller(Parserp.Body_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#def_controller}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_controller(Parserp.Def_controllerContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#def_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDef_page(Parserp.Def_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#body_page}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_page(Parserp.Body_pageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyIN}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyIN(Parserp.BodyINContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyOUT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyOUT(Parserp.BodyOUTContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#in}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(Parserp.InContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(Parserp.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(Parserp.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#data}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData(Parserp.DataContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(Parserp.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#arr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArr(Parserp.ArrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#arrv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrv(Parserp.ArrvContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyarr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyarr(Parserp.BodyarrContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyarr1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyarr1(Parserp.Bodyarr1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyarr2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyarr2(Parserp.Bodyarr2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyarr3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyarr3(Parserp.Bodyarr3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#varequal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarequal(Parserp.VarequalContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#foreach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach(Parserp.ForeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#foreachp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeachp(Parserp.ForeachpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(Parserp.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#forp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForp(Parserp.ForpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyfor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyfor(Parserp.BodyforContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#number1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber1(Parserp.Number1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#number2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber2(Parserp.Number2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#number3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber3(Parserp.Number3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyforp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyforp(Parserp.BodyforpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyforfirstvar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyforfirstvar(Parserp.BodyforfirstvarContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyforeach}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyforeach(Parserp.BodyforeachContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyforeachFirstArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyforeachFirstArg(Parserp.BodyforeachFirstArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyforeachSecondArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyforeachSecondArg(Parserp.BodyforeachSecondArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyifc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyifc(Parserp.BodyifcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Parserp.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#bodyP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyP(Parserp.BodyPContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#goto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto(Parserp.GotoContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#gotobody1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotobody1(Parserp.Gotobody1Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#gotobody2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotobody2(Parserp.Gotobody2Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#gotobody3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGotobody3(Parserp.Gotobody3Context ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#ifc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfc(Parserp.IfcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#ifcv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfcv(Parserp.IfcvContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(Parserp.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#ifbody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfbody(Parserp.IfbodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#elsebody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElsebody(Parserp.ElsebodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#ifp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfp(Parserp.IfpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch(Parserp.SwitchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#switchp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchp(Parserp.SwitchpContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#body_switch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody_switch(Parserp.Body_switchContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(Parserp.FContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#include}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInclude(Parserp.IncludeContext ctx);
	/**
	 * Visit a parse tree produced by {@link Parserp#validation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidation(Parserp.ValidationContext ctx);
}