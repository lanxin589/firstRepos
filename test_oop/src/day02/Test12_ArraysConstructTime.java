package day02;

public class Test12_ArraysConstructTime {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double startTime;
		double endTime;
		Test12_ArraysConstructTime arraysConstructTime=new Test12_ArraysConstructTime();
		startTime=arraysConstructTime.getSystemTime();
		for (int i = 0; i < 9999; i++) {
			int[] arr=new int[1];
		}
		int[]arr=new int[1];
		endTime=arraysConstructTime.getSystemTime();
		System.out.println(endTime-startTime);
	}
	public double getSystemTime(){
		return System.currentTimeMillis();
	}
}
