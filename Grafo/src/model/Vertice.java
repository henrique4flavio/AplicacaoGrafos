
package model;

import java.util.List;


public class Vertice {
    
    private String id;

    public Vertice(String id) {
        this.id = id;
        
    }
    public Vertice() {
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.id = nome;
    }
    public static Vertice getVerticeById(String id, List<Vertice> nos) {
        for (Vertice no : nos) {
            if (no.getId().equals(id)) {
                return no;
            }
        }
        return null;
    }
}
