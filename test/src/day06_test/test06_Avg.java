package day06_test;

import java.util.Scanner;

public class test06_Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		double[][] scores=new double[5][5];
		double[] sum=new double[scores.length];
		double avg=0.0;
		for (int i = 0; i < scores.length; i++) {
			System.out.println("请输入第"+(i+1)+"个班的5个学生的成绩:");
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j]=scanner.nextDouble();
			}
		}
		System.out.println("每个班的成绩如下:");
		for (int i = 0; i < scores.length; i++) {
			sum[i]=0;
			System.out.print("第"+(i+1)+"个班的成绩:");
			for (int j = 0; j < scores[i].length; j++) {
				
				sum[i]+=scores[i][j];
				System.out.print(scores[i][j]+" ");
				
			}
			System.out.println("总成绩:"+sum[i]);
		}
		double sum2=0.0;
		for (int i = 0; i < sum.length; i++) {
			sum2+=sum[i];
		}
		System.out.println("整个年级的平均分:"+sum2/(scores.length*5));
	}

}
