package day01;
/*
 * 11��ϵͳ������ĸ����ȵ���֤��(�����֣���д��ĸ��Сд��ĸ���)��
�û��ڿ���̨������֤�룬�Ա���ϵͳ����֤���Ƿ�һ��(�����ִ�Сд)
 */
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
		char c1 = (char) ((int) (Math.random() * 10 + 48));// ����ascii���ȡ����
		char c2 = (char) ((int) (Math.random() * 26 + 65));// ����ascii���ȡ��д��ĸ
		char c3 = (char) ((int) (Math.random() * 26 + 97));// ����ascii���ȡСд��ĸ
		int choose = (int) (Math.random() * 3);//ȡ����������������
			switch (choose) {
			case 0:
				sBuilder.append(c1);
				break;
			case 1:
				sBuilder.append(c2);
				break;
			case 2:
				sBuilder.append(c3);
				break;
			default:
				break;
			}
		}
		String st=sBuilder.toString();
		System.out.println("ϵͳ���������֤��:"+st);
		Scanner sc=new Scanner(System.in);
		System.out.print("��������֤��:");
		String input=sc.next();
		if (st.equalsIgnoreCase(input)) {
			System.out.println("��ϵͳ��֤��һ��");
		}else {
			System.out.println("��ϵͳ��֤�벻һ��");
		}
	}

}
