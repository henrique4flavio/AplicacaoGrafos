package model;

import java.util.ArrayList;
import java.util.List;

public class Vertice {

    private String id;

    private double distancia = Double.POSITIVE_INFINITY;
    private final ArrayList<Arco> arcos = new ArrayList();

    private ArrayList incidentes = new ArrayList();
    private ArrayList vizinhos = new ArrayList();

    private boolean visitado = false;

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

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public static Vertice getVerticeById(String id, List<Vertice> nos) {
        for (Vertice no : nos) {
            if (no.getId().equals(id)) {
                return no;
            }
        }
        return null;
    }

    public void zerarDistancia() {
        this.distancia = Double.POSITIVE_INFINITY;
    }

    public double obterDistancia() {
        return this.distancia;
    }

    public void definirDistancia(double distancia) {
        this.distancia = distancia;
    }

    public ArrayList<Arco> obterArcos() {
        return this.arcos;
    }

    public ArrayList<Vertice> getVizinhos() {
        return vizinhos;
    }

    public void addIncidentes(Aresta incide) {
        this.incidentes.add(incide);

        //adicionando vizinhos a lista
        if ((incide.getSource().equals(this.getNome()))
                && (!this.isVizinho(incide.getTarget()))) {

            this.addVizinhos(incide.getTarget());

        } else if ((incide.getTarget().equals(this.getNome()))
                && (!this.isVizinho(incide.getSource()))) {

            this.addVizinhos(incide.getSource());
        }
    }

    public void addVizinhos(String vizinho) {
        this.vizinhos.add(vizinho);
    }
    public boolean isVizinho(String vizinho){
		int i;
		
		for (i=0; i<this.vizinhos.size() ; i++)
			if (this.vizinhos.get(i).equals(vizinho))
				return true;		
		
		return false;
	}

}
