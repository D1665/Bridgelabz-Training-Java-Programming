package com.json.tutorial;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CP {
    public static Connection createCon() throws IOException, SQLException {
        String url="jdbc:postgresql://localhost:5432/dbdemo";
        String username="postgres";
        String password="sirsiya";

        Connection con= DriverManager.getConnection(url,username,password);
        return con;
    }
}
