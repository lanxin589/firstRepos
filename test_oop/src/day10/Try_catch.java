package day10;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 1、根据编号输出课程名称
	输入课程代号：1～3之间的数字：分别代表C#编程，Java编程，SQL基础。
	不论前面代码是否有异常，都会输出：欢迎提出建议!
 */
public class Try_catch {
	public void input() throws InputMismatchException{
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入课程代号(1~3之间的数字):");
		try {
			int num=sc.nextInt();
			if (num==1) {
				System.out.println("C#编程");
			}
			else if (num==2) {
				System.out.println("Java编程");
			}else if (num==3) {
				System.out.println("SQL基础");
			}
			else {
				System.out.println("输入的代号必须在1~3之间");
			}
		} finally {
			sc.close();
			System.out.println("欢迎提出建议！");
		}
	}
	public static void main(String[] args) {
		Try_catch try_catch=new Try_catch();
		try {
			try_catch.input();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("输入不为数字!");
			e.printStackTrace();
		}
		
		
	}
}
