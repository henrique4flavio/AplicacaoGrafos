package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import model.Aresta;

public class Grafo {

    private String id;
    private TipoGrafo ordenacao;
    private ArrayList<Vertice> listaVertice = new ArrayList<Vertice>();
    private ArrayList<Aresta> listaAresta = new ArrayList<Aresta>();

    public String getNome() {
        return id;
    }

    public Grafo(String id, TipoGrafo ordenacao) {
        this.id = id;
        this.ordenacao = ordenacao;

    }

    public Grafo(String id, TipoGrafo ordenacao, ArrayList<Vertice> listaVertice, ArrayList<Aresta> listaAresta) {
        this.id = id;
        this.ordenacao = ordenacao;
        this.listaVertice = listaVertice;
        this.listaAresta = listaAresta;

    }

    public Grafo() {

    }

    public ArrayList<Vertice> getListaVertice() {
        return listaVertice;
    }

    public void setListaVertice(Vertice v) {
        listaVertice.add(v);
    }

    public TipoGrafo getOrdenacao() {
        return ordenacao;
    }

    public void setOrdenacao(TipoGrafo ordenacao) {
        this.ordenacao = ordenacao;
    }

    public void setNome(String nome) {
        this.id = nome;
    }

    public ArrayList<Aresta> getListaAresta() {
        return listaAresta;
    }

    public void setListaAresta(Aresta a) {
        this.listaAresta.add(a);
    }

    public int[][] criarMatrizAdjacencia(Grafo a) {
        int[][] v = new int[a.getListaVertice().size()][a.getListaVertice().size()];
        for (int i = 0; i < a.getListaVertice().size(); i++) {
            for (int j = 0; i < a.getListaVertice().size(); i++) {
                v[i][j] = 0;
            }

        }
        if (a.getOrdenacao() == TipoGrafo.unidirected) {
            for (int i = 0; i < a.getListaVertice().size(); i++) {
                String vertice1 = a.getListaVertice().get(i).getId();
                for (int j = 0; j < a.getListaAresta().size(); j++) {
                    if (vertice1.equals(a.getListaAresta().get(j).getSource())) {
                        for (int k = 0; k < a.getListaVertice().size(); k++) {
                            String vertice2 = a.getListaVertice().get(k).getId();
                            if (vertice1.equals(a.getListaAresta().get(j).getSource()) && vertice2.equals(a.getListaAresta().get(j).getTarget())) {
                                v[i][k] = 1;
                                v[k][i] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }

        if (a.getOrdenacao() == TipoGrafo.directed) {
            for (int i = 0; i < a.getListaVertice().size(); i++) {
                String vertice1 = a.getListaVertice().get(i).getId();
                for (int j = 0; j < a.getListaAresta().size(); j++) {
                    if (vertice1.equals(a.getListaAresta().get(j).getSource())) {
                        for (int k = 0; k < a.getListaVertice().size(); k++) {
                            String vertice2 = a.getListaVertice().get(k).getId();
                            if (vertice1.equals(a.getListaAresta().get(j).getSource()) && vertice2.equals(a.getListaAresta().get(j).getTarget())) {
                                v[i][k] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return v;
    }

    public int[][] criarMatrizIncidencia(Grafo a) {
        int[][] v = new int[a.getListaVertice().size()][a.getListaAresta().size()];
        for (int i = 0; i < a.getListaVertice().size(); i++) {
            for (int j = 0; i < a.getListaVertice().size(); i++) {
                v[i][j] = 0;
            }

        }
        if (a.getOrdenacao() == TipoGrafo.unidirected) {
            for (int i = 0; i < a.getListaAresta().size(); i++) {
                String vertice1 = a.getListaAresta().get(i).getSource();
                String vertice2 = a.getListaAresta().get(i).getTarget();
                for (int k = 0; k < a.getListaVertice().size(); k++) {
                    if (vertice1.equals(a.getListaVertice().get(k).getId())) {
                        for (int j = 0; j < a.getListaVertice().size(); j++) {
                            if (vertice2.equals(a.getListaVertice().get(j).getId())) {
                                v[k][i] = 1;
                                v[j][i] = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (a.getOrdenacao() == TipoGrafo.directed) {
            for (int i = 0; i < a.getListaAresta().size(); i++) {
                String vertice1 = a.getListaAresta().get(i).getSource();
                String vertice2 = a.getListaAresta().get(i).getTarget();
                for (int k = 0; k < a.getListaVertice().size(); k++) {
                    if (vertice1.equals(a.getListaVertice().get(k).getId())) {
                        for (int j = 0; j < a.getListaVertice().size(); j++) {
                            if (vertice2.equals(a.getListaVertice().get(j).getId())) {
                                v[k][i] = 1;
                                v[j][i] = -1;
                                break;
                            }
                        }
                    }
                }
            }
        }

        return v;
    }

    public ArrayList<ArrayList> criarListaAdjacencia(Grafo a) {
        ArrayList<ArrayList> listaIncidencia = new ArrayList<ArrayList>();

        if (a.getOrdenacao() == TipoGrafo.directed) {
            for (int i = 0; i < a.getListaVertice().size(); i++) {
                ArrayList<String> lista = new ArrayList<String>();
                String vertice1 = a.getListaVertice().get(i).getId();
                lista.add(vertice1);
                for (int j = 0; j < a.getListaAresta().size(); j++) {
                    if (vertice1.equals(a.getListaAresta().get(j).getSource())) {
                        lista.add(a.getListaAresta().get(j).getTarget());
                    }
                }
                listaIncidencia.add(lista);
            }
        }

        if (a.getOrdenacao() == TipoGrafo.unidirected) {
            for (int i = 0; i < a.getListaVertice().size(); i++) {
                ArrayList<String> lista = new ArrayList<String>();
                String vertice1 = a.getListaVertice().get(i).getId();
                lista.add(vertice1);
                for (int j = 0; j < a.getListaAresta().size(); j++) {
                    if (vertice1.equals(a.getListaAresta().get(j).getSource()) || vertice1.equals(a.getListaAresta().get(j).getTarget())) {
                        if (vertice1.equals(a.getListaAresta().get(j).getSource())) {
                            lista.add(a.getListaAresta().get(j).getTarget());
                        } else {
                            lista.add(a.getListaAresta().get(j).getSource());
                        }
                    }
                }
                listaIncidencia.add(lista);
            }
        }
        return listaIncidencia;
    }

    public String formataArestas(ArrayList<Aresta> listaAdjacencia, String seta) {
        String arestasFormatadas = "";
        for (int i = 0; i < listaAdjacencia.size(); i++) {
            Aresta a = listaAdjacencia.get(i);
            arestasFormatadas = arestasFormatadas + a.getSource() + seta + a.getTarget() + "[label=" + a.getValor() + "]" + ";\n";
        }
        return arestasFormatadas;
    }

    public Grafo copiaGrafo(Grafo grafo, String nome) {
        ArrayList<Vertice> listaVertice2 = new ArrayList<Vertice>();
        ArrayList<Aresta> listaArestas2 = new ArrayList<Aresta>();
        for (Vertice n : grafo.getListaVertice()) {
            listaVertice2.add(n);
        }
        for (Aresta a : grafo.getListaAresta()) {
            listaArestas2.add(a);
        }
        Grafo g = new Grafo(nome, grafo.getOrdenacao(), listaVertice2, listaArestas2);
        return g;
    }

    public void novaListaAresta(ArrayList<Aresta> arestas) {
        this.listaAresta = new ArrayList<Aresta>();
        this.listaAresta = arestas;
    }

    public void novaListaVertice(ArrayList<Vertice> vertices) {
        this.listaVertice = new ArrayList<Vertice>();
        this.listaVertice = vertices;
    }

    public Vertice getVerticePorId(String id) {
        Vertice vertice = null;
        for (Vertice no : this.listaVertice) {
            if (no.getId().equals(id)) {
                vertice = no;
                break;
            }
        }
        return vertice;
    }

    public ArrayList<Aresta> buscaEmProfundidade(String raiz, String buscado) {

        ArrayList<Aresta> arvoreProfundidade = new ArrayList<Aresta>();
        if (buscaRecursiva(raiz, buscado) == true) {
            System.out.println("Vertice encontrado");
        } else {
            System.out.println("Vertice nao encontrado");
        }
        ArrayList<Aresta> arestas = this.getListaAresta();
        for (int i = 0; i < arestas.size(); i++) {
            System.out.println("" + this.getListaAresta());
            Aresta a = arestas.get(i);
            if (a.isVisitado() == true) {
                arvoreProfundidade.add(a);
                //arvoreProfundidade.add(this.getListaAresta()getId());
            }
        }

        return arvoreProfundidade;
    }

    public boolean buscaRecursiva(String raiz, String buscado) {

        int posRaiz = posicaoVertice(raiz);
        Vertice visitado = this.listaVertice.get(posRaiz);
        visitado.setVisitado(true);

        if (!raiz.equals(buscado)) {
            for (int i = 0; i < this.listaVertice.get(posRaiz).getVizinhos().size(); i++) {

                if (!this.listaVertice.get(posRaiz).getVizinhos().get(i).isVisitado()) {
                    //acha aresta entre eles e seta como visitada
                    this.acharAresta(this.listaVertice.get(posRaiz), this.listaVertice.get(posRaiz).getVizinhos().get(i)).setVisitado(true);
                    //continua busca recursivamente
                    if (this.buscaRecursiva(this.listaVertice.get(posRaiz).getVizinhos().get(i).getNome(), buscado)) {
                        return true;
                    }
                }
            }
        } else {
            return true;
        }
        return false;
    }

    public int posicaoVertice(String nome) {
        int i;

        for (i = 0; i < this.listaVertice.size(); i++) {
            if (this.listaVertice.get(i).getId().equals(nome)) {
                return i;
            }
        }

        //se nao encontrar retorna o tamanho da lista vertices
        return this.listaVertice.size();

    }

    public Aresta acharAresta(Vertice vet1, Vertice vet2) {
        for (int i = 0; i < this.listaAresta.size(); i++) {
            if (((this.listaAresta.get(i).getSource().equals(vet1.getNome()))
                    && (this.listaAresta.get(i).getTarget().equals(vet2.getNome())))
                    || ((this.listaAresta.get(i).getSource().equals(vet2.getNome()))
                    && (this.listaAresta.get(i).getTarget().equals(vet1.getNome())))) {
                return this.listaAresta.get(i);
            }
        }
        return null;
    }

    public ArrayList<Aresta> buscaEmLargura(String raiz, String buscado) {

        ArrayList<Aresta> arvoreLargura = new ArrayList<Aresta>();
        for (Vertice v : this.listaVertice) {
            v.setCor("branco");
        }

        Vertice v = this.acharVertice(raiz);
        v.setCor("cinza");

        LinkedList<Vertice> queue = new LinkedList<Vertice>();
        queue.add(v);
        boolean achou = false;
        while (queue.size() > 0) {
            Vertice current = queue.remove();
            current.setCor("preto");
            if (current.getNome().equals(buscado)) {
                achou = true;
                break;
            }

            for (Vertice visinho : current.getVizinhos()) {
                if (visinho.getCor().equals("branco")) {
                    visinho.setCor("cinza");
                    queue.add(visinho);
                    arvoreLargura.add(this.acharAresta(current, visinho));
                }
            }
        }

        if (achou) {
            System.out.println("Vertice encontrado");
        } else {
            System.out.println("Vertice nao encontrado");
        }

        return arvoreLargura;
    }

    public Vertice acharVertice(String nome) {
        return this.listaVertice.get(this.posicaoVertice(nome));
    }
}
