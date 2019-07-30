package day05;

public class MobilPhoneTest{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilPhone mp=new MobilPhone();//实例化MobilPhone类的对象
		mp.brand="苹果";//将对象mp的成员属性brand赋值为 苹果
		/*
		 * 通过mp对象访问成员方法buy(String reason),此时的reason值为“发工资啦”
		 * 方法中return时的brand值为 “苹果”
		 */
		String detail=mp.buy("发工资啦");
		System.out.println(detail);
	}

}
