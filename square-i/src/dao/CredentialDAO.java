package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Credential;

public class CredentialDAO {
     Connection conn;
     public CredentialDAO()throws Exception
     {
    	 conn=utility.DBConn.getMySQLConnection();
     }
     public void insertCredential(Credential credential)throws Exception
     {
    	 PreparedStatement psmt=conn.prepareStatement("insert into Customer values(?,?,?,?,?,?)");
    		psmt.setString(1,credential.getUsername());	 
    		psmt.setString(2,credential.getEmail());	 
    		psmt.setString(3,credential.getPhonenumber());	 
    		psmt.setString(4,credential.getPossibledateforvisit());
    		psmt.setString(5,credential.getSubject());
    		psmt.setString(6,credential.getAdditionalmessage());
    		int row_eff=psmt.executeUpdate();
    		
    		
    		
     }
}
