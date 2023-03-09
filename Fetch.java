import java.sql.*;
class Fetch
{
  public static void main(String args[])
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver registered");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     Statement s=c.createStatement();
     String sql="select * from hemanii";
     ResultSet rs=s.executeQuery(sql);
     while(rs.next())
     {
     System.out.print(rs.getInt(1));
     System.out.print(" ");
     System.out.print(rs.getString("ENAME"));
     System.out.print("\n");
     }
   }
   catch(Exception e)
   {
	System.out.println(e);
   }
  }
}
     