package day04_test;

import java.util.Scanner;

import com.sun.org.apache.xml.internal.security.Init;

public class Test002 {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("请输入一个整数(输入0结束):");
		int max=input.nextInt();//假设第一次是 最大值
		int min=max;
		if(max==0){
			System.out.println("最大值为"+max+"  最小值为："+max);
			return;
			
		}
		
		int num;
		do{
			System.out.print("请输入一个整数(输入0结束)：");
			 num=input.nextInt();
			 if(num==0){
				 break;
			 }
			 
			 max=max>num ? max :num;
			   min =num>min ? min :num;
			
		}while(num!=0);
		
		System.out.println("最大值为："+max +"  最小值为:"+min);
		
	}
}
