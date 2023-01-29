package utility;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
public static Connection getMySQLConnection()throws Exception
{
   Class.forName("com.mysql.cj.jdbc.Driver");
   System.out.println("get");
  
   Connection conn=DriverManager.getConnection("jdbc:mysql://blog-db.cqitiyvqbrug.us-east-2.rds.amazonaws.com:3306/my","durgesh","durgesh305");
   System.out.println("post");
   return conn;
}
}
