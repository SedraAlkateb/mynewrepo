package Ast.nodes;

public class Body extends IfBody{
    private GoTo goTo;
    private Vairable vairable;
    private IF iff;
    private For forr;
    private ForEach forEach;
    private Print print;
    private ARR arr;
    private String semicolon;

    public GoTo getGoTo() {
        return goTo;
    }

    public void setGoTo(GoTo goTo) {
        this.goTo = goTo;
    }

    @Override
    public Vairable getVairable() {
        return vairable;
    }

    @Override
    public void setVairable(Vairable vairable) {
        this.vairable = vairable;
    }

    @Override
    public IF getIff() {
        return iff;
    }

    @Override
    public void setIff(IF iff) {
        this.iff = iff;
    }

    public For getForr() {
        return forr;
    }

    public void setForr(For forr) {
        this.forr = forr;
    }

    public ForEach getForEach() {
        return forEach;
    }

    public void setForEach(ForEach forEach) {
        this.forEach = forEach;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    @Override
    public ARR getArr() {
        return arr;
    }

    @Override
    public void setArr(ARR arr) {
        this.arr = arr;
    }

    public String getSemicolon() {
        return semicolon;
    }

    public void setSemicolon(String semicolon) {
        this.semicolon = semicolon;
    }
}
