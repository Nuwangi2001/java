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
public class AdminPage1 extends javax.swing.JFrame {

    /**
     * Creates new form AddminPage1
     */
    public AdminPage1() {
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
        jLabel1 = new javax.swing.JLabel();
        btn_stu = new javax.swing.JButton();
        btn_teacher = new javax.swing.JButton();
        btn_subject = new javax.swing.JButton();
        btn_addnew = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/addmin.jpg"))); // NOI18N

        btn_stu.setBackground(new java.awt.Color(0, 153, 153));
        btn_stu.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_stu.setForeground(new java.awt.Color(204, 204, 204));
        btn_stu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/309036_student_education_study_icon.png"))); // NOI18N
        btn_stu.setText("Student");
        btn_stu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stuActionPerformed(evt);
            }
        });

        btn_teacher.setBackground(new java.awt.Color(0, 153, 153));
        btn_teacher.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_teacher.setForeground(new java.awt.Color(204, 204, 204));
        btn_teacher.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/teacher3 (2).png"))); // NOI18N
        btn_teacher.setText("Teacher");
        btn_teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacherActionPerformed(evt);
            }
        });

        btn_subject.setBackground(new java.awt.Color(0, 153, 153));
        btn_subject.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_subject.setForeground(new java.awt.Color(204, 204, 204));
        btn_subject.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/subject.png"))); // NOI18N
        btn_subject.setText("Subject");
        btn_subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_subjectActionPerformed(evt);
            }
        });

        btn_addnew.setBackground(new java.awt.Color(0, 153, 153));
        btn_addnew.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btn_addnew.setForeground(new java.awt.Color(204, 204, 204));
        btn_addnew.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/211802_plus_icon.png"))); // NOI18N
        btn_addnew.setText("Add New User");
        btn_addnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addnewActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(255, 255, 255));
        btn_logout.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logout (1)_1.png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_addnew)
                    .addComponent(btn_subject)
                    .addComponent(btn_teacher)
                    .addComponent(btn_stu)
                    .addComponent(jLabel1))
                .addContainerGap(240, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btn_stu)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_teacher)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_subject)
                .addGap(18, 18, 18)
                .addComponent(btn_addnew)
                .addGap(18, 18, 18)
                .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btn_stuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stuActionPerformed

        this.hide();
        Studentlogin frm = new Studentlogin();
        frm.setVisible(true);

    }//GEN-LAST:event_btn_stuActionPerformed

    private void btn_teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacherActionPerformed
         this.hide();
        Teacherlogin frm = new Teacherlogin();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_teacherActionPerformed

    private void btn_subjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_subjectActionPerformed
         this.hide();
        subject frm = new subject();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_subjectActionPerformed

    private void btn_addnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addnewActionPerformed
        this.hide();
        NewuserFrame frm = new NewuserFrame();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_addnewActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
         this.hide();
        Login frm = new Login();
        frm.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(AdminPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPage1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminPage1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_addnew;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_stu;
    private javax.swing.JButton btn_subject;
    private javax.swing.JButton btn_teacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
