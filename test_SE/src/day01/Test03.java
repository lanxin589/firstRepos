package day01;
/*
 * ���ַ���"  baidu  ",������ַ���ƴ�ӳ�www.baidu.com
 */
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="  baidu  ";
		str1=str1.trim();//ȥ��ǰ��Ŀո�
		StringBuilder builder=new StringBuilder(str1);
		builder.insert(0, "www.").append(".com");
		System.out.println(builder.toString());
	}

}
