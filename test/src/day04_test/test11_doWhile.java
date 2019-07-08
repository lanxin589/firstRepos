package day04_test;

public class test11_doWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum=0;
		do {
			sum+=i++;
		} while (i<=100);
		System.out.println("sum="+sum);
	}

}
