package Ast.nodes;

public class ARRV extends Vairable{
    private String openArray;
    private String closeArray;
    private BodyArr bodyArr;

    public String getOpenArray() {
        return openArray;
    }

    public void setOpenArray(String openArray) {
        this.openArray = openArray;
    }

    public String getCloseArray() {
        return closeArray;
    }

    public void setCloseArray(String closeArray) {
        this.closeArray = closeArray;
    }

    public BodyArr getBodyArr() {
        return bodyArr;
    }

    public void setBodyArr(BodyArr bodyArr) {
        this.bodyArr = bodyArr;
    }
}
