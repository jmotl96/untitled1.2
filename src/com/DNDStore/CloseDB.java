package com.DNDStore;

import java.sql.Connection;
import java.sql.*;

public class CloseDB {


    public static final String DRIVER_NAME = "jdbc:derby:";
    public static final String DATABASE_PATH = "/WEB-INF/lib/worldbible";
    public static final String USERNAME = "stacy";
    public static final String PASSWORD = "stacy";

    public static void closeAll(Connection conn, Statement stmt, ResultSet rset) {
        if (rset != null) {
            try {
                rset.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
