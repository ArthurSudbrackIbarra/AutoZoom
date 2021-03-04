import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author Arthur Sudbrack Ibarra
 */
public class Interface extends javax.swing.JFrame {
    
    private final Acesso acesso;

    /**
     * Creates new form Interface
     * @throws java.io.IOException
     */
    public Interface() throws IOException {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/logo/logoAutoZoom.png")).getImage()); 
        this.getContentPane().setBackground(Color.black);
        acesso = new Acesso();     
        preencherCampos();
    }
    
    public void preencherCampos(){
        bc1.setText(acesso.nomeCad1);
        bc2.setText(acesso.nomeCad2);
        bc3.setText(acesso.nomeCad3);
        bc4.setText(acesso.nomeCad4);
        bc5.setText(acesso.nomeCad5);
        bc6.setText(acesso.nomeCad6);
        bc7.setText(acesso.nomeCad7);
        nd1.setText(acesso.nomeCad1);
        nd2.setText(acesso.nomeCad2);
        nd3.setText(acesso.nomeCad3);
        nd4.setText(acesso.nomeCad4);
        nd5.setText(acesso.nomeCad5);
        nd6.setText(acesso.nomeCad6);
        nd7.setText(acesso.nomeCad7);
        ld1.setText(acesso.linkCad1);
        ld2.setText(acesso.linkCad2);
        ld3.setText(acesso.linkCad3);
        ld4.setText(acesso.linkCad4);
        ld5.setText(acesso.linkCad5);
        ld6.setText(acesso.linkCad6);
        ld7.setText(acesso.linkCad7);    
    }
          
    public boolean camposVazios(){      
        ArrayList<JTextField> campos = new ArrayList<>();      
        campos.add(nd1);
        campos.add(nd2);
        campos.add(nd3);
        campos.add(nd4);
        campos.add(nd5);
        campos.add(nd6);
        campos.add(nd7);
        campos.add(ld1);
        campos.add(ld2);
        campos.add(ld3);
        campos.add(ld4);
        campos.add(ld5);
        campos.add(ld6);
        campos.add(ld7);
        for(int i = 0; i < campos.size(); i++){
            if(campos.get(i).getText().equals("")) return true;
        }      
        return false;
    }
    
    public boolean possuiVirgula(){      
        ArrayList<JTextField> campos = new ArrayList<>();      
        campos.add(nd1);
        campos.add(nd2);
        campos.add(nd3);
        campos.add(nd4);
        campos.add(nd5);
        campos.add(nd6);
        campos.add(nd7);
        campos.add(ld1);
        campos.add(ld2);
        campos.add(ld3);
        campos.add(ld4);
        campos.add(ld5);
        campos.add(ld6);
        campos.add(ld7);
        for(int i = 0; i < campos.size(); i++){
            if(campos.get(i).getText().contains(",")) return true;
        }           
        return false;
    }
    
    public void salvarConfiguracoes() throws IOException{
        if(!camposVazios() && !possuiVirgula()){
        
            String dir = System.getProperty("user.dir");
            FileWriter fw = new FileWriter(dir + "/dados-autozoom.txt");
            PrintWriter pw = new PrintWriter(fw);
        
            String texto = nd1.getText() + "," + nd2.getText() + "," + nd3.getText() + 
                    "," + nd4.getText() + "," + nd5.getText() + "," + nd6.getText() + "," + 
                    nd7.getText() + "," + ld1.getText() + "," + ld2.getText() + "," + ld3.getText() + "," + 
                    ld4.getText() + "," + ld5.getText() + "," + ld6.getText() + "," + ld7.getText();
   
            pw.write(texto);
            pw.close();   
            
            acesso.refrescarDados();
            preencherCampos();     
            avisoSucesso();

        }
        else{
            avisoErro();
        }
    }
    
    public void avisoErro(){
        botaoSalvar.setForeground(Color.red);
        botaoSalvar.setText("Problemas encontrados: Preencha todos os campos e/ou não utilize vírgulas!");      
        ActionListener actionListener = (ActionEvent e) -> {
            botaoSalvar.setForeground(Color.black);
            botaoSalvar.setText("Salvar configurações");
        };       
        Timer timer = new Timer(4000, actionListener);
        timer.setRepeats(false);
        timer.start();
    }
    
    public void avisoSucesso(){
        botaoSalvar.setForeground(java.awt.Color.blue);
        botaoSalvar.setText("Configurações salvas!");      
        ActionListener actionListener = (ActionEvent e) -> {
            botaoSalvar.setForeground(Color.black);
            botaoSalvar.setText("Salvar configurações");
        };       
        Timer timer = new Timer(4000, actionListener);
        timer.setRepeats(false);
        timer.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bc1 = new javax.swing.JButton();
        bc2 = new javax.swing.JButton();
        bc3 = new javax.swing.JButton();
        bc4 = new javax.swing.JButton();
        bc5 = new javax.swing.JButton();
        bc6 = new javax.swing.JButton();
        bc7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nd1 = new javax.swing.JTextField();
        ld1 = new javax.swing.JTextField();
        nd2 = new javax.swing.JTextField();
        ld2 = new javax.swing.JTextField();
        nd3 = new javax.swing.JTextField();
        ld3 = new javax.swing.JTextField();
        nd4 = new javax.swing.JTextField();
        ld4 = new javax.swing.JTextField();
        nd5 = new javax.swing.JTextField();
        ld5 = new javax.swing.JTextField();
        nd6 = new javax.swing.JTextField();
        ld6 = new javax.swing.JTextField();
        nd7 = new javax.swing.JTextField();
        ld7 = new javax.swing.JTextField();
        botaoSalvar = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AutoZoom [Criado por Arthur Sudbrack Ibarra]");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1060, 682));
        setResizable(false);

        bc1.setBackground(new java.awt.Color(255, 80, 80));
        bc1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc1.setText("jButton1");
        bc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc1ActionPerformed(evt);
            }
        });

        bc2.setBackground(new java.awt.Color(204, 255, 51));
        bc2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc2.setText("jButton1");
        bc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc2ActionPerformed(evt);
            }
        });

        bc3.setBackground(new java.awt.Color(255, 153, 255));
        bc3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc3.setText("jButton1");
        bc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc3ActionPerformed(evt);
            }
        });

        bc4.setBackground(new java.awt.Color(51, 204, 255));
        bc4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc4.setText("jButton1");
        bc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc4ActionPerformed(evt);
            }
        });

        bc5.setBackground(new java.awt.Color(0, 255, 153));
        bc5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc5.setText("jButton1");
        bc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc5ActionPerformed(evt);
            }
        });

        bc6.setBackground(new java.awt.Color(255, 255, 0));
        bc6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc6.setText("jButton1");
        bc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc6ActionPerformed(evt);
            }
        });

        bc7.setBackground(new java.awt.Color(255, 153, 0));
        bc7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bc7.setText("jButton1");
        bc7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bc7ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Use os botões abaixo para acessar os links Zoom de suas aulas:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Configure o nome de suas cadeiras e seus respectivos links Zoom aqui:");

        nd1.setForeground(new java.awt.Color(127, 127, 127));
        nd1.setText("Nome da disciplina 1:");

        ld1.setForeground(new java.awt.Color(127, 127, 127));
        ld1.setText("Link Zoom da disciplina 1:");

        nd2.setForeground(new java.awt.Color(127, 127, 127));
        nd2.setText("Nome da disciplina 2:");

        ld2.setForeground(new java.awt.Color(127, 127, 127));
        ld2.setText("Link Zoom da disciplina 2:");

        nd3.setForeground(new java.awt.Color(127, 127, 127));
        nd3.setText("Nome da disciplina 3:");

        ld3.setForeground(new java.awt.Color(127, 127, 127));
        ld3.setText("Link Zoom da disciplina 3:");

        nd4.setForeground(new java.awt.Color(127, 127, 127));
        nd4.setText("Nome da disciplina 4:");

        ld4.setForeground(new java.awt.Color(127, 127, 127));
        ld4.setText("Link Zoom da disciplina 4:");

        nd5.setForeground(new java.awt.Color(127, 127, 127));
        nd5.setText("Nome da disciplina 5:");

        ld5.setForeground(new java.awt.Color(127, 127, 127));
        ld5.setText("Link Zoom da disciplina 5:");

        nd6.setForeground(new java.awt.Color(127, 127, 127));
        nd6.setText("Nome da disciplina 6:");

        ld6.setForeground(new java.awt.Color(127, 127, 127));
        ld6.setText("Link Zoom da disciplina 6:");

        nd7.setForeground(new java.awt.Color(127, 127, 127));
        nd7.setText("Nome da disciplina 7:");

        ld7.setForeground(new java.awt.Color(127, 127, 127));
        ld7.setText("Link Zoom da disciplina 7:");

        botaoSalvar.setBackground(new java.awt.Color(0, 153, 0));
        botaoSalvar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoSalvar.setText("Salvar configurações");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(0, 0, 255));
        botaoLimpar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("Limpar campos");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bc1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bc2, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(bc3, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(bc4, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(bc5, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(bc6, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addComponent(bc7, javax.swing.GroupLayout.DEFAULT_SIZE, 1040, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld2, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld3, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld4, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld5, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(nd6, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld6, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nd7, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ld7, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoLimpar)
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(bc1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bc7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nd7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ld7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
        try {
            salvarConfiguracoes();
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        nd1.setText("");
        nd2.setText("");
        nd3.setText("");
        nd4.setText("");
        nd5.setText("");
        nd6.setText("");
        nd7.setText("");
        ld1.setText("");
        ld2.setText("");
        ld3.setText("");
        ld4.setText("");
        ld5.setText("");
        ld6.setText("");
        ld7.setText("");
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void bc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc1ActionPerformed
        try {
            acesso.executar(acesso.linkCad1);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc1ActionPerformed

    private void bc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc2ActionPerformed
        try {
            acesso.executar(acesso.linkCad2);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc2ActionPerformed

    private void bc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc3ActionPerformed
        try {
            acesso.executar(acesso.linkCad3);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc3ActionPerformed

    private void bc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc4ActionPerformed
        try {
            acesso.executar(acesso.linkCad4);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc4ActionPerformed

    private void bc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc5ActionPerformed
        try {
            acesso.executar(acesso.linkCad5);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc5ActionPerformed

    private void bc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc6ActionPerformed
        try {
            acesso.executar(acesso.linkCad6);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc6ActionPerformed

    private void bc7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bc7ActionPerformed
        try {
            acesso.executar(acesso.linkCad7);
        } catch (URISyntaxException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bc7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Interface().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Interface.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bc1;
    private javax.swing.JButton bc2;
    private javax.swing.JButton bc3;
    private javax.swing.JButton bc4;
    private javax.swing.JButton bc5;
    private javax.swing.JButton bc6;
    private javax.swing.JButton bc7;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField ld1;
    private javax.swing.JTextField ld2;
    private javax.swing.JTextField ld3;
    private javax.swing.JTextField ld4;
    private javax.swing.JTextField ld5;
    private javax.swing.JTextField ld6;
    private javax.swing.JTextField ld7;
    private javax.swing.JTextField nd1;
    private javax.swing.JTextField nd2;
    private javax.swing.JTextField nd3;
    private javax.swing.JTextField nd4;
    private javax.swing.JTextField nd5;
    private javax.swing.JTextField nd6;
    private javax.swing.JTextField nd7;
    // End of variables declaration//GEN-END:variables
}
