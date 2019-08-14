package day01;
/*
 * 13、在一个字符串“0”，循环十次。(使用stringBuilder，避免多次创建对象)
第一次：”01”
第二次: ”012”
第三次：”0123”
。。。。。。。
第十次：”012345678910”

注：输出最终结果的字符串
 */
public class Test13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="0";
		StringBuilder sBuilder=new StringBuilder(s);
		for (int i = 0; i < 10; i++) {
			sBuilder.append(i+1);
			System.out.println("第"+(i+1)+"次:"+"\""+sBuilder.toString()+"\"");
		}
	}

}
