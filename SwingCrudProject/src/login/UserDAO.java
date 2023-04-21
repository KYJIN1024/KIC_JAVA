package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/motel_admin";
    private static final String DB_USER = "project";
    private static final String DB_PASSWORD = "1234";

    public boolean login(String username, String password) throws SQLException {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "SELECT * FROM users WHERE username = ? AND password = ?";  // users테이블에서 username과 pw가 일치하는 레코드 선택
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setString(1, username);
                statement.setString(2, password);   //사용자 이름과 비밀번호 할당받음

                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next(); // 포함되는 레코드가 있는지 확인하고  일치하면 로그인 성공
                }
            }
        }
    }
}
