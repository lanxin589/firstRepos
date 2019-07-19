package day02;

/*
 * 9、在格子游戏的基础上，添加”口”,”L”,”T”字图像(每个图形都是4个格子组成)。
图像具有功能：
1、向左移一个单位。
2、向右移 一个单位。
3、向下移一个单位
4、向下移n个单位。
在墙纸上能打印图像，如：
- - - - - - - - - - - - - - - - - - 
- - - - # # - - - - - - - - - - - -
- - - - # # - - - - - - - - - - - -
- - - - - - - - - - - - - - - - - -
 */
public class test09_WallPaper {
	int x;// 截取位置的x坐标
	int y;// 截取位置的y坐标
	int x_length;// 墙纸长
	int y_length;// 墙纸宽
	Graph_O o;
	Graph_L l;
	Graph_T t;
	Cell[] cells;// 数组存格子,最终形成图像"田"

	public test09_WallPaper(int x_length, int y_length, int x1, int y1) {// 自定义墙纸大小和截取位置
		x = 1;
		y = 1;
		this.x_length = x_length;
		this.y_length = y_length;
		cells = new Cell[] { new Cell(x1, y1), new Cell(x1 + 1, y1), new Cell(x1, y1 + 1), new Cell(x1 + 1, y1 + 1) };

	}

	public void display_O() {// 显示口
		boolean[][] flag = new boolean[y_length][x_length];
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = y; i < y_length; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j < x_length; j++) {
				for (int j2 = 0; j2 < cells.length; j2++) {
					if ((cells[j2].x == j && cells[j2].y == i)) {
						flag[i][j] = true;
						break;
					}
				}
				if (flag[i][j]) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public void display_L() {// 显示L
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = y; i < y_length; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j < x_length; j++) {
				if ((l.x == j && l.y == i) || (l.x + 1 == j && l.y == i) || (l.x == j && l.y - 1 == i)
						|| (l.x == j && l.y - 2 == i)) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public void display_T() {// 显示T
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = y; i < y_length; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j < x_length; j++) {
				if ((t.x == j && t.y == i) || (t.x + 1 == j && t.y == i) || (t.x - 1 == j && t.y == i)
						|| (t.x == j && t.y + 1 == i)) {
					System.out.print("#");
				} else {
					System.out.print("-");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		test09_WallPaper wallPaper = new test09_WallPaper(10, 10, 5, 5);
		wallPaper.o = new Graph_O(5, 5);
		wallPaper.l = new Graph_L(5, 5);
		wallPaper.t = new Graph_T(5, 5);

		System.out.println("口:");
		wallPaper.display_O();
		System.out.println("L:");
		wallPaper.display_L();
		System.out.println("T:");
		wallPaper.display_T();
		wallPaper.t.moveDownN(2);
		wallPaper.display_T();
	}
}

class Cell {
	int x;
	int y;

	public Cell(int x1, int y1) {
		x = x1;
		y = y1;
	}

	public void moveLeftOne() {
		x--;
	}

	public void moveRightOne() {
		x++;
	}

	public void moveDownOne() {
		y++;
	}

	public void moveDownN(int n) {
		y += n;
	}
}

class Graph_O {// 图形口,左上角为中心
	int x;
	int y;

	public Graph_O(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveLeftOne() {
		x--;
	}

	public void moveRightOne() {
		x++;
	}

	public void moveDownOne() {
		y++;
	}

	public void moveDownN(int n) {
		y += n;
	}
}

class Graph_L {// 图形L，左下角为中心
	int x;
	int y;

	public Graph_L(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveLeftOne() {
		x--;
	}

	public void moveRightOne() {
		x++;
	}

	public void moveDownOne() {
		y++;
	}

	public void moveDownN(int n) {
		y += n;
	}
}

class Graph_T {// 图形T,交叉处为中心
	int x;
	int y;

	public Graph_T(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void moveLeftOne() {
		x--;
	}

	public void moveRightOne() {
		x++;
	}

	public void moveDownOne() {
		y++;
	}

	public void moveDownN(int n) {
		y += n;
	}
}
