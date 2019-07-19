package day05;

import java.util.Scanner;

public class Caculator {
	public double loan(double loan,int yearchoice){
		
		if (yearchoice==1) {
			return loan*(1+0.0603)/36;
		}else if (yearchoice==2) {
			return loan*(1+0.0612)/60;
		}else if (yearchoice==3) {
			return loan*(1+0.0639)/240;
		}else {
			System.out.println("选择错误!");
			return -1;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入贷款金额:");
		double loan=sc.nextDouble();
		System.out.println("请选择贷款年限: 1.3年(36个月) 2.5年(60个月) 3.20年(240个月)");
		int yearchoice=sc.nextInt();
		Caculator caculator=new Caculator();
		if (caculator.loan(loan, yearchoice)!=-1) {
			System.out.println("* * *月供为: "+caculator.loan(loan, yearchoice));
		}
	}
	
}
