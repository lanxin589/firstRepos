package day01;
/*
 * 12������¼��һ���ַ�����ͳ�Ƹ��ַ����д�д��ĸ�ַ���Сд��ĸ�ַ��������ַ����ֵĴ���,�����ַ����ֵĴ�����
�������¼�룺ABCDEabcd123456!@#$%^
 �����ABCDEabcd123456!@#$%^�д�д��ĸ��:5��,Сд��ĸ��:4��,�����ַ�:6��,�����ַ�:6��
 */
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("�������ַ���:");
		String s=sc.next();
		int digitCount=0,upperCaseCount=0,lowerCaseCount=0;
		int otherCount=0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)>='0'&&s.charAt(i)<='9') {
				digitCount++;
			}else if (s.charAt(i)>='A'&&s.charAt(i)<='Z') {
				upperCaseCount++;
			}else if (s.charAt(i)>='a'&&s.charAt(i)<='z') {
				lowerCaseCount++;
			}
			
		}
		otherCount=s.length()-digitCount-upperCaseCount-lowerCaseCount;
		System.out.println(s+"�д�д��ĸ��:"+upperCaseCount+"��,Сд��ĸ��:"+
		lowerCaseCount+"��,�����ַ���"+digitCount+"��,�����ַ���"+otherCount+"��");
	}

}
