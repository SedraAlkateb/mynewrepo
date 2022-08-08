package Ast.nodes;

public class BodyOut extends Out {
    private String arrow;
    private String openBracket;
    private String id;
    private String comma;
    private String name;
    private String closeBracket;

    public String getArrow() {
        return arrow;
    }

    public void setArrow(String arrow) {
        this.arrow = arrow;
    }

    @Override
    public String getOpenBracket() {
        return openBracket;
    }

    @Override
    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComma() {
        return comma;
    }

    public void setComma(String comma) {
        this.comma = comma;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
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