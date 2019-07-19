package day04_test;

public class test13_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int sum=0;
		//while
//		while (i<=100) {
//			if (i%2!=0) {
//				i++;
//				continue;
//			}
//			sum+=i++;
//		}
//		System.out.println("sum="+sum);
		
		
		//do-while
//		do {
//			if (i%2!=0) {
//				i++;
//				continue;
//			}
//			sum+=i++;
//		} while (i<=100);
//		System.out.println("sum="+sum);
		
		for (; i <= 100; i++) {
			if (i%2!=0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("sum="+sum);
	}

}
