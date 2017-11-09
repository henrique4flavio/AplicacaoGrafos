package grafo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    String opcaoGrafo;
    int grafoOrientado;
    int grafoNaoOrientado;
    Graph graph = new Graph();
    public Principal() {
        
        int i;
        initComponents();
        int resultado = 0;
        while (resultado == 0) {
            opcaoGrafo = JOptionPane.showInputDialog("Digite tipo de Grafo:  \n 1-Orientado \n 2-Nao Orientado");
            resultado = opcaoTipoGrafo(opcaoGrafo);

    }
    
    //Aresta aresta = new Aresta();
    }
    public void acaobotaolimpa() {
        origem.setText("");
        destino.setText("");
        vertices.setText("");
        removerVertice.setText("");
        excluirOrigem.setText(""); // campos da interface grafica
        excluirDestino.setText("");

    }
    public Boolean verificaNo(String vertice) {
        ArrayList<Node> vertices = new ArrayList<>();
        vertices = graph.getNode(); // pegando os vertices da classe graph

        for (Node n : vertices) {

            if (vertice.equals(n.getId())) {
                return true;

            }

        }
        return false;
    }

    public int getIndiceNode(Node no) {
        int i;
        for (i = 0; i < graph.getNode().size(); i++) {
            if (no.getId().equals(graph.getNode().get(i).getId())) {
                return i;
            }
        }

        return -1;
    }
public int opcaoTipoGrafo(String opcaoGrafo) {
        if (this.opcaoGrafo.equals("1")) {

            this.grafoOrientado = 1;

            return 1;

        }
        if (opcaoGrafo.equals("2")) {
            this.grafoNaoOrientado = 2;
            return 1;
        }
        return 0; // retorna zero caso nenhuma dessas opções for realizada.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        BotaoSalvarXml = new javax.swing.JButton();
        BotaoVisualizarGrafo = new javax.swing.JButton();
        AdicionarVertices = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tipoGrafo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        infoGrafico = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaRepresentacao = new javax.swing.JTextArea();
        vertices1 = new javax.swing.JTextField();
        removerVertice = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        origem = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        botaoAdionarAresta = new javax.swing.JButton();
        excluirOrigem1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        excluirDestino1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        botaoRemoverAresta1 = new javax.swing.JButton();
        matrizAdjacencia = new javax.swing.JButton();
        listaAdjacencia = new javax.swing.JButton();
        matrizIncidencia = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotaoSalvarXml.setText("Salvar XML");
        BotaoSalvarXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSalvarXmlActionPerformed(evt);
            }
        });

        BotaoVisualizarGrafo.setText("Abrir Grafo");
        BotaoVisualizarGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoVisualizarGrafoActionPerformed(evt);
            }
        });

        AdicionarVertices.setText("Adicionar Vertices");
        AdicionarVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionarVerticesActionPerformed(evt);
            }
        });

        botaoRemover.setText("Remover Vertice");
        botaoRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverActionPerformed(evt);
            }
        });

        jLabel6.setText("Origem");

        jLabel7.setText("Destino");

        tipoGrafo.setText("Tipo do Grafo");
        tipoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoGrafoActionPerformed(evt);
            }
        });

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ordem do Grafo", "Vertice", "Emissao", "Vertice", "Recepção", "Fonte", "Sumidouro", "Adjascencia", "cadeia", "simples", "elementar", "caminho"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabela);

        infoGrafico.setText("Informacoes do Grafico");
        infoGrafico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoGraficoActionPerformed(evt);
            }
        });

        areaRepresentacao.setEditable(false);
        areaRepresentacao.setColumns(20);
        areaRepresentacao.setRows(5);
        jScrollPane3.setViewportView(areaRepresentacao);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Vertices: ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Arestas: ");

        jLabel10.setText("Origem");

        jLabel11.setText("Destino");

        origem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                origemActionPerformed(evt);
            }
        });

        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoActionPerformed(evt);
            }
        });

        botaoAdionarAresta.setText("Adicionar Aresta");
        botaoAdionarAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdionarArestaActionPerformed(evt);
            }
        });

        jLabel12.setText("Origem");

        jLabel13.setText("Destino");

        botaoRemoverAresta1.setText("Remover Aresta");
        botaoRemoverAresta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverAresta1ActionPerformed(evt);
            }
        });

        matrizAdjacencia.setText("Matriz de Adjacências");
        matrizAdjacencia.setToolTipText("");
        matrizAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizAdjacenciaActionPerformed(evt);
            }
        });

        listaAdjacencia.setText("Listas de Adjacências");
        listaAdjacencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAdjacenciaActionPerformed(evt);
            }
        });

        matrizIncidencia.setText("Matriz de Incidências");
        matrizIncidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrizIncidenciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 707, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(vertices1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                            .addComponent(removerVertice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AdicionarVertices)
                            .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluirDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(59, 59, 59)
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(excluirOrigem1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoSalvarXml)
                                    .addComponent(BotaoVisualizarGrafo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoAdionarAresta)
                                .addGap(27, 27, 27)
                                .addComponent(botaoRemoverAresta1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(infoGrafico)
                        .addGap(238, 238, 238)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(matrizAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                    .addComponent(listaAdjacencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(matrizIncidencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tipoGrafo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(matrizAdjacencia)
                        .addGap(18, 18, 18)
                        .addComponent(listaAdjacencia)
                        .addGap(18, 18, 18)
                        .addComponent(matrizIncidencia)
                        .addGap(18, 18, 18)
                        .addComponent(tipoGrafo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(AdicionarVertices)
                                            .addComponent(vertices1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel10)
                                            .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(excluirOrigem1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel12))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(removerVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botaoRemover)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel11)
                                            .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(excluirDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel13))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(botaoAdionarAresta)
                                            .addComponent(botaoRemoverAresta1)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(BotaoSalvarXml)
                                        .addGap(18, 18, 18)
                                        .addComponent(BotaoVisualizarGrafo))))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(infoGrafico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSalvarXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSalvarXmlActionPerformed

        XStream xStream = new XStream(new DomDriver());  
         

      xStream.alias("graph",Graph.class);  
      xStream.alias("node",Node.class);  
      xStream.alias("edge",Aresta.class);  
      
      
      xStream.addImplicitCollection(Graph.class,"node");
      xStream.addImplicitCollection(Graph.class,"edged");
      xStream.useAttributeFor(Node.class,"id");
      
      
         xStream.useAttributeFor(Aresta.class,"source");
          xStream.useAttributeFor(Aresta.class,"target");
          
       File xmlFile = new File("ArquivoXML.xml");
      
       

        try {
            xStream.toXML(graph, new FileWriter(xmlFile));
            JOptionPane.showMessageDialog(null, "Criado com Sucesso!!!");
        } catch (IOException ex) {
            System.out.println("Erro ao criar o arquivo");
        }
        acaobotaolimpa();
    }//GEN-LAST:event_BotaoSalvarXmlActionPerformed

    private void BotaoVisualizarGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoVisualizarGrafoActionPerformed
        XStream xStream = new XStream(new DomDriver());

        xStream.alias("graph", Graph.class);
        xStream.alias("node", Node.class);
        xStream.alias("edge", Aresta.class);
        xStream.addImplicitCollection(Graph.class, "node");
        xStream.addImplicitCollection(Graph.class, "edged");
        xStream.useAttributeFor(Node.class, "id");

        xStream.useAttributeFor(Aresta.class, "source");
        xStream.useAttributeFor(Aresta.class, "target");
        File xmlFile = new File("ArquivoXML.xml");
        Graph grafo = (Graph) xStream.fromXML(xmlFile);

        JOptionPane.showMessageDialog(null, "Grafo: " + grafo.getEdged());

    }//GEN-LAST:event_BotaoVisualizarGrafoActionPerformed

    private void AdicionarVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionarVerticesActionPerformed
        if (verificaNo(vertices.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Vertice já existente!");
            acaobotaolimpa();
        } else {

            graph.getNode().add(new Node(vertices.getText()));
            JOptionPane.showMessageDialog(rootPane, "Adicionado com Sucesso");
            acaobotaolimpa();
        }
    }//GEN-LAST:event_AdicionarVerticesActionPerformed

    private void botaoRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverActionPerformed

        if (verificaNo(removerVertice.getText())) {
            ArrayList<Node> vertices = new ArrayList<>();
            vertices = graph.getNode(); // pegando os vertices da classe graph

            String excluir = removerVertice.getText();

            for (Node n : vertices) {

                String v = n.getId();

                if (v.equals(excluir)) {

                    vertices.remove(n);

                    graph.setNode(vertices);
                    break;

                }

            }
            acaobotaolimpa();
            JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso");
        } else {
            JOptionPane.showMessageDialog(rootPane, "O vertice digitado não existe!");
            acaobotaolimpa();

        }
    }//GEN-LAST:event_botaoRemoverActionPerformed

    private void tipoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoGrafoActionPerformed
        String infoGrafo = "";
        infoGrafo = graph.getTipoGrafo();

        areaRepresentacao.setText(infoGrafo);
    }//GEN-LAST:event_tipoGrafoActionPerformed

    private void infoGraficoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoGraficoActionPerformed
        // TODO add your handling code here:
        int numeroVertice = graph.getNode().size(); // Ordem de um grafo.
        System.out.println(numeroVertice);
        ArrayList<Node> vertices = new ArrayList<>();
        vertices = graph.getNode();
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas = graph.getEdged();
        // calculando a ordem do grafo
        Vector Ordem = new Vector();
        Vector VerticeFonteOrientado = new Vector();
        Vector VerticeSumidouroOrientado = new Vector();
        Ordem.add(numeroVertice); // adionando o valor da ordem do grafo em um vetor
        //  DefaultTableModel val = (DefaultTableModel) tabela.getModel();
        DefaultTableModel val = (DefaultTableModel) tabela.getModel();

        val.addRow(Ordem);// passa o objeto para adicionar na tabela
        //Vector Grau = new Vector();
        // for onde calculao grau de Emissao de cada vertice caso o grafo nao for orientado.

        if (grafoNaoOrientado == 2) {
            for (Node n : vertices) {
                Vector Grau = new Vector();
                int grau = 0;
                String vertice = n.getId();

                for (Aresta a : arestas) {
                    String source = a.getSource().getId();
                    String target = a.getTarget().getId();

                    if (vertice.equals(source) || vertice.equals(target)) {
                        // HashSet g = new HashSet();
                        grau++;

                        Grau.add("");

                        if (Grau.contains(vertice)) {
                            int i = Grau.indexOf(vertice);
                            // retornando o index do vertice
                            Grau.set(i + 1, grau);
                            //Grau.indexOf(grau,)
                            // Grau.add(grau);
                        } else {

                            Grau.add(vertice);
                            Grau.add(grau);
                        }

                        // foi adionado o "" para que a primeira coluna comece com zero
                    }

                }
                val.addRow(Grau);

            }
        }
        // emissao do grafo orientado
        if (grafoOrientado == 1) {
            // Vector Grau = new Vector();
            for (Node n : vertices) {
                Vector Grau = new Vector();
                int grau = 0;
                String vertice = n.getId();

                for (Aresta a : arestas) {
                    String source = a.getSource().getId();
                    String target = a.getTarget().getId();

                    if (vertice.equals(source)) {
                        // HashSet g = new HashSet();
                        grau++;

                        Grau.add("");
                        VerticeSumidouroOrientado.add(vertice);
                        VerticeSumidouroOrientado.add(grau);
                        if (Grau.contains(vertice)) {
                            int i = Grau.indexOf(vertice);
                            // retornando o index do vertice
                            Grau.set(i + 1, grau);

                            int j = VerticeSumidouroOrientado.indexOf(vertice);
                            VerticeSumidouroOrientado.set(j + 1, grau);
                        } else {

                            Grau.add(vertice);
                            Grau.add(grau);

                            VerticeSumidouroOrientado.add(vertice);
                            VerticeSumidouroOrientado.add(grau);
                        }

                        // foi adionado o "" para que a primeira coluna comece com zero
                    } else if (Grau.contains(vertice)) {

                    } else {
                        Grau.add("");
                        Grau.add(vertice);
                        Grau.add(grau);

                        VerticeSumidouroOrientado.add(vertice);
                        VerticeSumidouroOrientado.add(grau);
                    }

                }

                val.addRow(Grau);
            }

        }
        // contagem dos vertices sumidouro do grafo orientado.
        if (grafoOrientado == 1) {
            for (Node n : vertices) {
                Vector vet = new Vector();
                if ((VerticeSumidouroOrientado.contains(n.getId()))) {
                    int indexVertice = VerticeSumidouroOrientado.indexOf(n.getId());

                    int grauVertice = (int) VerticeSumidouroOrientado.get(indexVertice + 1);
                    String verticeFonte = n.getId();
                    if (grauVertice == 0) {
                        vet.add("");
                        vet.add("");
                        vet.add("");
                        vet.add("");
                        vet.add("");
                        vet.add("");

                        vet.add(verticeFonte);

                        System.out.println("" + vet);
                        // val.addRow(vet);
                    }
                    // val.addRow(vet);
                }
                val.addRow(vet);

            }
            //val.addRow(vet);

        }
        // Recepção de um grafo orientado.
        if (grafoOrientado == 1) {
            for (Node n : vertices) {
                Vector Grau = new Vector();
                int grau = 0;
                String vertice = n.getId();

                for (Aresta a : arestas) {
                    String source = a.getSource().getId();
                    String target = a.getTarget().getId();

                    if (vertice.equals(target)) {
                        // HashSet g = new HashSet();
                        grau++;

                        Grau.add("");
                        Grau.add("");
                        Grau.add("");
                        VerticeFonteOrientado.add(vertice);
                        VerticeFonteOrientado.add(grau);

                        if (Grau.contains(vertice)) {
                            int i = Grau.indexOf(vertice);
                            // retornando o index do vertice
                            Grau.set(i + 1, grau);

                            int j = VerticeFonteOrientado.indexOf(vertice);
                            VerticeFonteOrientado.set(j + 1, grau);
                            //Grau.indexOf(grau,)
                            // Grau.add(grau);
                        } else {

                            Grau.add(vertice);
                            Grau.add(grau);
                            VerticeFonteOrientado.add(vertice);
                            VerticeFonteOrientado.add(grau);
                        }

                        // foi adionado o "" para que a primeira coluna comece com zero
                    } else if (Grau.contains(vertice)) {

                    } else {
                        Grau.add("");
                        Grau.add("");
                        Grau.add("");
                        Grau.add(vertice);
                        Grau.add(grau);

                        VerticeFonteOrientado.add(vertice);
                        VerticeFonteOrientado.add(grau);

                    }

                }
                val.addRow(Grau);

            }
        }
        // fazendo a contagem dos vertices fontes orientado.
        if (grafoOrientado == 1) {
            for (Node n : vertices) {
                Vector vet = new Vector();
                if ((VerticeFonteOrientado.contains(n.getId()))) {
                    int indexVertice = VerticeFonteOrientado.indexOf(n.getId());

                    int grauVertice = (int) VerticeFonteOrientado.get(indexVertice + 1);
                    String verticeFonte = n.getId();
                    if (grauVertice == 0) {
                        vet.add("");
                        vet.add("");
                        vet.add("");
                        vet.add("");
                        vet.add("");

                        vet.add(verticeFonte);

                        System.out.println("" + vet);
                        // val.addRow(vet);
                    }
                    // val.addRow(vet);
                }
                val.addRow(vet);

            }
            //val.addRow(vet);

        }
        if (grafoNaoOrientado == 2) {
            for (Node n : vertices) {
                Vector Grau = new Vector();
                int grau = 0;
                String vertice = n.getId();

                for (Aresta a : arestas) {
                    String source = a.getSource().getId();
                    String target = a.getTarget().getId();

                    if (vertice.equals(source) || vertice.equals(target)) {
                        // HashSet g = new HashSet();
                        grau++;

                        Grau.add("");
                        Grau.add("");
                        Grau.add("");
                        //VerticeFonteNaoOrientado.add(vertice);
                        //VerticeFonteNaoOrientado.add(grau);

                        if (Grau.contains(vertice)) {
                            int i = Grau.indexOf(vertice);
                            // retornando o index do vertice
                            Grau.set(i + 1, grau);

                            int j = Grau.indexOf(vertice);
                            Grau.set(j + 1, grau);
                            //Grau.indexOf(grau,)
                            // Grau.add(grau);
                        } else {

                            Grau.add(vertice);
                            Grau.add(grau);
                        }

                        // foi adionado o "" para que a primeira coluna comece com zero
                    }

                }
                val.addRow(Grau);

            }
        }

        // Mostrando a adjascencia do grafo.
        Vector incidencia = new Vector();
        for (Aresta a : arestas) {
            String source = a.getSource().getId();
            String target = a.getTarget().getId();
            //Vector incidencia = new Vector();
            incidencia.add("");
            incidencia.add("");
            incidencia.add("");
            incidencia.add("");
            incidencia.add("");
            incidencia.add("");
            incidencia.add("");

            incidencia.add("" + source + "-" + "" + target);

        }
        val.addRow(incidencia);
        //cadeira de um grafo.
        Vector cadeia = new Vector();

        Aresta a = arestas.get(0);
        String source = a.getSource().getId();
        String target = a.getTarget().getId();
        //Vector incidencia = new Vector();
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        cadeia.add("");
        //cadeia.add("");

        cadeia.add("" + source + "-" + target);

        val.addRow(cadeia);
        /// grafo orintado-> verificacao se é elementar.

        /* Importante !!!
        InformacoesGrafico telaInfo= new InformacoesGrafico();
        telaInfo.setVisible(true);
        // dispose fecha a tela anterior
        dispose();
        */
    }//GEN-LAST:event_infoGraficoActionPerformed

    private void origemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_origemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_origemActionPerformed

    private void destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinoActionPerformed

    private void botaoAdionarArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdionarArestaActionPerformed
        // TODO add your handling code here:
        if (verificaNo(origem.getText()) && verificaNo(destino.getText())) {

            Node source = new Node(origem.getText());
            Node target = new Node(destino.getText());

            Aresta aresta = new Aresta(source, target, rootPaneCheckingEnabled);

            ArrayList arestas = new ArrayList();
            arestas.add(aresta);
            graph.addAresta(aresta);
            //graph.getEdged().add(aresta);
            JOptionPane.showMessageDialog(rootPane, "Adicionado com Sucesso");
            acaobotaolimpa(); // botao que limpa o campo.
        } else {
            JOptionPane.showMessageDialog(rootPane, "Vertice Informado não existe!");
            acaobotaolimpa(); // botao que limpa o campo.

        }
    }//GEN-LAST:event_botaoAdionarArestaActionPerformed

    private void botaoRemoverAresta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverAresta1ActionPerformed
        ArrayList<Aresta> arestas = new ArrayList<>();
        arestas = graph.getEdged(); // pegando os vertices da classe graph

        String origem = excluirOrigem.getText(); // campos da interface grafica
        String destino = excluirDestino.getText();

        for (Aresta a : arestas) {

            Node source = a.getSource();
            Node target = a.getTarget();

            if (origem.equals(source) && destino.equals(target)) {

                arestas.remove(a);

                graph.setEdged(arestas);
                break;

            }

        }
        acaobotaolimpa();
        JOptionPane.showMessageDialog(rootPane, "Excluido com Sucesso");

    }//GEN-LAST:event_botaoRemoverAresta1ActionPerformed

    private void matrizAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizAdjacenciaActionPerformed
        if (graph == null) {
            JOptionPane.showMessageDialog(this, "Grafo nulo!!!");
        } else {
            if (graph.getEdged().size() > 0) {
                int n = graph.getNode().size();
                //int m = grafo.getEdges().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < n; i++) {
                    str += graph.getNode().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < n; i++) {
                    str += graph.getNode().get(i).getId() + " :\t";
                    for (j = 0; j < n; j++) {

                        str += graph.getMatrizAdjacencia()[i][j] + "\t";

                    }
                    str += "\n";
                }
                areaRepresentacao.setText(str);
            } else {

            }

        }
    }//GEN-LAST:event_matrizAdjacenciaActionPerformed

    private void listaAdjacenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAdjacenciaActionPerformed
        if (graph == null) {
            JOptionPane.showMessageDialog(this, "Grafo nulo!!!");

        } else {
            if (graph.getEdged().size() > 0) {
                int i, j;

                String str = "";
                for (i = 0; i < graph.getListaDeAdjacencia().size(); i++) {
                    str += graph.getNode().get(i).getId() + " :\t";
                    ArrayList<Node> listaNo = graph.getListaDeAdjacencia().get(i);

                    System.out.println(listaNo.size());
                    for (j = 0; j < listaNo.size(); j++) {

                        str += listaNo.get(j).getId() + "  ";
                    }
                    str += "\n";

                }
                System.out.println(str);
                areaRepresentacao.setText(str);
            }

        }
    }//GEN-LAST:event_listaAdjacenciaActionPerformed

    private void matrizIncidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrizIncidenciaActionPerformed
        if (graph == null) {
            JOptionPane.showMessageDialog(this, "Grafo nulo!!!");

        } else {
            if (graph.getEdged().size() > 0) {
                int linha = graph.getNode().size();
                int coluna = graph.getEdged().size();
                int i, j;
                String str = "\t";
                for (i = 0; i < coluna; i++) {
                    str += graph.getEdged().get(i).getId() + "\t";
                }
                str += "\n";
                for (i = 0; i < linha; i++) {
                    str += graph.getNode().get(i).getId() + " :\t";
                    for (j = 0; j < coluna; j++) {

                        str += graph.getMatrizIncidencia()[i][j] + "\t";

                    }
                    str += "\n";

                }
                str += "Legenda:";
                str += "\n";
                str += "1: Saida";
                str += "\n";
                str += "-1: Chegada";
                str += "\n";
                str += "2: Saida e chegada";
                areaRepresentacao.setText(str);
            }

        }
    }//GEN-LAST:event_matrizIncidenciaActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    private javax.swing.JTextField excluirDestino;
    private javax.swing.JTextField excluirOrigem;
    private javax.swing.JTextField vertices;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarVertices;
    private javax.swing.JButton BotaoSalvarXml;
    private javax.swing.JButton BotaoVisualizarGrafo;
    private javax.swing.JTextArea areaRepresentacao;
    private javax.swing.JButton botaoAdionarAresta;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoRemoverAresta1;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField excluirDestino1;
    private javax.swing.JTextField excluirOrigem1;
    private javax.swing.JButton infoGrafico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton listaAdjacencia;
    private javax.swing.JButton matrizAdjacencia;
    private javax.swing.JButton matrizIncidencia;
    private javax.swing.JTextField origem;
    private javax.swing.JTextField removerVertice;
    private javax.swing.JTable tabela;
    private javax.swing.JButton tipoGrafo;
    private javax.swing.JTextField vertices1;
    // End of variables declaration//GEN-END:variables
}
