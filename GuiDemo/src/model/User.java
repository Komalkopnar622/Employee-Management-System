package model;

public class User {
	String username;
	String password;
	String city;
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "\n User: [username=" + username + ", password=" + password + ", city=" + city + "]";
	}
	
	
	

}
