package day01;
/*
 * 11、系统随机了四个长度的验证码(由数字，大写字母，小写字母组成)。
用户在控制台输入验证码，对比与系统的验证码是否一致(不区分大小写)
 */
import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sBuilder = new StringBuilder();
		
		for (int i = 0; i < 4; i++) {
		char c1 = (char) ((int) (Math.random() * 10 + 48));// 根据ascii码获取数字
		char c2 = (char) ((int) (Math.random() * 26 + 65));// 根据ascii码获取大写字母
		char c3 = (char) ((int) (Math.random() * 26 + 97));// 根据ascii码获取小写字母
		int choose = (int) (Math.random() * 3);//取到三个区间的随机数
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
		System.out.println("系统随机生成验证码:"+st);
		Scanner sc=new Scanner(System.in);
		System.out.print("请输入验证码:");
		String input=sc.next();
		if (st.equalsIgnoreCase(input)) {
			System.out.println("与系统验证码一致");
		}else {
			System.out.println("与系统验证码不一致");
		}
	}

}
