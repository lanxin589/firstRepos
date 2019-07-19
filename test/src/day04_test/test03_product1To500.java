package day04_test;

public class test03_product1To500 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		double prod=1;
		while (i<=100) {
			prod*=i++;
		}
		System.out.println("1to100的乘积为:"+prod);
	}

}
