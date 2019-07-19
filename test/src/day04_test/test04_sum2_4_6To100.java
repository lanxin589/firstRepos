package day04_test;

public class test04_sum2_4_6To100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2;
		int sum=0;
		while (i<=100) {
			sum+=i;
			i+=2;
		}
		System.out.println("2_4_6to100的和为:"+sum);
	}

}
