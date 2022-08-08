package Ast.nodes;

public class BodyController extends DefinitionController{
    private ARR arr;
    private String semiclilon;
    private Vairable vairable;
    private Print print;
    private IF iff;
    private GoTo goTo;
    private For forr;
    private ForEach forEach;
    private Validation validation;

    public ARR getArr() {
        return arr;
    }

    public void setArr(ARR arr) {
        this.arr = arr;
    }

    public String getSemiclilon() {
        return semiclilon;
    }

    public void setSemiclilon(String semiclilon) {
        this.semiclilon = semiclilon;
    }

    public Vairable getVairable() {
        return vairable;
    }

    public void setVairable(Vairable vairable) {
        this.vairable = vairable;
    }

    public IF getIff() {
        return iff;
    }

    public void setIff(IF iff) {
        this.iff = iff;
    }

    public GoTo getGoTo() {
        return goTo;
    }

    public void setGoTo(GoTo goTo) {
        this.goTo = goTo;
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

    public Validation getValidation() {
        return validation;
    }

    public void setValidation(Validation validation) {
        this.validation = validation;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }
}
