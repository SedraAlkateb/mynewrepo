package Ast.nodes;

public class IF extends BodyController{
    private IFC ifc;
    private IfBody ifBody;
    private ElseBody elseBody;

    public IFC getIfc() {
        return ifc;
    }

    public void setIfc(IFC ifc) {
        this.ifc = ifc;
    }

    public IfBody getIfBody() {
        return ifBody;
    }

    public void setIfBody(IfBody ifBody) {
        this.ifBody = ifBody;
    }

    public ElseBody getElseBody() {
        return elseBody;
    }

    public void setElseBody(ElseBody elseBody) {
        this.elseBody = elseBody;
    }
}
