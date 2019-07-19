package day02;
/*
 * 4、在控制台输出九九乘法表（依据二维数组提供循环次数）：
 */
import java.util.Arrays;

public class test04_9_9Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [][] arr=new String[9][];
		/*
		 * 原来二位数组中的每个元素是9个长度的1维数组变为第一个一维数组1个长度
		 * ，第二个一维数组2个长度...
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i]=new String[i+1];
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i; j++) {
				arr[i][j]=(i+1)+"*"+(j+1);
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
