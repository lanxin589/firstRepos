package day01;
/*
 * 字符串"#hh123@",判断是否以"#"开始，"@"结尾。如是，则将该字符串的"hh123"截取出来。 
然后在判断此子字符串的长度是是否为10，如果不够，则在后面添加0自动补充到10个长度
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
			System.out.println("长度不到10");
			String str2="0000000000";
			StringBuilder sBuilder=new StringBuilder(str2);
			sBuilder.replace(0, str1.length(), str1);
			System.out.println(sBuilder.toString());
		}else if(str1.length()==10){
			System.out.println("长度为10");
		}else {
			System.out.println("长度超过10");
		}
	}

}
