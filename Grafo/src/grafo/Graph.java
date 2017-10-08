package grafo;

import java.util.ArrayList;
import javafx.scene.Node;

public class Graph {

    private ArrayList<Node> node = new ArrayList<>();
    private ArrayList<Aresta> edged = new ArrayList<>();

    public ArrayList<Node> getNode() {
        return node;
    }

    public void setNode(ArrayList<Node> node) {
        this.node = node;
    }

    public ArrayList<Aresta> getEdged() {
        return edged;
    }

    public void setEdged(ArrayList<Aresta> edged) {
        this.edged = edged;
    }

}
