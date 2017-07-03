package service.impl;

import java.util.List;

import com.mysql.jdbc.Connection;

import dbc.DatabaseConnection;
import factory.DAOFactory;
import vo.User;

public class UserServiceImpl {
private DatabaseConnection dbc = new DatabaseConnection();
	
	public Boolean changePassword(String userName,String oldPassword,String newPassword) throws Exception{
		try {
            return DAOFactory.getIUserDAOInstance((Connection) this.dbc.getConn()).changePassword(userName, oldPassword, newPassword);
        } catch (Exception e) {
            throw e;
        } finally {
            this.dbc.close();
        }
		
	}
	public List<User> validMessage(String phoneNumber,String validCode) throws Exception{
		try{
			return DAOFactory.getIUserDAOInstance((Connection) this.dbc.getConn()).validMessage(phoneNumber, validCode);
		}catch(Exception e){
			throw e;
		}finally{
			this.dbc.close();
		}
	}

}