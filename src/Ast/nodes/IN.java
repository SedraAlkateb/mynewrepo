package Ast.nodes;

public class IN extends BodyPage {

    private String inOpen;
    private String color;
    private String openBracket;
    private String colorText;
    private String email;
    private String emailText;
    private String file;
    private String imageIn;
    private String path;
    private String tag;
    private String tagText;
    private String closeBracket;
    private String semiColon;
    private BodyIn bodyIn ;

    private String number;
    private String numberValue;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(String numberValue) {
        this.numberValue = numberValue;
    }

    public String getInOpen() {
        return inOpen;
    }

    public void setInOpen(String inOpen) {
        this.inOpen = inOpen;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getOpenBracket() {
        return openBracket;
    }

    @Override
    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public String getColorText() {
        return colorText;
    }

    public void setColorText(String colorText) {
        this.colorText = colorText;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailText() {
        return emailText;
    }

    public void setEmailText(String emailText) {
        this.emailText = emailText;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getImageIn() {
        return imageIn;
    }

    public void setImageIn(String imageIn) {
        this.imageIn = imageIn;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTagText() {
        return tagText;
    }

    public void setTagText(String tagText) {
        this.tagText = tagText;
    }

    @Override
    public String getCloseBracket() {
        return closeBracket;
    }

    @Override
    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public String getSemiColon() {
        return semiColon;
    }

    public void setSemiColon(String semiColon) {
        this.semiColon = semiColon;
    }

    public BodyIn getBodyIn() {
        return bodyIn;
    }

    public void setBodyIn(BodyIn bodyIn) {
        this.bodyIn = bodyIn;
    }


}