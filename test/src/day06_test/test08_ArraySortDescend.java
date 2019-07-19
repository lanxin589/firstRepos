package day06_test;

import java.util.Arrays;
import java.util.Scanner;

public class test08_ArraySortDescend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] scores=new double[10];
		System.out.println("请录入10个学生的成绩:");
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			scores[i]=scanner.nextDouble();
		}
		Arrays.sort(scores);
		System.out.println("排序后:");
		for (int i = scores.length-1; i >=0; i--) {
			System.out.print(scores[i]+" ");
		}
	}

}
