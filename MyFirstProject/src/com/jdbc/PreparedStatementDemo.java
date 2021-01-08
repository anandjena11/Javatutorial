package com.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementDemo {

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

            String query = "insert into products values(?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setString(1, "108");
            statement.setString(2, "Mobile");
            statement.setInt(3, 15);
            int records = statement.executeUpdate();
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
