import java.sql.*;
public class JdbcType4Demo {
	public static void main(String[] args) throws Exception{
		Connection con=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = 
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("Connected");
			
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			con.close();
		}
	}

}
