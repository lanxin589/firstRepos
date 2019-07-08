package day06_test;

public class test01_ModifyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phones={"iphone4","iphone6",null,"iphone7"};
		for (int i = 0; i < phones.length; i++) {
			if (phones[i]==null) {
				phones[i]="iphone6s";
			}
		}
		for (String string : phones) {
			System.out.println(string);
		}
	}

}
