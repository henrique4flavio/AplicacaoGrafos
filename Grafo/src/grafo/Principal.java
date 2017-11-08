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
        Origem.setText("");
        destino.setText("");
        vertices.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        vertices = new javax.swing.JTextField();
        Origem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BotaoSalvarXml = new javax.swing.JButton();
        BotaoVisualizarGrafo = new javax.swing.JButton();
        AdicionarVertices = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        origem = new javax.swing.JTextField();
        destino = new javax.swing.JTextField();
        botaoAdionarAresta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botaoRemoverAresta = new javax.swing.JButton();
        excluirOrigem = new javax.swing.JTextField();
        excluirDestino = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tipoGrafo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        infoGrafico = new javax.swing.JButton();
        infoGrafico1 = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vertices ");

        vertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticesActionPerformed(evt);
            }
        });

        Origem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigemActionPerformed(evt);
            }
        });

        jLabel3.setText("Arestas");

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

        jLabel6.setText("Origem");

        jLabel7.setText("Destino");

        botaoRemoverAresta.setText("Remover Aresta");
        botaoRemoverAresta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRemoverArestaActionPerformed(evt);
            }
        });

        jLabel8.setText("Origem");

        jLabel9.setText("Destino");

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

        infoGrafico1.setText("Informacoes do Grafico");
        infoGrafico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoGrafico1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(excluirOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(excluirDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(BotaoSalvarXml)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotaoVisualizarGrafo)
                    .addComponent(botaoRemoverAresta)
                    .addComponent(botaoAdionarAresta, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(vertices, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Origem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(AdicionarVertices)
                                .addGap(57, 57, 57))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tipoGrafo)
                                .addGap(48, 48, 48))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoGrafico1)
                        .addGap(348, 348, 348))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(421, 421, 421)
                    .addComponent(infoGrafico)
                    .addContainerGap(421, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdicionarVertices))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoRemover)
                    .addComponent(tipoGrafo))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(origem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdionarAresta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(excluirOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(excluirDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoRemoverAresta)
                        .addGap(18, 18, 18)
                        .addComponent(BotaoSalvarXml)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoVisualizarGrafo)
                        .addGap(15, 15, 15))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoGrafico1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(204, 204, 204)
                    .addComponent(infoGrafico)
                    .addContainerGap(210, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigemActionPerformed
    }//GEN-LAST:event_OrigemActionPerformed

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

    private void verticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verticesActionPerformed

    }//GEN-LAST:event_verticesActionPerformed

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

    private void botaoRemoverArestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRemoverArestaActionPerformed
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

    }//GEN-LAST:event_botaoRemoverArestaActionPerformed

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

    private void infoGrafico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoGrafico1ActionPerformed
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
    }//GEN-LAST:event_infoGrafico1ActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdicionarVertices;
    private javax.swing.JButton BotaoSalvarXml;
    private javax.swing.JButton BotaoVisualizarGrafo;
    private javax.swing.JTextField Origem;
    private javax.swing.JButton botaoAdionarAresta;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JButton botaoRemoverAresta;
    private javax.swing.JTextField destino;
    private javax.swing.JTextField excluirDestino;
    private javax.swing.JTextField excluirOrigem;
    private javax.swing.JButton infoGrafico;
    private javax.swing.JButton infoGrafico1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField origem;
    private javax.swing.JTable tabela;
    private javax.swing.JButton tipoGrafo;
    private javax.swing.JTextField vertices;
    // End of variables declaration//GEN-END:variables
}
