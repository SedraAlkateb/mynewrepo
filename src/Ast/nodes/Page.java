package Ast.nodes;

import java.util.ArrayList;
import java.util.List;

public class Page {
    private List<DefinitionPage> definitionPages = new ArrayList<>();
    private List<DefinitionController> definitionControllers = new ArrayList<>();


    public List<DefinitionPage> getDefinitionPages() {
        return definitionPages;
    }

    public void setDefinitionPages(List<DefinitionPage> definitionPages) {
        this.definitionPages = definitionPages;
    }

    public List<DefinitionController> getDefinitionControllers() {
        return definitionControllers;
    }

    public void setDefinitionControllers(List<DefinitionController> definitionControllers) {
        this.definitionControllers = definitionControllers;
    }
}
