package Ast.nodes;


public class BodyPage extends DefinitionPage {
    private IN in ;
    private Out out ;
    private Link link ;
    private Data data ;
    private Print print ;

    private Include include ;

    public IN getIn() {
        return in;
    }

    public Print getPrint() {
        return print;
    }

    public void setPrint(Print print) {
        this.print = print;
    }

    public void setIn(IN in) {
        this.in = in;
    }

    public Out getOut() {
        return out;
    }

    public void setOut(Out out) {
        this.out = out;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Include getInclude() {
        return include;
    }

    public void setInclude(Include include) {
        this.include = include;
    }
}
