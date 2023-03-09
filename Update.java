import java.sql.*;
class Update
{
  public static void main(String args[])
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver registered");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     Statement s=c.createStatement();
     String sql="update hemanii set EID=12 where ename='jesica'";
      s.executeUpdate(sql);
     
     
    
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
