package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class EmpListModel extends AbstractListModel<String> {
	private ArrayList<String> items = new ArrayList<>();

	public EmpListModel(String strEmp) {

		String url = "jdbc:mariadb://localhost:3306/sample";
		String user = "root";
		String password = "123456";

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);

			String sql = "select empno, ename, deptno, sal, hiredate, job from emp where ename like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strEmp + "%");

			rs = pstmt.executeQuery();
			while( rs.next()) {
				String empno = rs.getString( "empno" );
				String ename = rs.getString( "ename" );
				String deptno = rs.getString( "deptno" );
				String sal = rs.getString( "sal" );
				String hiredate = rs.getString( "hiredate" );
				String job = rs.getString( "job" );

				String address = String.format("[%s] %s %s %s %s %s",
						empno, ename, deptno, sal, hiredate, job );
				items.add( address + System.lineSeparator() );

			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println( "[에러] " + e.getMessage() );
		} finally {
			if( rs != null ) try { rs.close(); } catch( SQLException e ) {}
			if( pstmt != null ) try { pstmt.close(); } catch( SQLException e ) {}
			if( conn != null ) try { conn.close(); } catch( SQLException e ) {}
		}

	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return items.size();
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return items.get(index);
	}



}
