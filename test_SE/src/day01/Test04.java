package day01;
/*
 * �ж�"123456789"�Ƿ��ǻ��ģ�����charAt������
 */
public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="123456789";
		boolean flag=false;
		for (int i = 0; i < str1.length()/2; i++) {
			if (str1.charAt(i)!=str1.charAt(str1.length()-i-1)) {
				flag=true;
				break;
			}
		}
		if (!flag) {
			System.out.println(str1+"�ǻ���");
		}else {
			System.out.println(str1+"���ǻ���");
		}
	}

}
