package address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class DatabaseHandler {
    private static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/address_db";
    private static final String USER = "project";
    private static final String PASS = "1234";

    public ArrayList<String> getAddressData(String sido, String gugun, String dong) {
        ArrayList<String> resultList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String query = "SELECT * FROM address_data WHERE sido = '" + sido + "' AND gugun = '" + gugun + "' AND dong = '" + dong + "';";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String zipCode = rs.getString("zipcode");
                String ri = rs.getString("ri");
                String rangeBunji = rs.getString("range_bunji");
                String result = String.format("우편번호: %s, 시도: %s, 구군: %s, 동: %s, 리: %s, 번지: %s",
                        zipCode, sido, gugun, dong, ri, rangeBunji);
                resultList.add(result);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }

    public ArrayList<String> getSidoData() {
        ArrayList<String> resultList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String query = "SELECT DISTINCT sido FROM address_data ORDER BY sido;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String sido = rs.getString("sido");
                resultList.add(sido);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }

    public ArrayList<String> getGugunData(String sido) {
        ArrayList<String> resultList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String query = "SELECT DISTINCT gugun FROM address_data WHERE sido = '" + sido + "' ORDER BY gugun;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                String gugun = rs.getString("gugun");
                resultList.add(gugun);
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return resultList;
    }

    public ArrayList<String> getDongData(String sido, String gugun) {
        ArrayList<String> resultList = new ArrayList<>();

        try {
            Class.forName(JDBC_DRIVER);
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();

            String query = "SELECT DISTINCT dong FROM address_data WHERE sido = '" + sido + "' AND gugun = '" + gugun + "' ORDER BY dong;";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
       String dong = rs.getString("dong");
            resultList.add(dong);
        }

        rs.close();
        stmt.close();
        conn.close();
    } catch (Exception e) {
        e.printStackTrace();
    }

    return resultList;
}
}