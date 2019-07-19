package day04_test;

public class test14_graph3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (i <= 4) {
					if (j >= 4 - i && j <= 4 + i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					if (j >= i - 4 && j <= 8 - (i - 4)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}

}
