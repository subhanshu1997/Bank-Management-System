import java.sql.DriverManager;
import java.sql.Connection;


public class dao {
	public static Connection getCon(){
		Connection con=null;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system","root");
	}
	catch(Exception e){
		System.out.println(e);
	}
return con;
}
}
