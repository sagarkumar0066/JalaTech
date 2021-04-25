package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class sqlException 
{
	public static void main(String args[]) throws Exception
	{
		initializeConnection();
		fetchData();
	}
	static Connection initializeConnection() throws Exception
	  {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalearn", "root","X12@mysql"); //  here  i am giving wrong password to rise sql exception
		  return con;
	  }
	static void fetchData() throws Exception
	{
		Connection con = sqlException.initializeConnection();
		  Statement st = con.createStatement();
		  ResultSet rs = st.executeQuery("select * from student");
		  
		  while(rs.next())
		  {
		      System.out.println(rs.getInt("Id")+" "+rs.getInt("rollno")+" "+rs.getString("sname"));
		  }
		  
		  
		  Statement st1 = con.createStatement();
		  ResultSet rss = st1.executeQuery("select sname from student where Id =3");
		  rss.next();
		  System.out.println(rss.getString("sname"));
	}
}
