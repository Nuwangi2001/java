/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User-1
 */
public class NewAddmission extends javax.swing.JFrame {

    /**
     * Creates new form NewAddmission
     */
    public NewAddmission() {
        initComponents();
        setLocationRelativeTo(null);
        scrolpane1.getVerticalScrollBar().setUnitIncrement(16);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrolpane1 = new javax.swing.JScrollPane();
        tGname1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tIndexno1 = new javax.swing.JTextField();
        tFullName1 = new javax.swing.JTextField();
        tDob1 = new javax.swing.JTextField();
        cbGender1 = new javax.swing.JComboBox<>();
        tAddress1 = new javax.swing.JTextField();
        tsGname1 = new javax.swing.JTextField();
        tGaddress1 = new javax.swing.JTextField();
        tGoccupation1 = new javax.swing.JTextField();
        tTelephoneno1 = new javax.swing.JTextField();
        cbGrade1 = new javax.swing.JComboBox<>();
        cbStream1 = new javax.swing.JComboBox<>();
        cbClass1 = new javax.swing.JComboBox<>();
        t_Subject1 = new javax.swing.JTextField();
        t_Subject2 = new javax.swing.JTextField();
        t_Subject3 = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        btn_can2 = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tGname1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));

        jLabel16.setBackground(new java.awt.Color(0, 102, 204));
        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel16.setText("New Addmission Form");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel16)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(19, 19, 19))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Index Number");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Full Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date of Birth");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Guardian s' Name");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Guardian s' Address");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Guardian s' Occupation");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Telephone Number");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Grade");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Stream");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Class");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Subject 1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Subject 2");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Subject 3");

        cbGender1.setBackground(new java.awt.Color(0, 153, 153));
        cbGender1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGender1.setForeground(new java.awt.Color(153, 153, 153));
        cbGender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        cbGrade1.setBackground(new java.awt.Color(0, 153, 153));
        cbGrade1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbGrade1.setForeground(new java.awt.Color(153, 153, 153));
        cbGrade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12", "13" }));

        cbStream1.setBackground(new java.awt.Color(0, 153, 153));
        cbStream1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbStream1.setForeground(new java.awt.Color(153, 153, 153));
        cbStream1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arts", "Commerce", "Bio", "Maths" }));

        cbClass1.setBackground(new java.awt.Color(0, 153, 153));
        cbClass1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cbClass1.setForeground(new java.awt.Color(153, 153, 153));
        cbClass1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "12A", "12B", "12C", "13A", "13B", "13C" }));

        btn_save.setBackground(new java.awt.Color(153, 153, 0));
        btn_save.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/save.png"))); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        btn_can2.setBackground(new java.awt.Color(204, 204, 204));
        btn_can2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_can2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/cancel.png"))); // NOI18N
        btn_can2.setText("Cancel");
        btn_can2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_can2ActionPerformed(evt);
            }
        });

        btn_back.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tGname1Layout = new javax.swing.GroupLayout(tGname1);
        tGname1.setLayout(tGname1Layout);
        tGname1Layout.setHorizontalGroup(
            tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(tGname1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tGname1Layout.createSequentialGroup()
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tIndexno1)
                            .addComponent(tFullName1)
                            .addComponent(tDob1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbGender1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tAddress1)
                            .addComponent(tsGname1, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
                            .addComponent(tGaddress1)))
                    .addGroup(tGname1Layout.createSequentialGroup()
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tGoccupation1)
                            .addComponent(tTelephoneno1)
                            .addComponent(cbGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbStream1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbClass1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Subject1)
                            .addComponent(t_Subject2)
                            .addComponent(t_Subject3, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tGname1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addGap(18, 18, 18)
                        .addComponent(btn_save)
                        .addGap(18, 18, 18)
                        .addComponent(btn_can2)))
                .addContainerGap(220, Short.MAX_VALUE))
        );
        tGname1Layout.setVerticalGroup(
            tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tGname1Layout.createSequentialGroup()
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tGname1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(tIndexno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tFullName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tDob1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbGender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addComponent(tAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tsGname1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tGaddress1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tGoccupation1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tTelephoneno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbGrade1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbStream1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(cbClass1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(t_Subject1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(t_Subject2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(t_Subject3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tGname1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_save)
                    .addComponent(btn_can2)
                    .addComponent(btn_back))
                .addGap(0, 89, Short.MAX_VALUE))
        );

        scrolpane1.setViewportView(tGname1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrolpane1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        if (tIndexno1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please type the Index Number");
        } else if (tFullName1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please type the Full Name");
        } else if (tDob1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter the Date of Birth");
        } else if (cbGender1.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Select the Gender");
        } else if (tAddress1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter the Address");    
        } else if (tsGname1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, " Please Type the Guardian's Name");
        } else if (tGaddress1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please Type the Guardian's Address");
        } else if (tGoccupation1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, " Please Type the Guardian's Occupation");
        } else if (tTelephoneno1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Enter the Telephone Number");
        } else if (cbGrade1.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Select the Grade");
        } else if (cbStream1.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Select the Stream");
        } else if (cbClass1.getSelectedItem().toString().length() == 0) {
            JOptionPane.showMessageDialog(this, "Select the Class");
        } else if (t_Subject1.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please type the Subject 1");
        } else if (t_Subject2.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please type the Subject 2");
        } else if (t_Subject3.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Please type the Subject");
        } else {
            try {
                String IndexNumber = tIndexno1.getText();
                String FullName = tFullName1.getText();
                String DateOfBirth = tDob1.getText();
                String Gender = cbGender1.getSelectedItem().toString();
                String Address = tAddress1.getText();
                String GuardiansName = tsGname1.getText();
                String GuardiansAddress = tGaddress1.getText();
                String GuardiansOccupation = tGoccupation1.getText();
                String TelephoneNumber = tTelephoneno1.getText();
                String Grade = cbGrade1.getSelectedItem().toString();
                String Stream = cbStream1.getSelectedItem().toString();
                String Class = cbClass1.getSelectedItem().toString();
                String Subject1 = t_Subject1.getText();
                String Subject2 = t_Subject2.getText();
                String Subject3 = t_Subject3.getText();

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/schoolmanagementsystem", "root", "");

                PreparedStatement ps = conn.prepareStatement("insert into student(indexnumber,fullname,dob,gender,address,guardianname,guardianaddress,guardianoccupation,telephoneno,Grade,stream,class,subject1,subject2,subject3)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, IndexNumber);
                ps.setString(2, FullName);
                ps.setString(3, DateOfBirth);
                ps.setString(4, Gender);
                ps.setString(5, Address);
                ps.setString(6, GuardiansName);
                ps.setString(7, GuardiansAddress);
                ps.setString(8, GuardiansOccupation);
                ps.setString(9, TelephoneNumber);
                ps.setString(10, Grade);
                ps.setString(11, Stream);
                ps.setString(12, Class);
                ps.setString(13, Subject1);
                ps.setString(14, Subject2);
                ps.setString(15, Subject3);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Save the New Student");
               } catch (SQLException ex) {
                Logger.getLogger(NewAddmission.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_can2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_can2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_can2ActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        this.hide();
        Studentlogin frm = new Studentlogin();
        frm.setVisible(true);
        
    }//GEN-LAST:event_btn_backActionPerformed

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
            java.util.logging.Logger.getLogger(NewAddmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAddmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAddmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAddmission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewAddmission().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_can2;
    private javax.swing.JButton btn_save;
    private javax.swing.JComboBox<String> cbClass1;
    private javax.swing.JComboBox<String> cbGender1;
    private javax.swing.JComboBox<String> cbGrade1;
    private javax.swing.JComboBox<String> cbStream1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane scrolpane1;
    private javax.swing.JTextField tAddress1;
    private javax.swing.JTextField tDob1;
    private javax.swing.JTextField tFullName1;
    private javax.swing.JTextField tGaddress1;
    private javax.swing.JPanel tGname1;
    private javax.swing.JTextField tGoccupation1;
    private javax.swing.JTextField tIndexno1;
    private javax.swing.JTextField tTelephoneno1;
    private javax.swing.JTextField t_Subject1;
    private javax.swing.JTextField t_Subject2;
    private javax.swing.JTextField t_Subject3;
    private javax.swing.JTextField tsGname1;
    // End of variables declaration//GEN-END:variables
}
