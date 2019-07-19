package day04_test;

public class test05_product1To10NotIncluding5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int prod=1;
		while (i<=10) {
			if (i==5) {
				i++;
			}
			prod*=i++;
		}
		System.out.println("1to10不包括5的乘积为:"+prod);
	}

}
