package day08;

import java.util.Scanner;

public class test06_user {
	String username;
	String userpwd;
	public void update(String name,String pwd){
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名:");
		String inputName=sc.next();
		System.out.print("请输入密码:");
		String inputPwd=sc.next();
		if ((!inputName.equals(name))||(!inputPwd.equals(pwd))) {
			System.out.println("用户名和密码不正确！您没有权限更新管理员的信息。");
		}else {
			System.out.println();
			System.out.print("请输入新的密码:");
			String newPwd=sc.next();
			pwd=newPwd;
			System.out.println("修改密码成功,您的密码为:"+pwd);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test06_user tUser=new test06_user();
		tUser.username="admin1";
		tUser.userpwd="111111";
		tUser.update(tUser.username, tUser.userpwd);
	}

}
