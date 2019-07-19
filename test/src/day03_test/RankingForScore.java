package day03_test;

import java.util.Scanner;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class RankingForScore {
	public static void main(String[] args) {
		System.out.println("请输入成绩:");
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		char rank = '\0';
		if (score >= 90 && score <= 100) {
			rank = 'A';
		}
		if (score >= 80 && score < 90) {
			rank = 'B';
		}
		if (score >= 70 && score < 80) {
			rank = 'C';
		}
		if (score >= 60 && score < 70) {
			rank = 'D';
		}
		if (score >= 0 && score < 60) {
			rank = 'E';
		}
		if(score>100||score<0){
			System.out.println("输入非法！");
			return;
		}
		System.out.println("等级为:"+rank+"级");

	}
}
