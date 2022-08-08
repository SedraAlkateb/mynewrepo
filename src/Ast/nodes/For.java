package Ast.nodes;

import java.util.List;

public class For extends BodyController{
    private String forOpen;
    private BodyFor bodyFor;
    private String forClose;
    private String openBracket;
    private List<Body> bodies;
    private String closeBracket;

    public String getForOpen() {
        return forOpen;
    }

    public void setForOpen(String forOpen) {
        this.forOpen = forOpen;
    }

    public BodyFor getBodyFor() {
        return bodyFor;
    }

    public void setBodyFor(BodyFor bodyFor) {
        this.bodyFor = bodyFor;
    }

    public String getForClose() {
        return forClose;
    }

    public void setForClose(String forClose) {
        this.forClose = forClose;
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
