package day01;
/*
 * 8、自定义一个字符串。用户键盘录入一个字符。判断该字符是否在自定义的字符串中（使用toCharArray方法）
 */
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456789";
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个字符:");
		String c=sc.next();
		char[] arr=s.toCharArray();
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==c.charAt(0)) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("字符"+c.charAt(0)+"在自定义字符串中");
		}else {
			System.out.println("字符"+c.charAt(0)+"不在自定义字符串中");
		}
		
	}

}
