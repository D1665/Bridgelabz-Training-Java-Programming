package com.json.tutorial;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException {

        String sql="select name from student where age >20 ";
        String url="jdbc:postgresql://localhost:5432/dbdemo";
        String username="postgres";
        String password="sirsiya";

        Connection con= DriverManager.getConnection(url,username,password);
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery(sql);
        rs.next();
        String name=rs.getString(1);
        System.out.println(name);
        con.close();

    }
}
