
package grafo;

import java.util.ArrayList;

public class Aresta {

    private Node source;
    private Node target;
    private Boolean directed;
    private static int id = 0;

    public Aresta(Node source, Node target) {
        this.id++;
        this.source = source;
        this.target = target;
        this.directed = false;
    }

    public Aresta(Node source, Node target, Boolean directed) {
        this.id++;
        this.source = source;
        this.target = target;
        this.directed = directed;
    }

    public int getId() {
        return id;
    }

    public Aresta() {

    }

    public Boolean getDirected() {
        return directed;
    }

    public Node getSource() {
        return source;
    }

    public Node getTarget() {
        return target;
    }

    

}
