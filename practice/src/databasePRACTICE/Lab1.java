package databasePRACTICE;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class Lab1 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost:3306/practice";
        String username = "root";
        String password = "butter0025_P";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Database Connected");
            Statement statement = con.createStatement();
            ResultSet results = statement.executeQuery("select * from student");

            while(results.next()){
                System.out.println(results.getString(1) + " " + results.getString(2) + " " 
                        + results.getString(3) + " " + results.getString(4) + " " + results.getString(5));
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
