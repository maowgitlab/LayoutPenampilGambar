/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/**
 *
 * @author Admin
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        JavaScript = new javax.swing.JLabel();
        PHP = new javax.swing.JLabel();
        Python = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setText("JavaScript");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton1);

        jButton2.setText("PHP");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton2);

        jButton3.setText("Python");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton3);

        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton4);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        JavaScript.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JavaScript.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\programming\\javascript.jpg")); // NOI18N
        JavaScript.setText("jLabel1");
        imagePanel.add(JavaScript, "0");

        PHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PHP.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\programming\\PHP.jpg")); // NOI18N
        PHP.setText("PHP");
        imagePanel.add(PHP, "1");

        Python.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Python.setIcon(new javax.swing.ImageIcon("C:\\Users\\Admin\\Pictures\\programming\\pythonL.jpg")); // NOI18N
        Python.setText("jLabel3");
        imagePanel.add(Python, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new PilihGambarButton().setVisible(true);
                  PilihGambarButton fullframe = new PilihGambarButton();
                  GraphicsDevice device = 
                          GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                  device.setFullScreenWindow(fullframe);
                  fullframe.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JavaScript;
    private javax.swing.JLabel PHP;
    private javax.swing.JLabel Python;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    // End of variables declaration//GEN-END:variables
}