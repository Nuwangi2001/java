/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

/**
 *
 * @author User-1
 */
public class Teacherlogin extends javax.swing.JFrame {

    /**
     * Creates new form Teacherlogin
     */
    public Teacherlogin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_teacherdetail = new javax.swing.JButton();
        btn_newregistration = new javax.swing.JButton();
        btn_back1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setForeground(new java.awt.Color(102, 0, 102));

        btn_teacherdetail.setBackground(new java.awt.Color(0, 204, 204));
        btn_teacherdetail.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn_teacherdetail.setForeground(new java.awt.Color(102, 102, 102));
        btn_teacherdetail.setText("Teacher s' Details Form");
        btn_teacherdetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacherdetailActionPerformed(evt);
            }
        });

        btn_newregistration.setBackground(new java.awt.Color(0, 204, 204));
        btn_newregistration.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        btn_newregistration.setForeground(new java.awt.Color(102, 102, 102));
        btn_newregistration.setText("New Registration Form");
        btn_newregistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newregistrationActionPerformed(evt);
            }
        });

        btn_back1.setBackground(new java.awt.Color(204, 204, 204));
        btn_back1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        btn_back1.setText("Back");
        btn_back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_back1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_teacherdetail)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_back1)
                        .addComponent(btn_newregistration)))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(btn_teacherdetail)
                .addGap(31, 31, 31)
                .addComponent(btn_newregistration)
                .addGap(65, 65, 65)
                .addComponent(btn_back1)
                .addContainerGap(98, Short.MAX_VALUE))
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_teacherdetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacherdetailActionPerformed
            this.hide();
     Teacher frm = new Teacher();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btn_teacherdetailActionPerformed

    private void btn_newregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newregistrationActionPerformed
            this.hide();
      Teachersdetail2 frm = new Teachersdetail2();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_newregistrationActionPerformed

    private void btn_back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_back1ActionPerformed
              this.hide();
      AdminPage1 frm = new AdminPage1();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_back1ActionPerformed

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
            java.util.logging.Logger.getLogger(Teacherlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Teacherlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Teacherlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Teacherlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Teacherlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back1;
    private javax.swing.JButton btn_newregistration;
    private javax.swing.JButton btn_teacherdetail;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
