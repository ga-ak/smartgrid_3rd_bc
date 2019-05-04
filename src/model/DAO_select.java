package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DAO_select extends DAO_default{
    ResultSet rs = null;

    @Override
    public void close() {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        super.close();
    }
}
