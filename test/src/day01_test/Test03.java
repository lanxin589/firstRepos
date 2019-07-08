package day01_test;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("************");
		System.out.println("************");
		System.out.println("** java ****");
		System.out.println("************");
		System.out.println("************");*/
		for(int i=0;i<5;i++){
			for(int j=0;j<12;j++){
				if((i==2&&j==2)||(i==2&&j==4)){
					System.out.print(' ');
				}
				else if(i==2&&j==3){
					System.out.print("java");
				}else if(i==2&&j>8){
					System.out.print('\b');
				}
				else{
					System.out.print("*");
				}
			}
			System.out.print('\n');
		}
	}

}
