package day01;
/*
 * 有字符串"  baidu  ",将这个字符串拼接成www.baidu.com
 */
public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="  baidu  ";
		str1=str1.trim();//去掉前后的空格
		StringBuilder builder=new StringBuilder(str1);
		builder.insert(0, "www.").append(".com");
		System.out.println(builder.toString());
	}

}
