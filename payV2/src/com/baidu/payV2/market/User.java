package com.baidu.payV2.market;

public class User {
	private String admin;
	private String username;
	private String userpwd;
	private String address;
	public User(){
		
	}
	public User(String admin, String username, String userpwd, String address) {
		super();
		this.admin = admin;
		this.username = username;
		this.userpwd = userpwd;
		this.address = address;
	}
	public String getAdmin() {
		return admin;
	}
	public void setAdmin(String admin) {
		if (admin.length()==22) {
			this.admin = admin;
		}else {
			System.out.println("你的账号不符合规范");
		}
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return userpwd;
	}
	
	public void setUserpwd(String userpwd) {
		if (userpwd.length()==6) {
			this.userpwd = userpwd;
		}else {
			System.out.println("您的密码错误");
		}
		
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
