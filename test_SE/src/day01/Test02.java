package day01;
/*
 * ��һ���ַ���www.baidu.com �����ȡ�������ַ������ֱ�Ϊ baidu     com
 */
import java.util.Arrays;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="www.baidu.com";
		String[] arr=str.split("\\.");
		System.out.println(arr[1]+"  "+arr[2]);
		//System.out.println(str.substring(4,9)+"  "+str.substring(10));
	}

}
