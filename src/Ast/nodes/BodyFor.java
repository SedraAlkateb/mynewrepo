package Ast.nodes;

import java.util.List;

public class BodyFor extends For {
    private BodyForFirstVar bodyForFirstVar;
    private Number1 num1;
    private Number2 num2;
    private String opnum;
    private Number3 num3;

    private String op;


    public String getOpnum() {
        return opnum;
    }

    public void setOpnum(String opnum) {
        this.opnum = opnum;
    }

    public BodyForFirstVar getBodyForFirstVar() {
        return bodyForFirstVar;
    }

    public void setBodyForFirstVar(BodyForFirstVar bodyForFirstVar) {
        this.bodyForFirstVar = bodyForFirstVar;
    }

    public String getNum1() {
        return String.valueOf(num1);
    }

    public void setNum1(Number1 num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return String.valueOf(num2);
    }

    public void setNum2(Number2 num2) {
        this.num2 = num2;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getNum3() {
        return String.valueOf(num3);
    }

    public void setNum3(Number3 num3) {
        this.num3 = num3;
    }
}