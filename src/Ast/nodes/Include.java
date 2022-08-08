package Ast.nodes;

public class Include extends BodyPage{
    private String include11;
    private String openBracket;
    private String tagName;
    private String closeBracket;
    private String close;

    public String getInclude11() {
        return include11;
    }

    public void setInclude11(String include11) {
        this.include11 = include11;
    }

    @Override
    public String getOpenBracket() {
        return openBracket;
    }

    @Override
    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    @Override
    public String getCloseBracket() {
        return closeBracket;
    }

    @Override
    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public String getClose() {
        return close;
    }

    public void setClose(String close) {
        this.close = close;
    }
}
