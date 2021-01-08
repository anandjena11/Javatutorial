package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

    public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        try {
            //1. Load driver
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.getDriver("com.mysql.jdbc.Driver");

            //2. Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connected");
            System.out.println(con.getClass().getName());

            statement = con.createStatement();
            String query = "insert into products values('109','Laptop',25)";
            int records = statement.executeUpdate(query);
            if(records > 0){
                System.out.println("Record inserted");
            } else {
                System.out.println("Record not inserted");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
