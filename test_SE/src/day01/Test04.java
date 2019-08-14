package day01;
/*
 * 判断"123456789"是否是回文（利用charAt方法）
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
			System.out.println(str1+"是回文");
		}else {
			System.out.println(str1+"不是回文");
		}
	}

}
