package day02_test;
/*
 * 输出byte、int、double的取值范围
 */
public class Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bMax=Byte.MAX_VALUE;
		byte bMin=Byte.MIN_VALUE;
		int iMin=Integer.MIN_VALUE;
		int iMax=Integer.MAX_VALUE;
		double dMin=Double.MIN_VALUE;
		double dMax=Double.MAX_VALUE ;
		System.out.println("byte的取值范围: "+bMin+"~"+bMax);
		System.out.println("int的取值范围: "+iMin+"~"+iMax);
		System.out.println("double的取值范围: "+dMin+"~"+dMax);
	}

}
