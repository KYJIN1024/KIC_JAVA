import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "123456";
		
		Connection conn = null;
		Statement stmt  = null;
		ResultSet rs = null;
		
			try {
				//처리 로직
				Class.forName("org.mariadb.jdbc.Driver");
				System.out.println("드라이버 로딩 완료");

				conn = DriverManager.getConnection(url, user, password);
				System.out.println("연결성공");
				
				stmt = conn.createStatement();
				
				String sql = "select * from dept2";
				
				rs = stmt.executeQuery( sql );
				
				while ( rs.next() ) {
					System.out.println( rs.getString( "deptno" ) );
					System.out.println( rs.getString( "dname" )) ;
					System.out.println( rs.getString( "loc" ) );
				
				}
					
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage() );
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("[에러]"+ e.getMessage() );
			}finally {
				if(stmt != null ) try { stmt.close();} catch( SQLException e ) {} ;
				if(conn != null ) try { conn.close();} catch( SQLException e ) {} ;
		}
				
	}

}
