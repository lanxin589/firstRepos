package day08;

public class test01_addCaculator {
	public int add(int num1,int num2){
		return num1+num2;
	}
	public int add(int num1,int num2,int num3){
		return num1+num2+num3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01_addCaculator tac=new test01_addCaculator();
		System.out.println("功能1:"+tac.add(1, 2));
		System.out.println("功能2:"+tac.add(1,2,3));
	}

}
