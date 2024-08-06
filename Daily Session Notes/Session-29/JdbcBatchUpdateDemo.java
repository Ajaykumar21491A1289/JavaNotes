import java.sql.*;
public class JdbcBatchUpdateDemo {
	public static void main(String[] args) throws Exception{
		Connection con = null;
		Statement st = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			st = con.createStatement();
			st.addBatch("insert into books values (444,'jsp',600)");
			st.addBatch("insert into books values (555,'servlets',550)");
			int[] n = st.executeBatch();
			System.out.println(n.length+" records inserted");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			st.close();
			con.close();
		}

	}

}
