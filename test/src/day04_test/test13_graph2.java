package day04_test;

public class test13_graph2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			for (int j =0 ; j <9; j++) {
				if (j>=4-i&&j<=4+i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}

}
