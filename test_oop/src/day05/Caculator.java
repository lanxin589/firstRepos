package day05;

import java.util.Arrays;
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
			System.out.println("閫夋嫨閿欒!");
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("璇疯緭鍏ヨ捶娆鹃噾棰�:");
		double loan=sc.nextDouble();
		System.out.println("璇烽�夋嫨璐锋骞撮檺: 1.3骞�(36涓湀) 2.5骞�(60涓湀) 3.20骞�(240涓湀)");
		int yearchoice=sc.nextInt();
		Caculator caculator=new Caculator();
		if (caculator.loan(loan, yearchoice)!=-1) {
			System.out.println("* * *鏈堜緵涓�: "+caculator.loan(loan, yearchoice));
		}
	}
	
}
