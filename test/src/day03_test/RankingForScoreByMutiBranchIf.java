package day03_test;

import java.util.Scanner;

public class RankingForScoreByMutiBranchIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入成绩:");
		Scanner input = new Scanner(System.in);
		double score = input.nextDouble();
		char rank = '\0';
		if (score >= 90 && score <= 100) {
			rank = 'A';
		} else if (score >= 80) {
			rank = 'B';
		} else if (score >= 70) {
			rank = 'C';
		} else if (score >= 60) {
			rank = 'D';
		} else if (score >= 0) {
			rank = 'E';
		}
		else  {
			System.out.println("输入非法！");
			return;
		}
		System.out.println("等级为:" + rank + "级");
	}

}
