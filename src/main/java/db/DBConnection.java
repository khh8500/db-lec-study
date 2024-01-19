package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getInstance() { // DB연결이 목적인 소켓-소켓 객체 생성
        String username = "root";
        String password = "1234";
        String url = "jdbc:mariadb://localhost:3306/cosdb";

        // 프로토콜이 적용된 소켓
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("db connect success");
            return conn;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
