package Ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class DefinitionPage extends Page {
    private String page;
    private String tagName;
    private String openBracket;
    private String closeBracket;
    private List<BodyPage> bodyPages = new ArrayList<>();

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



    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<BodyPage> getBodyPages() {
        return bodyPages;
    }

    public void setBodyPages(List<BodyPage> bodyPages) {
        this.bodyPages = bodyPages;
    }
}
