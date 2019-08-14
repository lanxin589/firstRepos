package day01;
/*
 * 7、利用StringBuilder的反转方法，判断给定的字符串是否为回文(字符串自定义)
 */
public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="莫使金樽空对月";
		String str1=str.substring(0,str.length()/2);
		StringBuilder sBuilder=new StringBuilder(str);
		str=sBuilder.reverse().toString();
		String str2=str.substring(0,str.length()/2);
		if (str1.equals(str2)) {
			System.out.println("是回文");
		}else {
			System.out.println("不是回文");
		}
		
		
	}

}
