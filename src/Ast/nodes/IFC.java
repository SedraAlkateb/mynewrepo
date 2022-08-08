package Ast.nodes;

public class IFC extends IF{
    private String ifOpen;
    private String ifClose;
    private BodyIfc bodyIfc;

    public String getIfOpen() {
        return ifOpen;
    }

    public void setIfOpen(String ifOpen) {
        this.ifOpen = ifOpen;
    }

    public String getIfClose() {
        return ifClose;
    }

    public void setIfClose(String ifClose) {
        this.ifClose = ifClose;
    }

    public BodyIfc getBodyIfc() {
        return bodyIfc;
    }

    public void setBodyIfc(BodyIfc bodyIfc) {
        this.bodyIfc = bodyIfc;
    }
}
