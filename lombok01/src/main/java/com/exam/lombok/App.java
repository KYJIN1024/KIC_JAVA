package com.exam.lombok;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
        DeptTo to = new DeptTo( );
    	//DeptTo to = new DeptTo( "20","개발부","수업");
        to.setDeptno( "10" );
        to.setDname("연구부");
        to.setLoc("대전");
        
        System.out.println( to.getDeptno( )  );
        System.out.println( to.getDname( )  );
        System.out.println( to.getLoc( )  );
        
        System.out.println( to );
        System.out.println( to.toString() );
        
        
    }
}
