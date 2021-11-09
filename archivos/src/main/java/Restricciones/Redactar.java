/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restricciones;

import Registros.Data;
import Lab01.Correo;
import Lab01.HandleTree;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import static javax.swing.JOptionPane.showMessageDialog;
import org.codehaus.plexus.util.FileUtils;

/**
 *
 * @author llaaj
 */
public class Redactar extends javax.swing.JFrame {    

    /**
     * Creates new form Redactar
     */
    public Redactar() {
        initComponents();    
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        if (Data.Instance().ver != null) {
            if (Data.Instance().actual == 2) {
                destinatarioTxt.setText("Usuario: " + Data.Instance().ver.getEmisor());
            } else {
                destinatarioTxt.setText("Destinatario: " + Data.Instance().ver.getReceptor());
            } 
            asuntoTxt1.setText(Data.Instance().ver.getAsunto());
            msgTxt.setText(Data.Instance().ver.getMensaje());
            adjuntoTxt.setText(Data.Instance().ver.getAdjunto());
            sendBtn.setEnabled(false);
            adjuntarBtn.setEnabled(false);
            Data.Instance().ver = null;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sendBtn = new javax.swing.JButton();
        destinatarioTxt = new javax.swing.JTextField();
        adjuntoTxt = new javax.swing.JTextField();
        msgTxt = new javax.swing.JTextField();
        adjuntarBtn = new javax.swing.JButton();
        asuntoTxt1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sendBtn.setText("Enviar");
        sendBtn.setToolTipText("");
        sendBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendBtnActionPerformed(evt);
            }
        });

        destinatarioTxt.setText("Destinatario");

        adjuntoTxt.setText("Archivo adjunto");
        adjuntoTxt.setEnabled(false);

        msgTxt.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        msgTxt.setText("Mensaje");
        msgTxt.setToolTipText("");

        adjuntarBtn.setText("Adjuntar");
        adjuntarBtn.setToolTipText("");
        adjuntarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adjuntarBtnActionPerformed(evt);
            }
        });

        asuntoTxt1.setText("Asunto");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(adjuntarBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sendBtn))
                    .addComponent(destinatarioTxt)
                    .addComponent(adjuntoTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(msgTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(asuntoTxt1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(destinatarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(asuntoTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msgTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendBtn)
                    .addComponent(adjuntarBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adjuntoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adjuntarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adjuntarBtnActionPerformed
        // TODO add your handling code here:
        JFileChooser dialog = new JFileChooser();
        // dialog.setFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));

        File fichero;
        String path;
        int valor = dialog.showOpenDialog(this);

        if (valor == JFileChooser.APPROVE_OPTION) {
            fichero = dialog.getSelectedFile();
            path = fichero.getPath();

            adjuntoTxt.setText(path);
        }

    }//GEN-LAST:event_adjuntarBtnActionPerformed

    private void sendBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendBtnActionPerformed
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String fecha = dtf.format(now);
                
        //Data.Instance().tree.add(new Correo(Data.Instance().user.getUsuario(), destinatarioTxt.getText(), fecha, asuntoTxt1.getText(), msgTxt.getText(), moverAdjunto(adjuntoTxt.getText()), "1"));
        //this.dispose();
        
        Receptor r = new Receptor();
        if(r.userExists(destinatarioTxt.getText())){
            if (!r.isUserOrList(destinatarioTxt.getText())) { // false para listas
                if (r.userHasList(destinatarioTxt.getText(), Data.Instance().user.getUsuario())) {
                    ArrayList<String> usersInList = r.getUsersFromList(destinatarioTxt.getText());
                    
                    for(String user : usersInList){
                        Data.Instance().tree.add(new Correo(Data.Instance().user.getUsuario(), 
                            user, fecha, asuntoTxt1.getText(), msgTxt.getText(), 
                            moverAdjunto(adjuntoTxt.getText()), "1"));
                    }
                    this.dispose();
                }
                else {
                    showMessageDialog(null, "No has creado esta lista anteriormente");
                }
            }
            else{
                Data.Instance().tree.add(new Correo(Data.Instance().user.getUsuario(), 
                        destinatarioTxt.getText(), fecha, 
                        asuntoTxt1.getText(), msgTxt.getText(), 
                        moverAdjunto(adjuntoTxt.getText()), "1"));
                this.dispose();
            }
            
        }
        else {
            showMessageDialog(null, "Usuario o lista no existentes");
        }
    }//GEN-LAST:event_sendBtnActionPerformed

    private String moverAdjunto(String path) {
        path = path.replaceAll(" ", "");
        if (!"".equals(path)) {
            File source = new File(path);
            int index = source.getName().lastIndexOf('.');
            File dest = new File("C:\\MEIA\\Adjuntos\\" + source.getName());
            System.out.println(dest.getName());
            try {
                FileUtils.copyFile(source, dest);
                return dest.getPath();
            } catch (IOException e) {
               return "";
            }
        }
        return "";
    }

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
            java.util.logging.Logger.getLogger(Redactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Redactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Redactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Redactar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Redactar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adjuntarBtn;
    private javax.swing.JTextField adjuntoTxt;
    private javax.swing.JTextField asuntoTxt1;
    private javax.swing.JTextField destinatarioTxt;
    private javax.swing.JTextField msgTxt;
    private javax.swing.JButton sendBtn;
    // End of variables declaration//GEN-END:variables
}
