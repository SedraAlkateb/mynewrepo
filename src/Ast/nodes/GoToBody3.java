package Ast.nodes;

public class GoToBody3 extends GoTo{
    private String gotoComma;
    private String gotoVar;
    private String gotoOn;

    public String getGotoComma() {
        return gotoComma;
    }

    public void setGotoComma(String gotoComma) {
        this.gotoComma = gotoComma;
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
