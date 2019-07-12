package day02;
/*
 * 定义一个网络用户类 成员变量有 用户ID、用户密码、email地址。有多样的构造方法
 */
public class test07_NetUser {
	String ID;//用户ID
	String password;//用户密码
	String email;//地址
	public test07_NetUser(){
		
	}
	public test07_NetUser(String ID){
		this.ID=ID;
		this.password="123456";
		this.email="741459927@qq.com";
	}
	public test07_NetUser(String iD, String password, String email) {
		ID = iD;
		this.password = password;
		this.email = email;
	}
	
}
