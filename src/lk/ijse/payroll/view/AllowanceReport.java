/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.view;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.controller.EmployeeRegisterController;
import lk.ijse.payroll.dbconnection.DBConnection;
import lk.ijse.payroll.model.EmployeeDTO;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Chamil
 */
public class AllowanceReport extends javax.swing.JFrame {
    private String employeeName;

    /**
     * Creates new form AllowanceReport
     */
    public AllowanceReport() {
        initComponents();
        loadEmployeeName();
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
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelDesignation = new javax.swing.JLabel();
        jLabelEmployeeName = new javax.swing.JLabel();
        jLabelBasicSalary = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        TxtSalary = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        TxtDesignation = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        TxtEmployeeId = new javax.swing.JTextField();
        ComboBoxEmpName = new javax.swing.JComboBox<String>();
        BtnView = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        TextFieldDateOfBirth = new com.toedter.calendar.JDateChooser();
        jLabelBasicSalary1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(500, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmployeeID.setBackground(new java.awt.Color(1, 50, 67));
        jLabelEmployeeID.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelEmployeeID.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeID.setText("Employee ID");
        jPanel1.add(jLabelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 110, 30));

        jLabelDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelDesignation.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation.setText("Designation");
        jPanel1.add(jLabelDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 110, 30));

        jLabelEmployeeName.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelEmployeeName.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeName.setText("Employee Name");
        jPanel1.add(jLabelEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 140, 30));

        jLabelBasicSalary.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelBasicSalary.setForeground(new java.awt.Color(31, 58, 147));
        jLabelBasicSalary.setText("Date");
        jPanel1.add(jLabelBasicSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 110, 30));

        jSeparator20.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator20.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator20.setOpaque(true);
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 150, -1));

        TxtSalary.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtSalary.setForeground(new java.awt.Color(31, 58, 147));
        TxtSalary.setBorder(null);
        TxtSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSalaryActionPerformed(evt);
            }
        });
        TxtSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtSalaryKeyReleased(evt);
            }
        });
        jPanel1.add(TxtSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 150, 30));

        jSeparator21.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator21.setOpaque(true);
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 150, -1));

        TxtDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtDesignation.setForeground(new java.awt.Color(31, 58, 147));
        TxtDesignation.setBorder(null);
        TxtDesignation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDesignationActionPerformed(evt);
            }
        });
        TxtDesignation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDesignationKeyReleased(evt);
            }
        });
        jPanel1.add(TxtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 150, 30));

        jSeparator22.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator22.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator22.setOpaque(true);
        jPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 70, -1));

        TxtEmployeeId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtEmployeeId.setForeground(new java.awt.Color(31, 58, 147));
        TxtEmployeeId.setBorder(null);
        TxtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmployeeIdActionPerformed(evt);
            }
        });
        jPanel1.add(TxtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 70, 20));

        ComboBoxEmpName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        ComboBoxEmpName.setForeground(new java.awt.Color(31, 58, 147));
        ComboBoxEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxEmpNameActionPerformed(evt);
            }
        });
        jPanel1.add(ComboBoxEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 160, 30));

        BtnView.setText("View Report");
        BtnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnViewActionPerformed(evt);
            }
        });
        jPanel1.add(BtnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        BtnCancel.setText("Cancel");
        jPanel1.add(BtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 320, 90, -1));
        jPanel1.add(TextFieldDateOfBirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 160, 30));

        jLabelBasicSalary1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabelBasicSalary1.setForeground(new java.awt.Color(31, 58, 147));
        jLabelBasicSalary1.setText("Basic Salary");
        jPanel1.add(jLabelBasicSalary1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSalaryActionPerformed

    private void TxtSalaryKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSalaryKeyReleased
        String txt = TxtSalary.getText();
        int caretPosition = TxtSalary.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            TxtSalary.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            TxtSalary.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_TxtSalaryKeyReleased

    private void TxtDesignationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDesignationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDesignationActionPerformed

    private void TxtDesignationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesignationKeyReleased
        String txt = TxtDesignation.getText();
        int caretPosition = TxtDesignation.getCaretPosition();
        if (!txt.matches("^[A-Za-z//]*$")) {
            TxtDesignation.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            TxtDesignation.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_TxtDesignationKeyReleased

    private void TxtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmployeeIdActionPerformed

    private void ComboBoxEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxEmpNameActionPerformed
        employeeName = ComboBoxEmpName.getSelectedItem().toString();
        
        try {
            String empoyeeName=(String) ComboBoxEmpName.getSelectedItem();
            EmployeeDTO employee=EmployeeRegisterController.searchEmployee(empoyeeName);
            if(employee!=null){
            
                TxtEmployeeId.setText(employee.getId());
                TxtDesignation.setText(employee.getDesignation());
                TxtSalary.setText(""+employee.getSalary());
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAllowance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ComboBoxEmpNameActionPerformed

    private void BtnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnViewActionPerformed
        InputStream input=getClass().getResourceAsStream("/lk/ijse/payroll/report/AllowanceRepo.jasper");
       HashMap map=new HashMap();
       try {
            JasperPrint jasperPrint=JasperFillManager.fillReport(input, map,DBConnection.getInstance().getConnection());
            JasperViewer.viewReport(jasperPrint);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeSalary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) { 
            Logger.getLogger(EmployeeSalary.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JRException ex) {
            Logger.getLogger(EmployeeSalary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BtnViewActionPerformed

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
            java.util.logging.Logger.getLogger(AllowanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllowanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllowanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllowanceReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllowanceReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnView;
    private javax.swing.JComboBox<String> ComboBoxEmpName;
    private com.toedter.calendar.JDateChooser TextFieldDateOfBirth;
    private javax.swing.JTextField TxtDesignation;
    private javax.swing.JTextField TxtEmployeeId;
    private javax.swing.JTextField TxtSalary;
    private javax.swing.JLabel jLabelBasicSalary;
    private javax.swing.JLabel jLabelBasicSalary1;
    private javax.swing.JLabel jLabelDesignation;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelEmployeeName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    // End of variables declaration//GEN-END:variables

    private void loadEmployeeName() {
        try {
            ArrayList<String>employeeNames=EmployeeRegisterController.getAllEmployeeNames();
            for (String employeeName : employeeNames) {
                ComboBoxEmpName.addItem(employeeName);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
