package day01;
/*
 * 8���Զ���һ���ַ������û�����¼��һ���ַ����жϸ��ַ��Ƿ����Զ�����ַ����У�ʹ��toCharArray������
 */
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="123456789";
		Scanner sc=new Scanner(System.in);
		System.out.print("������һ���ַ�:");
		String c=sc.next();
		char[] arr=s.toCharArray();
		boolean flag=false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==c.charAt(0)) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("�ַ�"+c.charAt(0)+"���Զ����ַ�����");
		}else {
			System.out.println("�ַ�"+c.charAt(0)+"�����Զ����ַ�����");
		}
		
	}

}
