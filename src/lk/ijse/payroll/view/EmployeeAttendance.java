/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.view;

import com.sun.management.jmx.Trace;
import java.sql.SQLException;
//import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.payroll.business.custom.EmployeeBO;
import lk.ijse.payroll.business.custom.impl.EmployeeBOImpl;
import lk.ijse.payroll.common.IdGenerater;
import lk.ijse.payroll.controller.EmployeeAttendanceController;
import lk.ijse.payroll.controller.EmployeeRegisterController;
import lk.ijse.payroll.model.AttendanceDTO;
import lk.ijse.payroll.model.EmployeeDTO;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Shashika
 */
public class EmployeeAttendance extends javax.swing.JPanel {
    ButtonGroup bg;
    private String dayType="",date = "",employeeName;
    private int dayStatus;
    private String employeeId="";           
    DefaultTableModel dtm;          
    private EmployeeBO employeeBO;
    
    
    /**
     * Creates new form Attendance
     */
    public EmployeeAttendance() {
        initComponents();
        commenMethod();
        getCurrentDateStamp();
       
    }
    public void commenMethod(){
        loadEmployeeName();
        groupButtonAttendance();
        attendanceId();
        //tableView();
        AutoCompleteDecorator.decorate(jComboBoxEmpName);
        employeeBO = new EmployeeBOImpl();
       // dtm=(DefaultTableModel) TableAttendance.getModel();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEmpAtt = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        BtnAdd = new javax.swing.JButton();
        jXPanel1 = new org.jdesktop.swingx.JXPanel();
        jLabelEmployeeID = new javax.swing.JLabel();
        jLabelEmployeeName = new javax.swing.JLabel();
        jLabelDesignation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        TxtDesignation = new javax.swing.JTextField();
        CheckBoxHalf = new javax.swing.JCheckBox();
        RadioButtonPrasent = new javax.swing.JRadioButton();
        RadioButtonLeave = new javax.swing.JRadioButton();
        OutTimeLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelDesignation1 = new javax.swing.JLabel();
        jLabelDesignation2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        OthTxt = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        LtTxt = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jLabelEmployeeName1 = new javax.swing.JLabel();
        jTextFieldAttendanceId = new javax.swing.JTextField();
        jSeparator19 = new javax.swing.JSeparator();
        InTimeLbl = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        TxtEmployeeId = new javax.swing.JTextField();
        jComboBoxEmpName = new javax.swing.JComboBox<>();
        ToggleButtonOutTime = new javax.swing.JToggleButton();
        ToggleButtonInTime = new javax.swing.JToggleButton();
        DateLbl = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabelDesignation3 = new javax.swing.JLabel();
        TxtPresentDays = new javax.swing.JTextField();
        jSeparator20 = new javax.swing.JSeparator();
        jLabelDesignation4 = new javax.swing.JLabel();
        TxtLeaveDays = new javax.swing.JTextField();
        jSeparator21 = new javax.swing.JSeparator();
        BtnAdd1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1156, 760));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpAtt.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelEmpAtt.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmpAtt.setText(" Employee Attendance");
        add(jLabelEmpAtt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 210, 40));

        jSeparator2.setForeground(new java.awt.Color(31, 58, 147));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 68, 1640, -1));

        jSeparator4.setBackground(new java.awt.Color(210, 215, 211));
        jSeparator4.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setOpaque(true);
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 40));

        BtnAdd.setBackground(new java.awt.Color(31, 58, 147));
        BtnAdd.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        BtnAdd.setForeground(new java.awt.Color(255, 255, 255));
        BtnAdd.setText("Add");
        BtnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddActionPerformed(evt);
            }
        });
        add(BtnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 130, 30));

        jXPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jXPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jXPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmployeeID.setBackground(new java.awt.Color(1, 50, 67));
        jLabelEmployeeID.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelEmployeeID.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeID.setText("Employee ID");
        jXPanel1.add(jLabelEmployeeID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 110, 30));

        jLabelEmployeeName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelEmployeeName.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeName.setText("Employee Name");
        jXPanel1.add(jLabelEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 150, 30));

        jLabelDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelDesignation.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation.setText("Designation");
        jXPanel1.add(jLabelDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 110, 30));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(31, 58, 147));
        jLabel2.setText("Date");
        jXPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 30));

        jSeparator16.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator16.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator16.setOpaque(true);
        jXPanel1.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 190, -1));

        TxtDesignation.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtDesignation.setForeground(new java.awt.Color(31, 58, 147));
        TxtDesignation.setBorder(null);
        TxtDesignation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtDesignationKeyReleased(evt);
            }
        });
        jXPanel1.add(TxtDesignation, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 190, 30));

        CheckBoxHalf.setBackground(new java.awt.Color(255, 255, 255));
        CheckBoxHalf.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        CheckBoxHalf.setForeground(new java.awt.Color(31, 58, 147));
        CheckBoxHalf.setText(" Half-Day");
        CheckBoxHalf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxHalfActionPerformed(evt);
            }
        });
        jXPanel1.add(CheckBoxHalf, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 150, 110, -1));

        RadioButtonPrasent.setBackground(new java.awt.Color(255, 255, 255));
        RadioButtonPrasent.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        RadioButtonPrasent.setForeground(new java.awt.Color(31, 58, 147));
        RadioButtonPrasent.setText(" Prasent");
        RadioButtonPrasent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonPrasentActionPerformed(evt);
            }
        });
        jXPanel1.add(RadioButtonPrasent, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 110, 30));

        RadioButtonLeave.setBackground(new java.awt.Color(255, 255, 255));
        RadioButtonLeave.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        RadioButtonLeave.setForeground(new java.awt.Color(31, 58, 147));
        RadioButtonLeave.setText(" Leave");
        RadioButtonLeave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioButtonLeaveActionPerformed(evt);
            }
        });
        jXPanel1.add(RadioButtonLeave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 110, 30));

        OutTimeLbl.setBackground(new java.awt.Color(255, 255, 255));
        OutTimeLbl.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        OutTimeLbl.setForeground(new java.awt.Color(31, 58, 147));
        OutTimeLbl.setOpaque(true);
        jXPanel1.add(OutTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 100, 30));
        jXPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 490, 10));

        jLabelDesignation1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelDesignation1.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation1.setText("Late hours");
        jXPanel1.add(jLabelDesignation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 120, 30));

        jLabelDesignation2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelDesignation2.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation2.setText("Over Time hours");
        jXPanel1.add(jLabelDesignation2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, -1, 30));
        jXPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, 490, 10));

        OthTxt.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        OthTxt.setForeground(new java.awt.Color(31, 58, 147));
        OthTxt.setBorder(null);
        OthTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                OthTxtKeyReleased(evt);
            }
        });
        jXPanel1.add(OthTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 200, 70, 30));

        jSeparator17.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator17.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator17.setOpaque(true);
        jXPanel1.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 230, 70, -1));

        LtTxt.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        LtTxt.setForeground(new java.awt.Color(31, 58, 147));
        LtTxt.setBorder(null);
        LtTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                LtTxtKeyReleased(evt);
            }
        });
        jXPanel1.add(LtTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 240, 70, 30));

        jSeparator18.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator18.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator18.setOpaque(true);
        jXPanel1.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, 70, -1));

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jXPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 10, 260));

        jLabelEmployeeName1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelEmployeeName1.setForeground(new java.awt.Color(31, 58, 147));
        jLabelEmployeeName1.setText("Attendance ID");
        jXPanel1.add(jLabelEmployeeName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 150, 30));

        jTextFieldAttendanceId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jTextFieldAttendanceId.setForeground(new java.awt.Color(31, 58, 147));
        jTextFieldAttendanceId.setBorder(null);
        jTextFieldAttendanceId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAttendanceIdActionPerformed(evt);
            }
        });
        jXPanel1.add(jTextFieldAttendanceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, 50, 30));

        jSeparator19.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator19.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator19.setOpaque(true);
        jXPanel1.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 50, -1));

        InTimeLbl.setBackground(new java.awt.Color(255, 255, 255));
        InTimeLbl.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        InTimeLbl.setForeground(new java.awt.Color(31, 58, 147));
        InTimeLbl.setOpaque(true);
        jXPanel1.add(InTimeLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 80, 100, 30));

        jSeparator22.setBackground(new java.awt.Color(31, 58, 147));
        jSeparator22.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator22.setOpaque(true);
        jXPanel1.add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 70, -1));

        TxtEmployeeId.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtEmployeeId.setForeground(new java.awt.Color(31, 58, 147));
        TxtEmployeeId.setBorder(null);
        TxtEmployeeId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtEmployeeIdActionPerformed(evt);
            }
        });
        jXPanel1.add(TxtEmployeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 85, 70, -1));

        jComboBoxEmpName.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jComboBoxEmpName.setForeground(new java.awt.Color(31, 58, 147));
        jComboBoxEmpName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxEmpNameActionPerformed(evt);
            }
        });
        jXPanel1.add(jComboBoxEmpName, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 190, 30));

        ToggleButtonOutTime.setBackground(new java.awt.Color(255, 255, 255));
        ToggleButtonOutTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        ToggleButtonOutTime.setText("Out");
        ToggleButtonOutTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonOutTimeActionPerformed(evt);
            }
        });
        jXPanel1.add(ToggleButtonOutTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 50, 30));

        ToggleButtonInTime.setBackground(new java.awt.Color(255, 255, 255));
        ToggleButtonInTime.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 11)); // NOI18N
        ToggleButtonInTime.setText("In");
        ToggleButtonInTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ToggleButtonInTimeActionPerformed(evt);
            }
        });
        jXPanel1.add(ToggleButtonInTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 80, -1, 30));

        DateLbl.setBackground(new java.awt.Color(255, 255, 255));
        DateLbl.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        DateLbl.setForeground(new java.awt.Color(31, 58, 147));
        jXPanel1.add(DateLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 204, 190, 30));

        jTextField1.setText("jTextField1");
        jXPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        add(jXPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 1060, 280));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Attendance List", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 1, 14))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelDesignation3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelDesignation3.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation3.setText("Current Month Leave Days");
        jPanel1.add(jLabelDesignation3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 30));

        TxtPresentDays.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtPresentDays.setForeground(new java.awt.Color(31, 58, 147));
        TxtPresentDays.setBorder(null);
        TxtPresentDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtPresentDaysKeyReleased(evt);
            }
        });
        jPanel1.add(TxtPresentDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, 50, 30));

        jSeparator20.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator20.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator20.setOpaque(true);
        jPanel1.add(jSeparator20, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 50, -1));

        jLabelDesignation4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jLabelDesignation4.setForeground(new java.awt.Color(31, 58, 147));
        jLabelDesignation4.setText("Current Month Present Days");
        jPanel1.add(jLabelDesignation4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 250, 30));

        TxtLeaveDays.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        TxtLeaveDays.setForeground(new java.awt.Color(31, 58, 147));
        TxtLeaveDays.setBorder(null);
        TxtLeaveDays.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtLeaveDaysKeyReleased(evt);
            }
        });
        jPanel1.add(TxtLeaveDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 50, 30));

        jSeparator21.setBackground(new java.awt.Color(0, 139, 139));
        jSeparator21.setForeground(new java.awt.Color(31, 58, 147));
        jSeparator21.setOpaque(true);
        jPanel1.add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 50, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 1060, 230));

        BtnAdd1.setBackground(new java.awt.Color(31, 58, 147));
        BtnAdd1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        BtnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        BtnAdd1.setText("Cancel");
        BtnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdd1ActionPerformed(evt);
            }
        });
        add(BtnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddActionPerformed
       AttendanceDTO attendance =new AttendanceDTO(
               jTextFieldAttendanceId.getText(), 
               TxtEmployeeId.getText(),
               dayStatus,
               dayType,
               DateLbl.getText(),
               Integer.parseInt(OthTxt.getText()),
               Integer.parseInt(LtTxt.getText()),
               InTimeLbl.getText(),
               OutTimeLbl.getText());
            try {
                
                boolean result = EmployeeAttendanceController.addAttendance(attendance);
                if(validation()){
                    if (result){
                        JOptionPane.showMessageDialog(this, "Saved successfully");
                        //tableView();
                        clearTextFields();
                        attendanceId();
                        
                    }else{
                        JOptionPane.showMessageDialog(this, "Failed to Save");
                    }
                }
            } catch (Exception ex) {
                Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
            }
 
    }//GEN-LAST:event_BtnAddActionPerformed

    private void BtnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdd1ActionPerformed
        // TODO add your handling code here:
        
        
        RadioButtonLeave.setEnabled(true);
        RadioButtonPrasent.setEnabled(true);
        if(RadioButtonLeave.isSelected()){
            RadioButtonLeave.setSelected(false);
        }else if(RadioButtonPrasent.isSelected()){
           RadioButtonPrasent.setSelected(false); 
        }
        
    }//GEN-LAST:event_BtnAdd1ActionPerformed

    private void RadioButtonPrasentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonPrasentActionPerformed
        dayStatus=1;
        dayType = "FullDay";
        if(RadioButtonPrasent.isSelected()){
            RadioButtonLeave.setEnabled(false);
        }else{
            RadioButtonLeave.setEnabled(true);
        }
    }//GEN-LAST:event_RadioButtonPrasentActionPerformed

    private void RadioButtonLeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioButtonLeaveActionPerformed
        dayStatus=0;
        dayType = "FullDay";
        if(RadioButtonLeave.isSelected()){
            RadioButtonPrasent.setEnabled(false);
            CheckBoxHalf.setEnabled(false);
            InTimeLbl.setText("00:00:00");
            OutTimeLbl.setText("00:00:00");
            ToggleButtonInTime.setEnabled(false);
            ToggleButtonOutTime.setEnabled(false);
        }else{
            RadioButtonPrasent.setEnabled(false);
        }
    }//GEN-LAST:event_RadioButtonLeaveActionPerformed

    private void jTextFieldAttendanceIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAttendanceIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAttendanceIdActionPerformed

    private void TxtEmployeeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtEmployeeIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtEmployeeIdActionPerformed

    private void jComboBoxEmpNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxEmpNameActionPerformed
         AttendanceDTO attendanceDTO;
         ArrayList<AttendanceDTO> attendanceList;
        employeeName = jComboBoxEmpName.getSelectedItem().toString();
        try {
            String empoyeeName=(String) jComboBoxEmpName.getSelectedItem();
            EmployeeDTO employee=EmployeeRegisterController.searchEmployee(empoyeeName);
           
            if(employee!=null){
                TxtEmployeeId.setText(employee.getId());
                TxtDesignation.setText(employee.getDesignation());
                 attendanceDTO =EmployeeAttendanceController.getAttendanceCount(employee.getId());
                 attendanceList = EmployeeAttendanceController.getAttendanceByIdAndDate(employee.getId(), DateLbl.getText());
                 System.out.println("Today Attendance>> of "+employeeName+"-"+attendanceList.size());
                 if(attendanceList.size()>0){
                     BtnAdd.setText("Update");
                     AttendanceDTO attendanceInDatabase = attendanceList.get(0);
                    if(attendanceInDatabase.getDayType().equals("FullDay")){
                        CheckBoxHalf.setSelected(false);
                        CheckBoxHalf.setEnabled(false);
                    }else{
                        CheckBoxHalf.setEnabled(true);
                         CheckBoxHalf.setSelected(true); 
                         
                    }
                    InTimeLbl.setText(attendanceInDatabase.getInTime());
                    OthTxt.setText(""+attendanceInDatabase.getOThrs());
                    LtTxt.setText(""+attendanceInDatabase.getLateHrs());
                    RadioButtonPrasent.setSelected(true);
                     RadioButtonLeave.setEnabled(false);
                     InTimeLbl.setEnabled(false);
                     ToggleButtonInTime.setEnabled(false);
                 }else{
                     BtnAdd.setText("Add");
                     RadioButtonLeave.setEnabled(true);
                     InTimeLbl.setEnabled(true);
                     ToggleButtonInTime.setEnabled(true); 
                 }
                 
                 TxtLeaveDays.setText(""+(attendanceDTO.getLeaveCount()-attendanceDTO.getPresentCount()));
                 TxtPresentDays.setText(""+attendanceDTO.getPresentCount());
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAllowance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxEmpNameActionPerformed

    private void ToggleButtonOutTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonOutTimeActionPerformed
        if(ToggleButtonOutTime.isSelected()){
            getOutTime();
        }else{
           OutTimeLbl.setText("00:00:00");
       }
    }//GEN-LAST:event_ToggleButtonOutTimeActionPerformed

    private void ToggleButtonInTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ToggleButtonInTimeActionPerformed
        if(ToggleButtonInTime.isSelected()){
            getInTime();
        }else{
            InTimeLbl.setText("00:00:00");
        }
        
    }//GEN-LAST:event_ToggleButtonInTimeActionPerformed

    private void TxtDesignationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDesignationKeyReleased
        String txt = TxtDesignation.getText();
        int caretPosition = TxtDesignation.getCaretPosition();
        if (!txt.matches("^[A-Za-z//]*$")) {
            TxtDesignation.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            TxtDesignation.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_TxtDesignationKeyReleased

    private void OthTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_OthTxtKeyReleased
        String txt = OthTxt.getText();
        int caretPosition = OthTxt.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            OthTxt.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            OthTxt.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_OthTxtKeyReleased

    private void LtTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LtTxtKeyReleased
        String txt = LtTxt.getText();
        int caretPosition = LtTxt.getCaretPosition();
        if (!txt.matches("^[\\d]*")) {
            LtTxt.setText(txt.substring(0, caretPosition - 1) + txt.substring(caretPosition));
            LtTxt.setCaretPosition(caretPosition - 1);
        }
    }//GEN-LAST:event_LtTxtKeyReleased

    private void CheckBoxHalfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxHalfActionPerformed
        dayType="Half Day";
    }//GEN-LAST:event_CheckBoxHalfActionPerformed

    private void TxtPresentDaysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPresentDaysKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPresentDaysKeyReleased

    private void TxtLeaveDaysKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtLeaveDaysKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtLeaveDaysKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdd;
    private javax.swing.JButton BtnAdd1;
    private javax.swing.JCheckBox CheckBoxHalf;
    private javax.swing.JLabel DateLbl;
    private javax.swing.JLabel InTimeLbl;
    private javax.swing.JTextField LtTxt;
    private javax.swing.JTextField OthTxt;
    private javax.swing.JLabel OutTimeLbl;
    private javax.swing.JRadioButton RadioButtonLeave;
    private javax.swing.JRadioButton RadioButtonPrasent;
    private javax.swing.JToggleButton ToggleButtonInTime;
    private javax.swing.JToggleButton ToggleButtonOutTime;
    private javax.swing.JTextField TxtDesignation;
    private javax.swing.JTextField TxtEmployeeId;
    private javax.swing.JTextField TxtLeaveDays;
    private javax.swing.JTextField TxtPresentDays;
    private javax.swing.JComboBox<String> jComboBoxEmpName;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDesignation;
    private javax.swing.JLabel jLabelDesignation1;
    private javax.swing.JLabel jLabelDesignation2;
    private javax.swing.JLabel jLabelDesignation3;
    private javax.swing.JLabel jLabelDesignation4;
    private javax.swing.JLabel jLabelEmpAtt;
    private javax.swing.JLabel jLabelEmployeeID;
    private javax.swing.JLabel jLabelEmployeeName;
    private javax.swing.JLabel jLabelEmployeeName1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAttendanceId;
    private org.jdesktop.swingx.JXPanel jXPanel1;
    // End of variables declaration//GEN-END:variables

   

    private void loadEmployeeName() {
         try {
            ArrayList<String>employeeNames=EmployeeRegisterController.getAllEmployeeNames();
            for (String employeeName : employeeNames) {
                jComboBoxEmpName.addItem(employeeName);
            }
        } catch (Exception ex) {
            Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

    

    private void groupButtonAttendance() {
       bg= new ButtonGroup();
        
        bg.add(RadioButtonPrasent);
        bg.add(RadioButtonLeave);
    }

    private void attendanceId() {
        try {
            String attendanceId;
            attendanceId = IdGenerater.getNewID("attendance", "Id", "A");
            jTextFieldAttendanceId.setText(attendanceId);
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(EmployeeAttendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
//    private void tableView() {
//        try {
//
//            ArrayList<AttendanceDTO> allAttendances= EmployeeAttendanceController.getAttendance();
//            //dtm = (DefaultTableModel) TableAttendance.getModel();
//            dtm.setRowCount(0);
//            if(allAttendances==null){return;}
//            
//                dtm.setRowCount(0);
//            for (AttendanceDTO attendance : allAttendances) {
//
//                    Object[] rowData = {
//                        attendance.getEmployeeId(),
//                        EmployeeRegisterController.searchEmployeeID(attendance.getEmployeeId()).getName(),
//                        EmployeeRegisterController.searchEmployeeID(attendance.getEmployeeId()).getDesignation(),
//                        attendance.getDate(),
//                        attendance.getDayStatus(),
//                        attendance.getInTime(),
//                        attendance.getOutTime()
//                    };
//                    dtm.addRow(rowData);
//
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(EmployeeRegister.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    
    public void clearTextFields(){
        TxtEmployeeId.setText("");
        TxtDesignation.setText("");
        CheckBoxHalf.setSelected(false);
        OthTxt.setText("");
        LtTxt.setText("");
        bg.clearSelection();
       
    }
    
    public boolean validation(){
        if( OthTxt.getText().equals("") || LtTxt.getText().equals("")){
            return false;
        }else if(OthTxt.getText()== null || LtTxt.getText()== null ){
            return false;
        }
        return true;
    }



    private void getInTime() {
        new Thread() {
            int timeRun = 0;

            public void run() {
                while (timeRun == 0) {

                    Calendar calendar = new GregorianCalendar();
                    int hour = calendar.get(Calendar.HOUR);
                    int minutes = calendar.get(Calendar.MINUTE);
                    int second = calendar.get(Calendar.SECOND);
                    int ampm = calendar.get(Calendar.AM_PM);
                   

                    String daynight;
                    
                    if (ampm == 1) {
                        daynight = "PM";
                    } else {
                        daynight = "AM";
                    }
                    
                    String timeset = hour + ":" + minutes + ":" + second + ":" + daynight;

                    String Time = timeset;
                    InTimeLbl.setText(Time);
                    InTimeLbl.setText(timeset);
                    
                    
                }
            }

        }.start();
    }

    private void getOutTime() {
         new Thread() {
            int timeRun = 0;

            public void run() {
                while (timeRun == 0) {

                    Calendar calendar = new GregorianCalendar();
                    int hour = calendar.get(Calendar.HOUR);
                    int minutes = calendar.get(Calendar.MINUTE);
                    int second = calendar.get(Calendar.SECOND);
                    int ampm = calendar.get(Calendar.AM_PM);
                   

                    String daynight;
                    
                    if (ampm == 1) {
                        daynight = "PM";
                    } else {
                        daynight = "AM";
                    }
                    
                    String timeset = hour + ":" + minutes + ":" + second + ":" + daynight;

                    String Time = timeset;
                    
                    OutTimeLbl.setText(Time);
                    OutTimeLbl.setText(timeset);
                    
                }
            }

        }.start();
    }

    private void getCurrentDateStamp() {
        new Thread() {
            int timeRun = 0;

            public void run() {
                while (timeRun == 0) {

                    Calendar calendar = new GregorianCalendar();
                    int hour = calendar.get(Calendar.HOUR) + 12;
                    int minutes = calendar.get(Calendar.MINUTE);
                    int second = calendar.get(Calendar.SECOND);
                    int year = calendar.get(Calendar.YEAR);
                    int month = calendar.get(Calendar.MONTH) + 1;
                    int day = calendar.get(Calendar.DATE);
                    int ampm = calendar.get(Calendar.AM_PM);
                    int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);
                    int name_of_day = calendar.get(Calendar.DAY_OF_WEEK);

                    String daynight;
                    String day_name;

                    if (ampm == 1) {
                        daynight = "PM";
                    } else {
                        daynight = "AM";
                    }
                    if (name_of_day == 1) {
                        day_name = "Sunday";

                    } else if (name_of_day == 2) {
                        day_name = "Monday";
                    } else if (name_of_day == 3) {
                        day_name = "Tuesday";
                    } else if (name_of_day == 4) {
                        day_name = "Wednesdsy";
                    } else if (name_of_day == 5) {
                        day_name = "Thursday";
                    } else if (name_of_day == 6) {
                        day_name = "Friday";
                    } else {
                        day_name = "Saturday";
                    }
                    //String dateset = year + "/" + month + "/" + day + " " + day_name + "";
                    String dateset = year + "-" + month + "-" + day+"";
                    String timeset = hour + ":" + minutes + ":" + second + ":" + daynight;

                    String dateAndTime =  dateset;
                    DateLbl.setText(dateAndTime);
                    DateLbl.setText(dateset);
                }
            }

        }.start();

    }
    
}
