package userbackend.model;

import java.io.Serializable;
import java.util.List;

public class Users implements Serializable {

	private String userName;
	private String password;
	
	public Users() {}
	
	public Users(String userName, String password) {
		this.userName=userName;
		this.password=password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
