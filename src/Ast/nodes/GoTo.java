package Ast.nodes;

import java.util.List;

public class GoTo extends BodyController{
    private GoToBody1 goToBody1;
    private GoToBody2 goToBody2;
    private List<GoToBody3> goToBody3s;
    private String close;
    private String semiColon;

    public GoToBody1 getGoToBody1() {
        return goToBody1;
    }

    public void setGoToBody1(GoToBody1 goToBody1) {
        this.goToBody1 = goToBody1;
    }

    public GoToBody2 getGoToBody2() {
        return goToBody2;
    }

    public void setGoToBody2(GoToBody2 goToBody2) {
        this.goToBody2 = goToBody2;
    }

    public List<GoToBody3> getGoToBody3s() {
        return goToBody3s;
    }

    public void setGoToBody3s(List<GoToBody3> goToBody3s) {
        this.goToBody3s = goToBody3s;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }
}
