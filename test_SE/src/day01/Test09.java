package day01;
/*
 * 9����Աע��
Ҫ��
���û������Ȳ�С��3
�����볤�Ȳ�С��6
��ע��ʱ�����������������ͬ 
 */
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username="";
		String pwd="";
		String repwd="";
		Scanner sc=new Scanner(System.in);
		System.out.print("�������û���:");
		username=sc.next();
		System.out.print("����������:");
		pwd=sc.next();
		System.out.print("���ٴ���������:");
		repwd=sc.next();
		if (username.length()<3||pwd.length()<6) {
			System.out.println("�û������Ȳ���С��3�����볤�Ȳ���С��6��");
		}else {
			if (!repwd.equals(pwd)) {
				System.out.println("������������벻ͬ��");
			}else {
				System.out.println("ע��ɹ������μ��û��������롣");
			}
		}
	}

}
