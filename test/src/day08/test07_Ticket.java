package day08;

import java.util.Scanner;

public class test07_Ticket {//门票类
	double price;

	public double free(Visitor visitor) {// 门票规则
		if (visitor.age <= 10) {
			return 0.0;
		} else if (visitor.age > 10 && visitor.age <= 60) {
			System.out.print("门票全费:");
			return price;
		} else {
			System.out.print("门票半价:");
			return price / 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test07_Ticket tT = new test07_Ticket();
		Scanner sc = new Scanner(System.in);
		char c;
		do {
			Visitor visitor = new Visitor();
			System.out.print("请输入姓名:");
			visitor.name = sc.next();
			System.out.print("请输入年龄:");
			visitor.age = sc.nextInt();
			tT.price = 20.0;
			if (tT.free(visitor) == 0) {
				System.out.println("门票免费");
			} else {
				System.out.println(tT.free(visitor)+"元");
			}
			do{
				System.out.println("是否继续(y/n)?");
				c=sc.next().charAt(0);
				if (c!='y'&&c!='n') {
					System.out.println("输入错误，请重新输入");
				}
			}while(c!='y'&&c!='n');
		} while (c!='n');
		System.out.println("程序结束!");
	}

}

class Visitor {// 游客类
	String name;// 游客姓名
	int age;// 游客年龄
}