import java.util.*;
import java.sql.*;
public class JdbcPreparedStatementDemo {
	public static void main(String[] args) throws Exception{
		Scanner in = new Scanner(System.in);
		String choice,bname;
		int bno,price;
		PreparedStatement st = null;
		Connection con = null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			do
			{
				System.out.println("Enter Book No");
				bno = in.nextInt();
				System.out.println("Enter Book Name");
				bname = in.next();
				System.out.println("Enter book Price");
				price = in.nextInt();
				/*st = con.prepareStatement("insert into books values(?,?,?)");
				st.setInt(1, bno);
				st.setString(2,bname);
				st.setInt(3,price);*/
				st = con.prepareStatement("insert into books values ("+bno+",'"+bname+"',"+price+")");
				st.executeUpdate();
				System.out.println("Inserted");
				System.out.println("Do you want to add more records(y/n)");
				choice = in.next();
			}while (choice.equals("y"));
				
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
