package day02;

import java.util.Scanner;

/*
 * 在坐标中（0<=X<=9，0<=Y<=19）有一个小格子。
在默认情况下，它出现再（0,0）位置。
当然也可以自己定义出现再坐标中的某个位置。如出现在(5,5)位置。
小格子具有的功能：
1、能够向左移动一单位
2、向右移动一单位
3、向下移动一格单位，或者自定义向下移动几个单位。
4、能显示格子自己当前的坐标。

坐标墙纸具有的功能：
1、能自定义生成坐标纸（如，我们可以指定坐标纸0<x<20,0<y50）
2、在没有格子打印在坐标墙纸时，每个坐标用 “-” 表示。
3、当坐标墙纸上打印格子时，格子用 ”#” 表示，其余用“-” 表示。
 */
public class test03_Coordinate {// 坐标墙纸
	int x;//截取位置的x坐标
	int y;//截取位置的y坐标
	int x_length;//墙纸长
	int y_length;//墙纸宽
	public void init(int x_length, int y_length) {// 自定义墙纸大小
		x=0;
		y=0;
		this.x_length = x_length;
		this.y_length = y_length;
	}

	public void display(Square square) {
		for (int i = y; i < y+y_length; i++) {//宽
			for (int j = x; j <x+ x_length; j++) {//长
				if (square.x == j && square.y == i) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		test03_Coordinate coordinate = new test03_Coordinate();
		Scanner scanner = new Scanner(System.in);
		Square square = new Square();
		do {
			System.out.println("请初始化格子在坐标中的位置:");
			System.out.print("请输入格子的横坐标:");
			int x = scanner.nextInt();
			System.out.print("请输入格子的纵坐标:");
			int y = scanner.nextInt();
			square.init(x, y);
			if (!square.isInner()) {
				System.out.println("格子没有初始化在坐标内");
			}
		} while (!square.isInner());
		System.out.println("请自定义墙纸大小:");
		coordinate.init(20, 50);
		System.out.println("墙纸显示如下:");
		coordinate.display(square);
		System.out.println();
		square.moveLeftOne();//左移一格
		coordinate.display(square);
		System.out.println();
		square.moveRightOne();//右移一格
		coordinate.display(square);
		System.out.println();
		square.moveDown(-4);//上移4格
		coordinate.display(square);
	}
}

class Square {// 格子类
	// 默认为(0,0)
	int x = 0;
	int y = 0;

	public void init(int x, int y) {// 初始化格子的位置
		this.x = x;
		this.y = y;
	}

	public boolean isInner() {// (0<=x<=9)(0<=y<=19)
		if ((x >= 0 && x <= 9) && (y >= 0 && y <= 19)) {
			return true;
		} else {
			return false;
		}
	}

	public void moveLeftOne() {// 左移一个单位
		x--;
	}

	public void moveRightOne() {// 右移一个单位
		x++;
	}

	public void moveDown(int num) {// 下移自定义的单位
		y += num;
	}

	public void displayCurrentPos() {
		System.out.println("格子当前的坐标:(" + x + "," + y + ")");
	}
}
