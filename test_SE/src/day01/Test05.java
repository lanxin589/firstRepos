package day01;
/*
 * �ַ���"#hh123@",�ж��Ƿ���"#"��ʼ��"@"��β�����ǣ��򽫸��ַ�����"hh123"��ȡ������ 
Ȼ�����жϴ����ַ����ĳ������Ƿ�Ϊ10��������������ں������0�Զ����䵽10������
 */
import java.util.Arrays;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="#hh123@";
		if (str1.startsWith("#")&&str1.endsWith("@")) {
			String str2=str1.substring(1,str1.length()-1);
			System.out.println(str2);
		}
		if (str1.length()<10) {
			System.out.println("���Ȳ���10");
			String str2="0000000000";
			StringBuilder sBuilder=new StringBuilder(str2);
			sBuilder.replace(0, str1.length(), str1);
			System.out.println(sBuilder.toString());
		}else if(str1.length()==10){
			System.out.println("����Ϊ10");
		}else {
			System.out.println("���ȳ���10");
		}
	}

}
