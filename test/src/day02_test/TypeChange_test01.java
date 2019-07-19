package day02_test;

public class TypeChange_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short sh=10;
		byte bt=1;
		long lg=900;
		double db=10.0;
		double result=sh+bt+lg+db;//自动转化为最高的double级别
		System.out.println(result);
		int time=24*60*60*100000;
		System.out.println(time);//正常结果为8640000000,但这里却是50065408，其原因超过了int取值范围
//		上述中结果超出了int的范围，需要使用更大取值范围的数据类型
		long time1=24*60*60*100000l;
		System.out.println(time1);
	}

}
