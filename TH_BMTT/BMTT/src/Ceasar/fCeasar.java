/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ceasar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lengo
 */
public class fCeasar extends javax.swing.JFrame {

    /**
     * Creates new form fCeasar
     */
    public fCeasar() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPt = new javax.swing.JTextArea();
        txtKhoa = new javax.swing.JTextField();
        btnEn = new javax.swing.JButton();
        btnGhi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCt = new javax.swing.JTextArea();
        btnMo = new javax.swing.JButton();
        btnDe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel1.setText("Chương trình mã hoa/Giải mã Ceasar Cipher");

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Plain Text");

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setText("Khóa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Cipher Text");

        txtPt.setColumns(20);
        txtPt.setRows(5);
        jScrollPane1.setViewportView(txtPt);

        btnEn.setText("Encrypt");
        btnEn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnActionPerformed(evt);
            }
        });

        btnGhi.setText("Ghi file");
        btnGhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGhiActionPerformed(evt);
            }
        });

        txtCt.setColumns(20);
        txtCt.setRows(5);
        jScrollPane2.setViewportView(txtCt);

        btnMo.setText("Mở file");
        btnMo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoActionPerformed(evt);
            }
        });

        btnDe.setText("Decrypt");
        btnDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                    .addComponent(txtKhoa)
                    .addComponent(jScrollPane2))
                .addGap(68, 68, 68))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(btnEn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGhi)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(btnDe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMo)
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEn)
                    .addComponent(btnGhi))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel4)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMo)
                    .addComponent(btnDe))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnActionPerformed
        // TODO add your handling code here:
        String plainText = txtPt.getText();
        int key = Integer.parseInt(txtKhoa.getText());

        if (key < 0) {
            key = 26 - (-key % 26);
        }

        String result = "";

        for (int i = 0; i < plainText.length(); i++) {
            char ch = mahoa(plainText.charAt(i), key);
            result += ch;
        }

        txtCt.setText(result);
    }//GEN-LAST:event_btnEnActionPerformed

    private char mahoa(char ch, int key) {
        if (Character.isUpperCase(ch)) {
            ch = (char) (ch + (key % 26));
            if (ch > 'Z') {
                ch = (char) (ch - 26);
            }
        } else if (Character.isLowerCase(ch)) {
            ch = (char) (ch + (key % 26));
            if (ch > 'z') {
                ch = (char) (ch - 26);
            }
        }
        return ch;
    }

    private void btnDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeActionPerformed
        // TODO add your handling code here:
        String cipherText = txtCt.getText();
        int key = Integer.parseInt(txtKhoa.getText());

        if (key < 0) {
            key = 26 - (-key % 26);
        }

        String result = "";

        for (int i = 0; i < cipherText.length(); i++) {
            char ch = giaima(cipherText.charAt(i), key);
            result += ch;
        }

        txtPt.setText(result);
    }//GEN-LAST:event_btnDeActionPerformed

    private char giaima(char ch, int key) {
        if (Character.isUpperCase(ch)) {
            ch = (char) (ch - (key % 26));
            if (ch < 'A') {
                ch = (char) (ch + 26);
            }
        } else if (Character.isLowerCase(ch)) {
            ch = (char) (ch - (key % 26));
            if (ch < 'a') {
                ch = (char)(ch + 26);
            }
        }
        return ch;
    }

    private void btnGhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGhiActionPerformed
        // TODO add your handling code here:
        try {
            BufferedWriter bw = null;

            String filename = "D:\\Dulieu.txt";

            String s = txtCt.getText();

            bw = new BufferedWriter(new FileWriter(filename));
            bw.write(s);
            bw.close();
            JOptionPane.showMessageDialog(null, "Đã ghi file thành công!");
        } catch (IOException ex) {
            Logger.getLogger(fCeasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGhiActionPerformed

    private void btnMoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoActionPerformed
        // TODO add your handling code here:
        try {
            BufferedReader br = null;
            String filename = "D:\\Dulieu.txt";
            br = new BufferedReader(new FileReader(filename));
            StringBuilder sb = new StringBuilder();
            JOptionPane.showMessageDialog(null, "Đã mở file thành công!");
            char[] ca = new char[5];
            while (br.ready()) {
                int len = br.read(ca);
                sb.append(ca, 0, len);
            }
            br.close();
            String chuoi = sb.toString();
            txtCt.setText(chuoi);
        } catch (IOException ex) {
            Logger.getLogger(fCeasar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMoActionPerformed

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
            java.util.logging.Logger.getLogger(fCeasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fCeasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fCeasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fCeasar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new fCeasar().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDe;
    private javax.swing.JButton btnEn;
    private javax.swing.JButton btnGhi;
    private javax.swing.JButton btnMo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtCt;
    private javax.swing.JTextField txtKhoa;
    private javax.swing.JTextArea txtPt;
    // End of variables declaration//GEN-END:variables

}
