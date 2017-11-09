
package grafo;

import java.util.ArrayList;
import java.util.Vector;


public class Graph {
    private ArrayList<Node> node  = new ArrayList<>();
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
    
    public int getIndiceNode(Node no) {
        int i;
        for (i = 0; i < this.getNode().size(); i++) {
            if (no.getId().equals(this.getNode().get(i).getId())) {
                return i;
            }
        }

        return -1;
    }

    public int getGrauVertice(Node n) {
        ArrayList<Aresta> arestas = new ArrayList<>();
        int grau = 0;
        arestas = this.getEdged(); // pegando as arestas da classe this

        for (Aresta a : arestas) {
            if (a.getSource().getId().equals(n.getId())) {
                grau++;
            }
            if (a.getTarget().getId().equals(n.getId())) {
                grau++;
            }

        }
        return grau;
    }
    

    private Boolean verificaBipartido(int indice, int vetor[]) {

        ArrayList<Node> adjacentes = this.getNosAdjacentes(this.node.get(indice));

        int i;
        for (i = 0; i < adjacentes.size(); i++) {
            int indiceNo = getIndiceNode(adjacentes.get(i));
            if (vetor[indiceNo] == -1) {
                if (vetor[indice] == 0) {
                    vetor[indiceNo] = 1;
                } else {
                    vetor[indiceNo] = 0;
                }
            } else if (vetor[indiceNo] == vetor[indice]) {
                return false;
            }
        }
        return true;
    }

    public String getTipoGrafo() {

        ArrayList<Node> vertices = this.getNode();
        String infoGrafo = "Tipo de Grafo: \n";

        Vector vetor = new Vector();
        int i;
        Boolean regular = true;
        for (Node v : vertices) {

            vetor.add(getGrauVertice(v));

        }
        for (i = 0; i < vetor.size(); i++) {
            int grau = (int) vetor.get(0);
            if (grau != (int) vetor.get(i)) {
                regular = false;
            }

        }
        if (regular == false) {
            infoGrafo += "";

        } else {
            infoGrafo += "\nRegular";

        }

        Boolean completo = true;

        int tamanho = vertices.size();

        for (Node v : vertices) {
            int grau = getGrauVertice(v);
            if (grau != tamanho - 1) {
                completo = false;
            }

        }
        if (completo == false) {
            infoGrafo += "";

        } else {
            infoGrafo += "\nCompleto";
        }

        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas = this.getEdged(); // pegando os vertices da classe this
        int cont = 0;
        int t = arestas.size();
        for (Aresta a : arestas) {

            for (Aresta b : arestas) {

                if (a.getSource().getId().equals(b.getSource().getId()) && a.getTarget().getId().equals(b.getTarget().getId())) {
                    cont++;
                }
            }
        }

        if (cont - t >= 2) {
            infoGrafo += "\nMultigrafo";

        } else {
            infoGrafo += "";

        }

        Boolean bipartido = true;

        int separacao[] = new int[this.getNode().size()];

        for (i = 0; i < separacao.length; i++) {
            separacao[i] = -1;
        }
        separacao[0] = 0;

        for (i = 0; i < separacao.length; i++) {
            if (!verificaBipartido(i, separacao)) {
                bipartido = false;
            }
        }
        if (bipartido == true) {
            infoGrafo += "\nBipartido";
        }
        return infoGrafo;
    }
     public ArrayList<Node> getCaminho(Node noAtual, Node noProcurado) {

        int i;
        ArrayList<Node> listaSaidas = new ArrayList<>();
        for (i = 0; i < this.edged.size(); i++) {
            if (noAtual.getId().equals(this.edged.get(i).getSource().getId())) {
                listaSaidas.add(this.edged.get(i).getTarget());
                if (this.edged.get(i).getTarget().getId().equals(noProcurado.getId())) {
                    ArrayList listaCaminho = new ArrayList();
                    listaCaminho.add(noProcurado);
                    listaCaminho.add(0, noAtual);
                    return listaCaminho;
                }
            }
        }
        if (listaSaidas.size() > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                ArrayList caminho = this.getCaminho(listaSaidas.get(j), noProcurado);
                if (caminho != null) {

                    caminho.add(0, noAtual);

                    return caminho;
                }
            }
        }

        return null;

    }
 public ArrayList<Node> getCadeia(Node noInicial, Node noProcurado) {

        int i;
        ArrayList<Node> listaSaidas = new ArrayList<>();
        ArrayList<Aresta> listaAux = new ArrayList<>();

        for (i = 0; i < this.edged.size(); i++) {
            if (this.getEdged().get(i).getDirected()) {
                if (noInicial.getId().equals(this.edged.get(i).getSource().getId())) {
                    listaSaidas.add(this.edged.get(i).getTarget());
                    listaAux.add(this.edged.get(i));
                    if (this.edged.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(listaCaminho.size(), noInicial);
                        return listaCaminho;
                    }
                }
            } else {
                if (noInicial.getId().equals(this.edged.get(i).getSource().getId())) {
                    listaSaidas.add(this.edged.get(i).getTarget());
                    listaAux.add(this.edged.get(i));
                    if (this.edged.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(0, noInicial);
                        return listaCaminho;
                    }
                } else if (noInicial.getId().equals(this.edged.get(i).getTarget().getId())) {
                    listaSaidas.add(this.edged.get(i).getSource());
                    listaAux.add(this.edged.get(i));
                    if (this.edged.get(i).getSource().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(0, noInicial);
                        return listaCaminho;
                    }
                }
            }
        }

        if (listaSaidas.size()
                > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                ArrayList<Aresta> listaPassagem = new ArrayList<>();
                listaPassagem.add(listaAux.get(j));
                ArrayList caminho = this.getCadeiaAuxiliar(listaSaidas.get(j), noProcurado, listaPassagem);
                if (caminho != null) {
                    caminho.add(0, noInicial);
                    return caminho;
                }
            }
        }
        return null;
    }
public ArrayList<Node> getCadeiaAuxiliar (Node noAtual, Node noProcurado, ArrayList<Aresta> listaPassagem) {

        int i, n;

        ArrayList<Node> listaSaidas = new ArrayList<>();
        ArrayList<Aresta> listaAuxPassagem = new ArrayList<>();
        ArrayList<Aresta> listaAuxEdge = new ArrayList<>();
        listaAuxEdge = this.getEdged();

        for (n = 0; n < this.edged.size(); n++) {
            if (listaPassagem.contains(listaAuxEdge.get(n))) {
                listaAuxEdge.remove(listaAuxEdge.get(n));
            }
        }

        for (i = 0; i < listaAuxEdge.size(); i++) {
            if (this.getEdged().get(i).getDirected()) {
                if (noAtual.getId().equals(listaAuxEdge.get(i).getSource().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getTarget());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(listaCaminho.size(), noAtual);
                        return listaCaminho;
                    }
                }
            } else {
                if (noAtual.getId().equals(listaAuxEdge.get(i).getSource().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getTarget());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getTarget().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(0, noAtual);
                        return listaCaminho;
                    }
                } else if (noAtual.getId().equals(listaAuxEdge.get(i).getTarget().getId())) {
                    listaSaidas.add(listaAuxEdge.get(i).getSource());
                    listaAuxPassagem.add(listaAuxEdge.get(i));
                    if (listaAuxEdge.get(i).getSource().getId().equals(noProcurado.getId())) {
                        ArrayList listaCaminho = new ArrayList();
                        listaCaminho.add(noProcurado);
                        listaCaminho.add(0, noAtual);
                        return listaCaminho;
                    }
                }
            }

        }

        if (listaSaidas.size()
                > 0) {
            int j;

            for (j = 0; j < listaSaidas.size(); j++) {
                listaPassagem.add(listaAuxPassagem.get(j));
                ArrayList caminho = this.getCadeiaAuxiliar(listaSaidas.get(j), noProcurado, listaPassagem);
                if (caminho != null) {
                    caminho.add(0, noAtual);
                    return caminho;
                }
            }
        }

        return null;
    }
public int[][] getMatrizAdjacencia() {

        int n = this.getNode().size();
        int m = this.getEdged().size();
        int[][] matrizAdjacencia = new int[n][n];
        int i, j, k;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                boolean teste = this.isAdjacente(this.getNode().get(i), this.getNode().get(j));
                if (teste) {
                    for (k = 0; k < m; k++) {
                        for (k = 0; k < m; k++) {
                            if (this.getEdged().get(k).getDirected()) {
                                if (this.edged.get(k).getSource().getId().equals(this.getNode().get(i).getId())
                                        && this.edged.get(k).getTarget().getId().equals(this.getNode().get(j).getId())) {
                                    matrizAdjacencia[i][j] = 1;

                                }
                            } else {
                                matrizAdjacencia[i][j] = 1;

                            }
                        }

                    }

                }
            }

        }
        return matrizAdjacencia;
    }
 public boolean isAdjacente(Node no1, Node no2) {
        int i;
        for (i = 0; i < this.edged.size(); i++) {
            if (this.edged.get(i).getSource().getId().equals(no1.getId()) && this.edged.get(i).getTarget().getId().equals(no2.getId())
                    || this.edged.get(i).getSource().getId().equals(no2.getId()) && this.edged.get(i).getTarget().getId().equals(no1.getId())) {

                return true;
            }
        }
        return false;
    }

    public Aresta getAdjacenteEdge(Node no1, Node no2) {
        int i;
        for (i = 0; i < this.edged.size(); i++) {
            if (this.edged.get(i).getSource() == no1 && this.edged.get(i).getTarget() == no2) {
                return this.edged.get(i);
            }
            if (this.edged.get(i).getSource() == no2 && this.edged.get(i).getTarget() == no1) {
                return this.edged.get(i);
            }

        }
        return null;
    }

    public ArrayList<Node> getNosAdjacentes(Node no1) {
        ArrayList<Node> adjacentes = new ArrayList<>();
        int i;
        for (i = 0; i < this.getNode().size(); i++) {
            if (this.isAdjacente(no1, this.getNode().get(i))) {
                adjacentes.add(this.getNode().get(i));
            }
        }

        return adjacentes;
    }

    public ArrayList<ArrayList<Node>> getListaDeAdjacencia() {
        int i, j;
        ArrayList<ArrayList<Node>> lista = new ArrayList<>();
        for (i = 0; i < this.node.size(); i++) {
            ArrayList<Node> listaAux = new ArrayList<>();
            for (j = 0; j < this.edged.size(); j++) {
                if (this.edged.get(j).getDirected()) {
                    if (this.edged.get(j).getSource().getId().equals(this.node.get(i).getId())) {
                        listaAux.add(this.edged.get(j).getTarget());
                    }
                } else {
                    if (this.edged.get(j).getSource().getId().equals(this.node.get(i).getId())) {
                        listaAux.add(this.edged.get(j).getTarget());
                    }
                    if (this.edged.get(j).getTarget().getId().equals(this.node.get(i).getId())) {
                        listaAux.add(this.edged.get(j).getSource());
                    }
                }
            }
            lista.add(listaAux);
        }
        return lista;
    }

    public int[][] getMatrizIncidencia() {
        int linha = this.getNode().size();
        int coluna = this.getEdged().size();
        int[][] matrizIncidencia = new int[linha][coluna];
        int i, j;
        for (i = 0; i < linha; i++) {
            for (j = 0; j < coluna; j++) {
                if (this.getEdged().get(j).getDirected()) {

                    if (this.getNode().get(i).getId().equals(this.getEdged().get(j).getSource().getId()) && this.getNode().get(i).getId().equals(this.getEdged().get(j).getTarget().getId())) {
                        matrizIncidencia[i][j] = 2;
                    } else {
                        if (this.getNode().get(i).getId().equals(this.getEdged().get(j).getSource().getId())) {
                            matrizIncidencia[i][j] = 1;
                        }
                        if (this.getNode().get(i).getId().equals(this.getEdged().get(j).getTarget().getId())) {
                            matrizIncidencia[i][j] = -1;
                        }
                    }
                } else {
                    if (this.getNode().get(i).getId().equals(this.getEdged().get(j).getSource().getId()) && this.getNode().get(i).getId().equals(this.getEdged().get(j).getTarget().getId())) {
                        matrizIncidencia[i][j] = 2;
                    } else if ((this.getNode().get(i).getId().equals(this.getEdged().get(j).getSource().getId()))
                            || (this.getNode().get(i).getId().equals(this.getEdged().get(j).getTarget().getId()))) {
                        matrizIncidencia[i][j] = 1;

                    }
                }
            }
        }

        return matrizIncidencia;
    }



     
}
     

