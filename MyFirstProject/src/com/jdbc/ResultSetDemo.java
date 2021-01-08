package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetDemo {
    public static void main(String[] args) {
        Connection con = null;
        try {
            //1. Load driver
            Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.getDriver("com.mysql.jdbc.Driver");

            //2. Establish the connection
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
            System.out.println("Connected");
            System.out.println(con.getClass().getName());

            String query = "select * from products";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt(3));
                System.out.println("************************");
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
