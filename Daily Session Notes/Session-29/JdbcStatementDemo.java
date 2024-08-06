import java.sql.*;
public class JdbcStatementDemo {
	public static void main(String[] args) throws Exception{
		Connection con = null;
		Statement st = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = 
DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			st = con.createStatement();
/*st.execute("create table books (bno number(3),bname varchar(10),price number(4))");
	        System.out.println("Table Created");*/
			/*st.executeUpdate("insert into books values (111,'java',500)");
			st.executeUpdate("insert into books values (222,'xml',800)");
			st.executeUpdate("insert into books values (333,'html',400)");
			System.out.println("Inserted");*/
			/*int n = st.executeUpdate("update books set price=700");
			System.out.println(n+" records updated");*/
			/*int n = st.executeUpdate("delete from books where bno=222");
			System.out.println(n+" records deleted");*/
			ResultSet rs = st.executeQuery("select * from books");
			while (rs.next())
			{
				System.out.print(rs.getInt("bno")+" ");
				System.out.print(rs.getString("bname")+" ");
				System.out.println(rs.getInt(3));
			}
		}
		catch(Exception e)
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
