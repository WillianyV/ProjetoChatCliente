/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import model.Cliente;
import model.ThreadReceberMSG;

/**
 *
 * @author willi
 */
public class ChatJFrame extends javax.swing.JFrame {

    /**
     * Creates new form ChatJFrame
     */
    
    Scanner leitor;
    PrintWriter iniciarChat;
    int msgEnviadas = 0 ;
    int msgRecebidas = 0;
    public ChatJFrame() throws IOException {
        initComponents();
        
        Thread threadReceberMSG = new Thread(new ThreadReceberMSG(leitor, areaDeMensagensjTextArea,contRecebidasjLabel));
        receberMSG();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaDeMensagensjTextArea = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        enviarJLabel = new javax.swing.JLabel();
        msgJTextField = new javax.swing.JTextField();
        contEnviadasjLabel = new javax.swing.JLabel();
        contRecebidasjLabel = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chat Cliente");
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoChat.png")).getImage());
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 180, 180));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Communication_30px.png"))); // NOI18N
        jLabel1.setText(" Chat : Cliente");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Server_30px.png"))); // NOI18N
        jLabel2.setText("Servidor");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText(" Mensagens Enviadas: ");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText(" Mensagens Recebidas: ");

        areaDeMensagensjTextArea.setEditable(false);
        areaDeMensagensjTextArea.setColumns(20);
        areaDeMensagensjTextArea.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        areaDeMensagensjTextArea.setRows(5);
        jScrollPane1.setViewportView(areaDeMensagensjTextArea);

        enviarJLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icons8_Sent_30px.png"))); // NOI18N
        enviarJLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                enviarJLabelMouseClicked(evt);
            }
        });

        msgJTextField.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        msgJTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                msgJTextFieldKeyPressed(evt);
            }
        });

        contEnviadasjLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contEnviadasjLabel.setText("0");

        contRecebidasjLabel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        contRecebidasjLabel.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(msgJTextField)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(enviarJLabel)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(contEnviadasjLabel)
                                .addGap(116, 116, 116)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(contRecebidasjLabel)))
                        .addGap(0, 139, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(contEnviadasjLabel)
                    .addComponent(contRecebidasjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(enviarJLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(msgJTextField))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(616, 670));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void msgJTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_msgJTextFieldKeyPressed
        if (evt.getKeyCode() == evt.VK_ENTER)
            chatEnviarMSG();
    }//GEN-LAST:event_msgJTextFieldKeyPressed

    private void enviarJLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_enviarJLabelMouseClicked
        chatEnviarMSG();
    }//GEN-LAST:event_enviarJLabelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextArea areaDeMensagensjTextArea;
    private javax.swing.JLabel contEnviadasjLabel;
    private javax.swing.JLabel contRecebidasjLabel;
    private javax.swing.JLabel enviarJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField msgJTextField;
    // End of variables declaration//GEN-END:variables

    public void chatEnviarMSG(){
      
        if(msgJTextField.getText().equals("")){
            MensagensClass.mensagem("Digite algo!");
            msgJTextField.requestFocus();
        }else{
            areaDeMensagensjTextArea.append("["+ Cliente.getNomeCliente()+"] : " + msgJTextField.getText()+ "\n");
            iniciarChat.println("["+ Cliente.getNomeCliente()+"] : " + msgJTextField.getText());
            iniciarChat.flush();
        }
        msgJTextField.setText("");
        msgJTextField.requestFocus();
        
        msgEnviadas+=1;
        contEnviadasjLabel.setText(msgEnviadas+"");
    }
   
    public void receberMSG(){
        try {
            iniciarChat = new PrintWriter(Cliente.getSocket().getOutputStream(),true);
            leitor = new Scanner(Cliente.getSocket().getInputStream());
        } catch (IOException ex) {
            MensagensClass.mensagem("Erro ao iniciar chat");
        }
        Thread threadReceberMSG = new Thread(new ThreadReceberMSG(leitor, areaDeMensagensjTextArea,contRecebidasjLabel));
        threadReceberMSG.start();
        
    }
    
}