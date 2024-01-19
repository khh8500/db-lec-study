package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BankApp {
    public static void main(String[] args) {
        Connection conn = DBConnection.getInstance();
        try {
            String delete = "DELETE FROM account_tb WHERE number = 1";
            PreparedStatement pstmt = conn.prepareStatement(delete);
            int num = pstmt.executeUpdate();
            System.out.println(num);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
