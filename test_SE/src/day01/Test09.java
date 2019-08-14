package day01;
/*
 * 9、会员注册
要求：
·用户名长度不小于3
·密码长度不小于6
·注册时两次输入密码必须相同 
 */
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="";
		String pwd="";
		String repwd="";
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入用户名:");
		username=sc.next();
		System.out.print("请输入密码:");
		pwd=sc.next();
		System.out.print("请再次输入密码:");
		repwd=sc.next();
		if (username.length()<3||pwd.length()<6) {
			System.out.println("用户名长度不能小于3，密码长度不能小于6！");
		}else {
			if (!repwd.equals(pwd)) {
				System.out.println("两次输入的密码不同！");
			}else {
				System.out.println("注册成功！请牢记用户名和密码。");
			}
		}
	}

}
