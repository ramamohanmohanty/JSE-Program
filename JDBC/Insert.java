import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
public class Insert {
	public static void main(String args[]){
	try{
	//step2
	//it load Driver class in JVM occupied memory space
	//oracle.jdbc.driver.OracleDriver
	//Type-4 driver for oracle server
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
		//Step-3
	//construct a Connection Object
	Connection cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");

		//Step-4
	//construct statement object
	Statement st = cn.createStatement();

		//Step-5
	//through Statement object i insert a row in the table of the Database Server
	st.executeUpdate("insert into t_stud values(101,'Ram Kumar') ");
	st.executeUpdate("insert into t_stud values(102,'Amar Kumar')");
	st.executeUpdate("insert into t_stud values(103,'Arun Kumar')");
	st.executeUpdate("insert into t_stud values(104,'Nrushingha Kumar')");
	//st.executeUpdate("insert into t_stud values(105,'Rudra Kumar')");
	System.out.println("Data is inserted in the table.");

	st.close();
	cn.close();
	}catch(ClassNotFoundException ce){
	System.out.println("Class Not Found.");
	}
	catch(SQLException se){
	se.printStackTrace();
	} 
}
	}