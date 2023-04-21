import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ArrayListEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1 = new ArrayList<>;
		a.add( "홍길동" );
		a.add( "박문수" );
		a.add( "이묭룡" );
		
		a1.remove(0);
		
		System.out.println( a1 );
		
		Vector<String> v = new Vector<>();
		v.add( "홍길동" );
		v.add( "박문수" );
		v.add( "이묭룡" );
		
		System.out.println( v );
		
		v.remove(0);
		
		System.out.println( v) ;
		//다형 추상의원리
		List<String> l1 = new Array() {
			
			@Override
			public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBaseTypeName() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBaseType() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void free() throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};() {
			
			@Override
			public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBaseTypeName() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBaseType() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void free() throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};() {
			
			@Override
			public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public ResultSet getResultSet() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getBaseTypeName() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public int getBaseType() throws SQLException {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(long index, int count) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray(Map<String, Class<?>> map) throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Object getArray() throws SQLException {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public void free() throws SQLException {
				// TODO Auto-generated method stub
				
			}
		};<>();
		l1.add( "홍길동" );
		l1.add( "박문수" );
		l1.add( "이묭룡" );
		System.out.println( l1 );
		
		List<String> l2 = new Vector<>();
		l2.add( "홍길동" );
		l2.add( "박문수" );
		l2.add( "이묭룡" );
		System.out.println( l2 );
	}

}
