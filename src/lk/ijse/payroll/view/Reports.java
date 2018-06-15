/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.view;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.payroll.dbconnection.DBConnection;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Chamil
 */
public class Reports extends javax.swing.JPanel {

    /**
     * Creates new form Reports
     */
    public Reports() {
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

        attendance = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1156, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        attendance.setText("EmployeeDetails");
        attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                attendanceActionPerformed(evt);
            }
        });
        add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 140, 30));

        jButton2.setText("Attendance");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_attendanceActionPerformed
       InputStream input=getClass().getResourceAsStream("/lk/ijse/payroll/report/employeeDetails_1.jasper");
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
    }//GEN-LAST:event_attendanceActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       InputStream input=getClass().getResourceAsStream("/lk/ijse/payroll/report/employeeAttendance.jasper");
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
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton attendance;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
