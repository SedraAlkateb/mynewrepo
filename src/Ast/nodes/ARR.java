package Ast.nodes;

public class ARR extends BodyController{

    private String arrayOpen;
    private BodyArr bodyArr;
    private String arrayClose;

    public String getArrayOpen() {
        return arrayOpen;
    }

    public void setArrayOpen(String arrayOpen) {
        this.arrayOpen = arrayOpen;
    }

    public BodyArr getBodyArr() {
        return bodyArr;
    }

    public void setBodyArr(BodyArr bodyArr) {
        this.bodyArr = bodyArr;
    }

    public String getArrayClose() {
        return arrayClose;
    }

    public void setArrayClose(String arrayClose) {
        this.arrayClose = arrayClose;
    }
}
