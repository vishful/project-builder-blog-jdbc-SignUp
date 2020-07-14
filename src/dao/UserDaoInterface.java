package dao;

import java.sql.SQLException;

import model.User;

public interface UserDaoInterface{
	int signUp(User user) throws SQLException, Exception;
	boolean loginUser(User user) throws SQLException, Exception;
	
}