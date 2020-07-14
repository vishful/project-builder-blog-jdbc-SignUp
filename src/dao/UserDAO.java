package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import model.User;
import utility.ConnectionManager;

public class UserDAO implements UserDaoInterface{
	public int signUp(User user) throws SQLException, Exception {

		String email = user.getEmail();
		String password=user.getPassword();
		LocalDate date=user.getDate();
		
		
		ConnectionManager cm=new ConnectionManager();
		//insert all the details into database
		
		String sql="insert into TEAM(NAME,COACH,CAPTAIN,CITY)VALUES(?,?)";
		//Create statement object
		PreparedStatement st= cm.getConnection().prepareStatement(sql);
		
		
		st.setString(1, email);
		st.setString(2, password);
		st.setObject(3, date);
		st.executeUpdate();
		cm.getConnection().close();
		
		return 0;
		
	}
	
	
	public boolean loginUser(User user) throws SQLException, Exception {
		String email=user.getEmail();
		String password=user.getPassword();
		
		ConnectionManager con=new ConnectionManager();
		Statement st=con.getConnection().createStatement();
		
		
		ResultSet rs=st.executeQuery("SELECT * FROM USERDETAILS");
		
		while(rs.next()) {
			if(email.equals(rs.getString("EMAIL")) && password.equals("PASSWORD")) 
	{                                                                                                                                                                                                                                                                                         
				con.getConnection().close();
				return true;
			}
	else {
			con.getConnection().close();
			return false;
			}
		}
		return false;
	}
	
}