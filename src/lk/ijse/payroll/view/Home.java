/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.view;

import javax.swing.UIManager;

/**
 *
 * @author Shashika
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabelSalary = new javax.swing.JLabel();
        jLabelHome = new javax.swing.JLabel();
        jLabelEmployee = new javax.swing.JLabel();
        jLabelAttendance = new javax.swing.JLabel();
        jLabelAllowance = new javax.swing.JLabel();
        jLabelDeduction = new javax.swing.JLabel();
        LblReport = new javax.swing.JLabel();
        lblLoan = new javax.swing.JLabel();
        LblAttendance = new javax.swing.JLabel();
        AllLoadpnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(31, 58, 147));
        jPanel1.setPreferredSize(new java.awt.Dimension(210, 768));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelSalary.setBackground(new java.awt.Color(31, 58, 147));
        jLabelSalary.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelSalary.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSalary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Money_40px_1.png"))); // NOI18N
        jLabelSalary.setText("   Salary");
        jLabelSalary.setOpaque(true);
        jLabelSalary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalaryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelSalaryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelSalaryMouseExited(evt);
            }
        });
        jPanel1.add(jLabelSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 190, 50));

        jLabelHome.setBackground(new java.awt.Color(31, 58, 147));
        jLabelHome.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Home_40px_2.png"))); // NOI18N
        jLabelHome.setText("   Home");
        jLabelHome.setAlignmentX(0.5F);
        jLabelHome.setOpaque(true);
        jLabelHome.setPreferredSize(new java.awt.Dimension(210, 50));
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseExited(evt);
            }
        });
        jPanel1.add(jLabelHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 190, -1));

        jLabelEmployee.setBackground(new java.awt.Color(31, 58, 147));
        jLabelEmployee.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Employee_40px_1.png"))); // NOI18N
        jLabelEmployee.setText("   Employee");
        jLabelEmployee.setOpaque(true);
        jLabelEmployee.setPreferredSize(new java.awt.Dimension(210, 50));
        jLabelEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEmployeeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelEmployeeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelEmployeeMouseExited(evt);
            }
        });
        jPanel1.add(jLabelEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 190, -1));

        jLabelAttendance.setBackground(new java.awt.Color(31, 58, 147));
        jLabelAttendance.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelAttendance.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAttendance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Attendance_40px_1.png"))); // NOI18N
        jLabelAttendance.setText("Today Attendance");
        jLabelAttendance.setOpaque(true);
        jLabelAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAttendanceMouseExited(evt);
            }
        });
        jPanel1.add(jLabelAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 50));

        jLabelAllowance.setBackground(new java.awt.Color(31, 58, 147));
        jLabelAllowance.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelAllowance.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAllowance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Receive_Cash_40px_2.png"))); // NOI18N
        jLabelAllowance.setText("   Allowance");
        jLabelAllowance.setOpaque(true);
        jLabelAllowance.setPreferredSize(new java.awt.Dimension(210, 50));
        jLabelAllowance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAllowanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelAllowanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAllowanceMouseExited(evt);
            }
        });
        jPanel1.add(jLabelAllowance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 190, -1));

        jLabelDeduction.setBackground(new java.awt.Color(31, 58, 147));
        jLabelDeduction.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        jLabelDeduction.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDeduction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Minus_40px_3.png"))); // NOI18N
        jLabelDeduction.setText("   Deduction");
        jLabelDeduction.setOpaque(true);
        jLabelDeduction.setPreferredSize(new java.awt.Dimension(210, 50));
        jLabelDeduction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelDeductionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDeductionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDeductionMouseExited(evt);
            }
        });
        jPanel1.add(jLabelDeduction, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 190, -1));

        LblReport.setBackground(new java.awt.Color(31, 58, 147));
        LblReport.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        LblReport.setForeground(new java.awt.Color(255, 255, 255));
        LblReport.setText("          Reports");
        LblReport.setOpaque(true);
        LblReport.setPreferredSize(new java.awt.Dimension(210, 50));
        LblReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblReportMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblReportMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblReportMouseExited(evt);
            }
        });
        jPanel1.add(LblReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 720, 190, -1));

        lblLoan.setBackground(new java.awt.Color(31, 58, 147));
        lblLoan.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        lblLoan.setForeground(new java.awt.Color(255, 255, 255));
        lblLoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lk/ijse/payroll/asset/icons8_Request_Money_40px.png"))); // NOI18N
        lblLoan.setText("   Loan Request");
        lblLoan.setOpaque(true);
        lblLoan.setPreferredSize(new java.awt.Dimension(210, 50));
        lblLoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLoanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLoanMouseExited(evt);
            }
        });
        jPanel1.add(lblLoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 580, 190, -1));

        LblAttendance.setBackground(new java.awt.Color(31, 58, 147));
        LblAttendance.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 16)); // NOI18N
        LblAttendance.setForeground(new java.awt.Color(255, 255, 255));
        LblAttendance.setText("   Attendance");
        LblAttendance.setOpaque(true);
        LblAttendance.setPreferredSize(new java.awt.Dimension(210, 50));
        LblAttendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblAttendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LblAttendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LblAttendanceMouseExited(evt);
            }
        });
        jPanel1.add(LblAttendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 190, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 790));

        AllLoadpnl.setBackground(new java.awt.Color(255, 255, 255));
        AllLoadpnl.setPreferredSize(new java.awt.Dimension(1156, 760));

        javax.swing.GroupLayout AllLoadpnlLayout = new javax.swing.GroupLayout(AllLoadpnl);
        AllLoadpnl.setLayout(AllLoadpnlLayout);
        AllLoadpnlLayout.setHorizontalGroup(
            AllLoadpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1156, Short.MAX_VALUE)
        );
        AllLoadpnlLayout.setVerticalGroup(
            AllLoadpnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );

        getContentPane().add(AllLoadpnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 17)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PayRoll Management System");
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(1120, 30));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1160, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseEntered
        jLabelHome.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelHomeMouseEntered

    private void jLabelHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseExited
        jLabelHome.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelHomeMouseExited

    private void jLabelEmployeeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmployeeMouseEntered
       jLabelEmployee.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelEmployeeMouseEntered

    private void jLabelEmployeeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmployeeMouseExited
        jLabelEmployee.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelEmployeeMouseExited

    private void jLabelAttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttendanceMouseEntered
       jLabelAttendance.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelAttendanceMouseEntered

    private void jLabelAttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttendanceMouseExited
        jLabelAttendance.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelAttendanceMouseExited

    private void jLabelAllowanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAllowanceMouseEntered
        jLabelAllowance.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelAllowanceMouseEntered

    private void jLabelAllowanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAllowanceMouseExited
        jLabelAllowance.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelAllowanceMouseExited

    private void jLabelDeductionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeductionMouseEntered
        jLabelDeduction.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelDeductionMouseEntered

    private void jLabelDeductionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeductionMouseExited
        jLabelDeduction.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelDeductionMouseExited

    private void LblReportMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReportMouseEntered
       LblReport.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_LblReportMouseEntered

    private void LblReportMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReportMouseExited
        LblReport.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_LblReportMouseExited

    private void jLabelSalaryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalaryMouseEntered
        jLabelSalary.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_jLabelSalaryMouseEntered

    private void jLabelSalaryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalaryMouseExited
        jLabelSalary.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_jLabelSalaryMouseExited

    private void jLabelEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEmployeeMouseClicked
        EmployeeRegister employeeRegister=new EmployeeRegister();
        AllLoadpnl.removeAll();
        employeeRegister.setSize(AllLoadpnl.getSize());
        employeeRegister.setVisible(true);
        AllLoadpnl.add(employeeRegister);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_jLabelEmployeeMouseClicked

    private void jLabelAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAttendanceMouseClicked
        EmployeeAttendance employeeAttendance=new EmployeeAttendance();
        AllLoadpnl.removeAll();
        employeeAttendance.setSize(AllLoadpnl.getSize());
        employeeAttendance.setVisible(true);
        AllLoadpnl.add(employeeAttendance);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_jLabelAttendanceMouseClicked

    private void jLabelAllowanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAllowanceMouseClicked
        EmployeeAllowance allowance=new EmployeeAllowance();
        AllLoadpnl.removeAll();
        allowance.setSize(AllLoadpnl.getSize());
        allowance.setVisible(true);
        AllLoadpnl.add(allowance);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_jLabelAllowanceMouseClicked

    private void jLabelDeductionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDeductionMouseClicked
        EmployeeDeduction deduction=new EmployeeDeduction();
        AllLoadpnl.removeAll();
        deduction.setSize(AllLoadpnl.getSize());
        deduction.setVisible(true);
        AllLoadpnl.add(deduction);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_jLabelDeductionMouseClicked

    private void jLabelSalaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalaryMouseClicked
        EmployeeSalary employeeSalary=new EmployeeSalary();
        AllLoadpnl.removeAll();
        employeeSalary.setSize(AllLoadpnl.getSize());
        employeeSalary.setVisible(true);
        AllLoadpnl.add(employeeSalary);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_jLabelSalaryMouseClicked

    private void lblLoanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanMouseEntered
        lblLoan.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_lblLoanMouseEntered

    private void lblLoanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanMouseExited
        lblLoan.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_lblLoanMouseExited

    private void LblReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblReportMouseClicked
        Reports reports=new Reports();
        AllLoadpnl.removeAll();
        reports.setSize(AllLoadpnl.getSize());
        reports.setVisible(true);
        AllLoadpnl.add(reports);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
    }//GEN-LAST:event_LblReportMouseClicked

    private void lblLoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoanMouseClicked
        EmployeeLoan employeeLoan=new EmployeeLoan();
        AllLoadpnl.removeAll();
        employeeLoan.setSize(AllLoadpnl.getSize());
        employeeLoan.setVisible(true);
        AllLoadpnl.add(employeeLoan);
        AllLoadpnl.revalidate();
        AllLoadpnl.repaint();
        
    }//GEN-LAST:event_lblLoanMouseClicked

    private void LblAttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAttendanceMouseClicked
//        Attendance attendance=new Attendance();
//        AllLoadpnl.removeAll();
//        attendance.setSize(AllLoadpnl.getSize());
//        attendance.setVisible(true);
//        AllLoadpnl.add(attendance);
//        AllLoadpnl.revalidate();
//        AllLoadpnl.repaint();
    }//GEN-LAST:event_LblAttendanceMouseClicked

    private void LblAttendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAttendanceMouseEntered
        LblAttendance.setBackground(new java.awt.Color(58, 83, 155));
    }//GEN-LAST:event_LblAttendanceMouseEntered

    private void LblAttendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblAttendanceMouseExited
        LblAttendance.setBackground(new java.awt.Color(31, 58, 147));
    }//GEN-LAST:event_LblAttendanceMouseExited

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
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AllLoadpnl;
    private javax.swing.JLabel LblAttendance;
    private javax.swing.JLabel LblReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAllowance;
    private javax.swing.JLabel jLabelAttendance;
    private javax.swing.JLabel jLabelDeduction;
    private javax.swing.JLabel jLabelEmployee;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelSalary;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLoan;
    // End of variables declaration//GEN-END:variables
}
