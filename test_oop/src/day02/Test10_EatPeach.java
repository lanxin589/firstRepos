package day02;

public class Test10_EatPeach {
	public static void main(String[] args) {
		System.out.println(Peach(1));
	}
	public static int Peach(int day){
		if (day==10) {
			return 1;
		}else {
			return 2*(Peach(day+1)+1);
		}
	}
}
