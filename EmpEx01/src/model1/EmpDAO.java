package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {

	private Connection conn = null;

	public EmpDAO() {

		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "123456";

		try {
			Class.forName( "org.mariadb.jdbc.Driver" );
			this.conn = DriverManager.getConnection( url, user, password );
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		}

	}
	public ArrayList<EmpcodeTO> searchEmp( String strEmp){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<EmpcodeTO> name = new ArrayList<>();
		try {
			String sql = "select empno, ename, deptno, sal, hiredate, job from empno where ename like ?";
			pstmt = this.conn.prepareStatement( sql );
			pstmt.setString( 1, strEmp + "%" );

			rs = pstmt.executeQuery();
			while(rs.next()) {
				EmpcodeTO to = new EmpcodeTO();
				to.setEmpno( rs.getString( "empno" ));
				to.setEname(rs.getString( "ename" ));
				to.setDeptno(rs.getString( "deptno" ));
				to.setSal(rs.getString( "sal" ));
				to.setHiredate(rs.getString( "hiredate" ));
				to.setJob(rs.getString( "job" ));

				name.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}

	return name;

}
}
















