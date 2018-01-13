package model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String id;
    private int visitado = 0;
    private double distancia = Double.POSITIVE_INFINITY;
 private final ArrayList<Arco> arcos = new ArrayList();
    
    private ArrayList incidentes = new ArrayList();
    private ArrayList vizinhos = new ArrayList();

    public Vertice(String id) {
        this.id = id;

    }

    public ArrayList<Aresta> getIncidentes() {
        return incidentes;
    }

    public void setIncidentes(ArrayList<Aresta> incidentes) {
        this.incidentes = incidentes;
    }

    public Vertice() {
    }

    public String getId() {
        return id;
    }

    public void setNome(String nome) {
        this.id = nome;
    }

    public String getNome() {
        return id;
    }

    public static Vertice getVerticeById(String id, List<Vertice> nos) {
        for (Vertice no : nos) {
            if (no.getId().equals(id)) {
                return no;
            }
        }
        return null;
    }

    public void zerarVisitas() {
        this.visitado = 0;
    }

    public void zerarDistancia() {
        this.distancia = Double.POSITIVE_INFINITY;
    }

    public void visitar() {
        this.visitado++;
    }
    public double obterDistancia() {
        return this.distancia;
    }
    public void definirDistancia(double distancia) {
        this.distancia = distancia;
    }
    public int obterVisitado() {
        return this.visitado;
    }
     public ArrayList<Arco> obterArcos() {
        return this.arcos;
    }
}
