/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.controller;

import java.util.ArrayList;
import lk.ijse.payroll.business.custom.AttendanceBO;
import lk.ijse.payroll.business.custom.EmployeeBO;
import lk.ijse.payroll.business.custom.impl.AttendanceBOImpl;
import lk.ijse.payroll.business.custom.impl.EmployeeBOImpl;
import lk.ijse.payroll.model.AttendanceDTO;
import lk.ijse.payroll.model.EmployeeDTO;

/**
 *
 * @author Chamil
 */
public class EmployeeAttendanceController {
    public static AttendanceBO attendanceBO=new AttendanceBOImpl();
    public static EmployeeBO employeeBO=new EmployeeBOImpl();
    
    public static EmployeeDTO searchEmployee(String employeeID) throws Exception {
        return employeeBO.searchEmployee(employeeID);
    }

    public static boolean addAttendance(AttendanceDTO attendance) throws Exception {
        return attendanceBO.addAttendance(attendance);
    }

    public static ArrayList<AttendanceDTO> getAttendance() {
        return attendanceBO.getAllAttendance();
    }

   public static ArrayList<AttendanceDTO> getAttendanceById(String id) throws Exception {
        return attendanceBO.getEmployeeAttendanceById(id);
    }

    
}

    
    

