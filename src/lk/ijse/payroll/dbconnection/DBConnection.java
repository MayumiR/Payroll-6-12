/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.payroll.dbconnection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author Chamil
 */
public class DBConnection {

    private Connection connection;
    private static DBConnection dBConnection;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/payroll", "root","1234");
    }
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection==null){
            dBConnection=new DBConnection();
        }
        return  dBConnection;
    }
    public Connection getConnection(){
        return connection;
    }
    
}
