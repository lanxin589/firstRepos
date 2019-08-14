package day01;
/*
 * 12、键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数,其他字符出现的次数。
例如键盘录入：ABCDEabcd123456!@#$%^
 输出：ABCDEabcd123456!@#$%^中大写字母有:5个,小写字母有:4个,数字字符:6个,其他字符:6。
 */
import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入字符串:");
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
		System.out.println(s+"中大写字母有:"+upperCaseCount+"个,小写字母有:"+
		lowerCaseCount+"个,数字字符有"+digitCount+"个,其他字符有"+otherCount+"个");
	}

}
