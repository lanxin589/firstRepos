package day01;
/*
 * 7������StringBuilder�ķ�ת�������жϸ������ַ����Ƿ�Ϊ����(�ַ����Զ���)
 */
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Īʹ���׿ն���";
		String str1=str.substring(0,str.length()/2);
		StringBuilder sBuilder=new StringBuilder(str);
		str=sBuilder.reverse().toString();
		String str2=str.substring(0,str.length()/2);
		if (str1.equals(str2)) {
			System.out.println("�ǻ���");
		}else {
			System.out.println("���ǻ���");
		}
		
		
	}

}
