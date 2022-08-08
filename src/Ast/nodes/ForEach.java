package Ast.nodes;

import java.util.List;

public class ForEach extends BodyController{
    private String foreachOpen;
    private BodyForeach bodyForeach;
    private String foreachClose;
    private String openBracket;
    private List<Body> bodies;
    private String closeBracket;

    public String getForeachOpen() {
        return foreachOpen;
    }

    public void setForeachOpen(String foreachOpen) {
        this.foreachOpen = foreachOpen;
    }

    public BodyForeach getBodyForeach() {
        return bodyForeach;
    }

    public void setBodyForeach(BodyForeach bodyForeach) {
        this.bodyForeach = bodyForeach;
    }

    public String getForeachClose() {
        return foreachClose;
    }

    public void setForeachClose(String foreachClose) {
        this.foreachClose = foreachClose;
    }

    @Override
    public String getOpenBracket() {
        return openBracket;
    }

    @Override
    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public List<Body> getBodies() {
        return bodies;
    }

    public void setBodies(List<Body> bodies) {
        this.bodies = bodies;
    }

    @Override
    public String getCloseBracket() {
        return closeBracket;
    }

    @Override
    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }
}
