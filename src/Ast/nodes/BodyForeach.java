package Ast.nodes;

public class BodyForeach extends ForEach{
    private BodyForeachFirstArg bodyForeachFirstArg;
    private String BDyforeach;
    private BodyForeachSecondArg bodyForeachSecondArg;

    public BodyForeachFirstArg getBodyForeachFirstArg() {
        return bodyForeachFirstArg;
    }

    public void setBodyForeachFirstArg(BodyForeachFirstArg bodyForeachFirstArg) {
        this.bodyForeachFirstArg = bodyForeachFirstArg;
    }

    public String getBDyforeach() {
        return BDyforeach;
    }

    public void setBDyforeach(String BDyforeach) {
        this.BDyforeach = BDyforeach;
    }

    public BodyForeachSecondArg getBodyForeachSecondArg() {
        return bodyForeachSecondArg;
    }

    public void setBodyForeachSecondArg(BodyForeachSecondArg bodyForeachSecondArg) {
        this.bodyForeachSecondArg = bodyForeachSecondArg;
    }
}
