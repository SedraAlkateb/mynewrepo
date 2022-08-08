package Ast.nodes;

public class Print extends BodyController{
    private String printOpen;
    private String tag;
    private String var;
    private String num;

    private String prp;
    private String printclose;

    public String getPrintOpen() {
        return printOpen;
    }

    public void setPrintOpen(String printOpen) {
        this.printOpen = printOpen;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPrintclose() {
        return printclose;
    }

    public void setPrintclose(String printclose) {
        this.printclose = printclose;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }

    public String getPrp() {
        return prp;
    }

    public void setPrp(String prp) {
        this.prp = prp;
    }

    private String semicolon;

}
