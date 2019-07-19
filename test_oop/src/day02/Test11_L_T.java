package day02;

public class Test11_L_T {
	int x;
	int y;
	int x_length;
	int y_length;
	Graph_L2 graph_L2;
	Graph_T2 graph_T2;
	public Test11_L_T(int x, int y, int x_length, int y_length, Graph_L2 graph_L2, Graph_T2 graph_T2) {
		this.x = x;
		this.y = y;
		this.x_length = x_length;
		this.y_length = y_length;
		this.graph_L2 = graph_L2;
		this.graph_T2 = graph_T2;
	}
	public void display_L() {// 显示L
		boolean[][] flag = new boolean[y_length][x_length];
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = y; i < y_length; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j < x_length; j++) {
				for (int j2 = 0; j2 < graph_L2.cell2s.length; j2++) {
					if ((graph_L2.cell2s[j2].x == j && graph_L2.cell2s[j2].y == i)) {
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
	public void display_T() {// 显示T
		boolean[][] flag = new boolean[y_length][x_length];
		for (int i = 0; i < y; i++) {
			System.out.println();
		}
		for (int i = y; i < y_length; i++) {
			for (int j = 0; j < x; j++) {
				System.out.print(" ");
			}
			for (int j = x; j < x_length; j++) {
				for (int j2 = 0; j2 < graph_T2.cell2s.length; j2++) {
					if ((graph_T2.cell2s[j2].x == j && graph_T2.cell2s[j2].y == i)) {
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
	public static void main(String[] args) {
		Cell2[] cell2s = null;
		Graph_L2 graph_L2=new Graph_L2(5, 5, cell2s);
		System.out.println(graph_L2.cell2s[0].x);
		Graph_T2 graph_T2=new Graph_T2(5, 5, cell2s);
		Test11_L_T wallPaper=new Test11_L_T(1, 1, 10, 10, graph_L2, graph_T2);
		wallPaper.display_L();
		System.out.println();
		wallPaper.display_T();
		System.out.println();
		graph_L2.moveLeftOne();
		System.out.println(graph_L2.x+" "+graph_L2.cell2s[0].x);
		wallPaper.display_L();
	}
}
class Cell2{
	int x;
	int y;
	public Cell2(int x,int y){
		this.x=x;
		this.y=y;
	}
	public void moveLeftOne(){
		x--;
	}
	public void moveRightOne(){
		x++;
	}
	public void moveDownOne(){
		y++;
	}
	public void moveDownN(int n){
		y+=n;
	}
}
class Graph_L2{//图形L，左下角为中心
	int x;
	int y;
	 Cell2[] cell2s;
	public Graph_L2(int x,int y,Cell2[] cell2s){
		this.x=x;
		this.y=y;
		cell2s=new Cell2[]{
				new Cell2(this.x,this. y),
				new Cell2(this.x+1, this.y),
				new Cell2(this.x,this. y-1),
				new Cell2(this.x, this.y-2)
		};
		this.cell2s=cell2s;
	}
	public void moveLeftOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].x--;
		}
	}
	public void moveRightOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].x++;
		}
	}
	public void moveDownOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].y++;
		}
	}
	public void moveDownN(int n){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].y++;
		}
	}
}
class Graph_T2{//图形T,交叉处为中心
	int x;
	int y;
	 Cell2[] cell2s;
	public Graph_T2(int x,int y,Cell2[] cell2s){
		this.x=x;
		this.y=y;
		cell2s=new Cell2[]{
				new Cell2(this.x,this. y),
				new Cell2(this.x-1, this.y),
				new Cell2(this.x+1, this.y),
				new Cell2(this.x, this.y+1)
		};
		this.cell2s=cell2s;
	}
	public void moveLeftOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].x--;
		}
	}
	public void moveRightOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].x++;
		}
	}
	public void moveDownOne(){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].y++;
		}
	}
	public void moveDownN(int n){
		for (int i = 0; i < cell2s.length; i++) {
			cell2s[i].y++;
		}
	}
}
