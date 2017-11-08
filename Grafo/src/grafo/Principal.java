package grafo;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }
    Graph graph = new Graph();
    //Aresta aresta = new Aresta();

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vertices = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Origem = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        destino = new javax.swing.JTextField();
        botaoAdionarVertices = new javax.swing.JButton();
        BotaoSalvarXml = new javax.swing.JButton();
        BotaoVisualizarGrafo = new javax.swing.JButton();
        AdicionarVertices = new javax.swing.JButton();
        botaoRemover = new javax.swing.JButton();
        removerVertice = new javax.swing.JTextField();
        tipoGrafo = new javax.swing.JButton();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vertices ");

        vertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verticesActionPerformed(evt);
            }
        });

        jLabel2.setText("Arestas ");

        Origem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrigemActionPerformed(evt);
            }
        });

        jLabel3.setText("Origem");

        jLabel4.setText("Destino");

        destino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinoActionPerformed(evt);
            }
        });

        botaoAdionarVertices.setText("Adicionar Ligacao");
        botaoAdionarVertices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAdionarVerticesActionPerformed(evt);
            }
        });

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

        tipoGrafo.setText("Tipo do Grafo");
        tipoGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoGrafoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1)
                                        .addComponent(vertices, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Origem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel3)))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(349, 349, 349)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(15, 15, 15))))
                            .addComponent(AdicionarVertices)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BotaoSalvarXml)))
                .addContainerGap(235, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removerVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BotaoVisualizarGrafo))
                        .addComponent(botaoAdionarVertices)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tipoGrafo)
                .addGap(96, 96, 96))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vertices, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AdicionarVertices))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Origem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoRemover))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(tipoGrafo)
                        .addGap(218, 218, 218))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(removerVertice, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoAdionarVertices)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotaoSalvarXml)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotaoVisualizarGrafo)
                        .addGap(48, 48, 48))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrigemActionPerformed
    }//GEN-LAST:event_OrigemActionPerformed

    private void destinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinoActionPerformed
    }//GEN-LAST:event_destinoActionPerformed

    private void botaoAdionarVerticesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAdionarVerticesActionPerformed
 Aresta aresta = new Aresta();
        aresta.setSource(Origem.getText());
        aresta.setTarget(destino.getText());
        graph.getEdged().add(aresta);
        JOptionPane.showMessageDialog(rootPane,"Adicionado com Sucesso");
        acaobotaolimpa();
    }//GEN-LAST:event_botaoAdionarVerticesActionPerformed

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

    private void tipoGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoGrafoActionPerformed
        String infoGrafo = "";
        infoGrafo = graph.getTipoGrafo();

        areaRepresentacao.setText(infoGrafo);
    }//GEN-LAST:event_tipoGrafoActionPerformed

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
    private javax.swing.JButton botaoAdionarVertices;
    private javax.swing.JButton botaoRemover;
    private javax.swing.JTextField destino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField removerVertice;
    private javax.swing.JButton tipoGrafo;
    private javax.swing.JTextField vertices;
    // End of variables declaration//GEN-END:variables
}
