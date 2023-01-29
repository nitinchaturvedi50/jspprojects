package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Credentia;

public class CredentiaDAO {
     Connection conn;
     public CredentiaDAO()throws Exception
     {
    	 conn=utility.DBConn.getMySQLConnection();
     }
     public void insertCredentia(Credentia credentia)throws Exception
     {
    	 PreparedStatement psmt=conn.prepareStatement("insert into Custome values(?,?,?,?,?)");
    		psmt.setString(1,credentia.getFirstname());	 
    		psmt.setString(2,credentia.getLaststname());	 
    		psmt.setString(3,credentia.getEmail());	 
    		psmt.setString(4,credentia.getPhone());
    		psmt.setString(5,credentia.getComment());
    		
    		int row_eff=psmt.executeUpdate();
    		
    		
    		
     }
}
