package day04_test;

public class test02_Int1to1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		while (i<=1000) {
			System.out.print(i+" ");
			if (i%10==0) {
				System.out.println();
			}
			i++;
		}
	}

}
