package Ast.nodes;

import java.util.List;

public class Validation extends BodyController {
    private String validation1;
    private String openC;
    private String Req;
    private String closeC;
    private String openBracket;
    private List<String> str;

    private List<String> valid;
    private String closeBracket;
    private String required;
    private String string;
    private String email;

    public String getValidation1() {
        return validation1;
    }

    public void setValidation1(String validation1) {
        this.validation1 = validation1;
    }

    public String getOpenC() {
        return openC;
    }

    public void setOpenC(String openC) {
        this.openC = openC;
    }

    public String getReq() {
        return Req;
    }

    public void setReq(String req) {
        Req = req;
    }

    public String getCloseC() {
        return closeC;
    }

    public void setCloseC(String closeC) {
        this.closeC = closeC;
    }

    @Override
    public String getOpenBracket() {
        return openBracket;
    }

    @Override
    public void setOpenBracket(String openBracket) {
        this.openBracket = openBracket;
    }

    public List<String> getStr() {
        return str;
    }

    public void setStr(List<String> str) {
        this.str = str;
    }

    public List<String> getValid() {
        return valid;
    }

    public void setValid(List<String> valid) {
        this.valid = valid;
    }

    @Override
    public String getCloseBracket() {
        return closeBracket;
    }

    @Override
    public void setCloseBracket(String closeBracket) {
        this.closeBracket = closeBracket;
    }

    public String getRequired() {
        return required;
    }

    public void setRequired(String required) {
        this.required = required;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



}
