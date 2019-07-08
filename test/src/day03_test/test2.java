package day03_test;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int leftHand=10;
		int rightHand=8;
		System.out.println("输出互换前手中的纸牌:");
		System.out.println("左手中的纸牌:"+leftHand);
		System.out.println("右手中的纸牌:"+rightHand);
		System.out.println();
		int temp=leftHand;
		leftHand=rightHand;
		rightHand=temp;
		System.out.println("输出互换后手中的纸牌:");
		System.out.println("左手中的纸牌:"+leftHand);
		System.out.println("右手中的纸牌:"+rightHand);
	}

}
