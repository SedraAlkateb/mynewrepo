package Ast.nodes;

public class BodyIfc extends IFC{
    private String var;
    private String Req;
    private String operator;
    private String equ;
    private String str;

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getReq() {
        return Req;
    }

    public void setReq(String req) {
        Req = req;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getEqu() {
        return equ;
    }

    public void setEqu(String equ) {
        this.equ = equ;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
