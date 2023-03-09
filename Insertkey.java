import java.sql.*;
import java.util.*;
class Insertkey
{
  public static void main(String args[])
  {
   try
   {
	int id;
	String name;
	Scanner s=new Scanner(System.in);
	System.out.println("enter id");
	id=s.nextInt();
	System.out.println("enter name");
	name=s.next();

     	Class.forName("oracle.jdbc.driver.OracleDriver");
     	System.out.println("Driver registered");
     	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
	String sql="insert into hemanii values(?,?)";
	PreparedStatement stmt=con.prepareStatement(sql);
	
	stmt.setInt(1,id);
	stmt.setString(2,name);
	int i=stmt.executeUpdate();
	System.out.println(i+"records inserted");
   }
   catch(Exception e)
   {
   	System.out.println(e);
   }
 } 
}