package day03_test;

import java.util.Scanner;

public class Lucky {
	public static void main(String[] args) {
		System.out.println("请输入4位会员号:");
		Scanner input =new Scanner(System.in);
		int cardNum=input.nextInt();
		int baiwei=cardNum/100%10;
		int random=(int)(Math.random()*10);//0-9随机数
		if(random==baiwei){
			System.out.println(cardNum+"号客户是幸运客户，获精美Mp3一个。");
		}else{
			System.out.println(cardNum+"号客户,谢谢您的支持!");
		}
	}
}
