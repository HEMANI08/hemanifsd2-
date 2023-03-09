import java.sql.*;
class Insert
{
  public static void main(String args[])
  {
   try
   {
     Class.forName("oracle.jdbc.driver.OracleDriver");
     System.out.println("Driver registered");
     Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
     Statement s=c.createStatement();
     String sql="insert into hemanii values(13,'Ruby')";
      s.executeUpdate(sql);
     
     String sql2="insert into hemanii values(14,'syndra')";
      s.executeUpdate(sql2);
     String sql3="insert into hemanii values(15,'Alexa')";
      s.executeUpdate(sql3);
     String sql4="insert into hemanii values(16,'Siri')";
      s.executeUpdate(sql4);
     String sql5="insert into hemanii values(17,'Jersey')";
      s.executeUpdate(sql5);
    }
    catch(Exception e)
    {
      System.out.println(e);
    }
  }
}
