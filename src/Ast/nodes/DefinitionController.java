package Ast.nodes;

import java.util.List;

public class DefinitionController extends Page{

    private String controller;
    private String tagName;
    private String controls;
    private String tagName2;
    private String tagName3;
    private String openBracket;
    private String closeBracket;
    private String comma;
    //private BodyController bodyController;
    private List<BodyController> bodyControllers;

    public String getController() {
        return controller;
    }

    public void setController(String controller) {
        this.controller = controller;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getControls() {
        return controls;
    }

    public void setControls(String controls) {
        this.controls = controls;
    }

    public String getTagName2() {
        return tagName2;
    }

    public void setTagName2(String tagName2) {
        this.tagName2 = tagName2;
    }

    public String getTagName3() {
        return tagName3;
    }

    public void setTagName3(String tagName3) {
        this.tagName3 = tagName3;
    }

    public String getOpenBracket() {
        return openBracket;
    }

    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public String getCloseBracket() {
        return closeBracket;
    }

    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

//   public BodyController getBodyController() {
//        return bodyController;
//    }
//
//    public void setBodyController(BodyController bodyController) {
//        this.bodyController = bodyController;
//    }

    public List<BodyController> getBodyControllers() {
        return bodyControllers;
    }

    public void setBodyControllers(List<BodyController> bodyControllers) {
        this.bodyControllers = bodyControllers;
    }
}
