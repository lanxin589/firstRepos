package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Triangle {
	int a;
	int b;
	int c;
	String shape;

	public boolean isTriangle(int a, int b, int c) {// 判断是否为三角形
		boolean flag = false;
		if (a+b>c) {
			flag=true;
		}
		return flag;
	}

	public String shape(int a, int b, int c) {// 返回三角形类型
		String shape = "";
		if (!isTriangle(a, b, c)) {
			System.out.println("这不能构成三角形。");
		} else {
			if (isAcuteAngle(a, b, c)) {
				if (isEquilateral(a, b, c)) {
					shape="等边三角形";
				}else
					shape="锐角三角形";
			}else if(isRightAngle(a, b, c)){
				shape="直角三角形";
			}else if (isBluntAngle(a, b, c)) {
				shape="钝角三角形";
			}
		}
		return shape;
	}

	public boolean isRightAngle(int a, int b, int c) {// 判断是否为直角三角形
		boolean flag = false;
		if (a*a+b*b==c*c) {
			flag=true;
		}
		return flag;
	}

	public boolean isAcuteAngle(int a, int b, int c) {// 判断是否为锐角三角形
		boolean flag = false;
		if (a*a+b*b>c*c) {
			flag=true;
		}
		return flag;
	}

	public boolean isBluntAngle(int a, int b, int c) {// 判断是否为钝角三角形
		boolean flag = false;
		if (a*a+b*b<c*c) {
			flag=true;
		}
		return flag;
	}

	public boolean isEquilateral(int a, int b, int c) {// 判断是否为等边三角形
		boolean flag = false;
		if (a==b&&b==c) {
			flag=true;
		}
		return flag;
	}

	public static void main(String[] args) {
		Triangle t = new Triangle();
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		String s;
		do {
			System.out.print("请输入第一条边：");
			arr[0] = sc.nextInt();
			System.out.print("请输入第二条边: ");
			arr[1] = sc.nextInt();
			System.out.print("请输入第三条边: ");
			arr[2] = sc.nextInt();
			Arrays.sort(arr);//先对三条边排序
			t.a=arr[0];
			t.b=arr[1];
			t.c=arr[2];
			t.shape=t.shape(t.a, t.b, t.c);
			if (!"".equals(t.shape)) {//如果能构成三角形
				System.out.println("这是一个"+t.shape);
			}
			do {
				System.out.print("继续吗? (y/n):");
				s = sc.next();
				if (!"y".equals(s) && !"n".equals(s)) {//输入为(y/n)，否则重新输入
					System.out.println("输入错误，请重新输入!");
				}
			} while (!"y".equals(s) && !"n".equals(s));
		} while (!"n".equals(s));//输入为n退出
		System.out.println("谢谢使用!");
	}

}
