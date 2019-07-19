package day02;

public class Test12_ArraysConstructTime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double startTime;
		double endTime;
		Test12_ArraysConstructTime arraysConstructTime=new Test12_ArraysConstructTime();
		System.out.println(arraysConstructTime);
		arraysConstructTime=new Test12_ArraysConstructTime();
		System.out.println(arraysConstructTime);
		startTime=arraysConstructTime.getSystemTime();
		int[][] arr=new int[10000][];
		//模拟严重的内存泄漏:抛出异常:OutOfMemoryError
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new int[9];
		}
		endTime=arraysConstructTime.getSystemTime();
		System.out.println(endTime-startTime);
	}
	public double getSystemTime(){
		return System.currentTimeMillis();
		
	}
}
