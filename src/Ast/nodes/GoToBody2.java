package Ast.nodes;

public class GoToBody2 extends GoTo{
    private String gotoOP;
    private String gotoVar;
    private String gotoOn;

    public String getGotoOP() {
        return gotoOP;
    }

    public void setGotoOP(String gotoOP) {
        this.gotoOP = gotoOP;
    }

    public String getGotoVar() {
        return gotoVar;
    }

    public void setGotoVar(String gotoVar) {
        this.gotoVar = gotoVar;
    }

    public String getGotoOn() {
        return gotoOn;
    }

    public void setGotoOn(String gotoOn) {
        this.gotoOn = gotoOn;
    }
}
