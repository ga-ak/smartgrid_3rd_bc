package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public abstract class DAO_default {
    Connection conn = DBCP.getConnection();
    PreparedStatement psmt = null;

    public void close() {
        if (psmt != null) {
            try {
                psmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        DBCP.freeConnection(conn);
    }
}
