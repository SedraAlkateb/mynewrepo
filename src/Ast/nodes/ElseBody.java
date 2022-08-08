package Ast.nodes;

import java.util.List;

public class ElseBody extends IF{
    private String else11;
    private String openBracket;
    private List<Body> bodies;
    private String closeBracket;

    public String getElse11() {
        return else11;
    }

    public void setElse11(String else11) {
        this.else11 = else11;
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
