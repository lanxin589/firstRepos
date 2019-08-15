package day02;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * 2、自己键盘录入一个时间，格式为"yyyy-MM-dd HH:mm:ss"。然后分别输出这个时间的分量：年，月，日。
如果录入的日期字符串格式不对，可重新录入时间。
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=null;
		while (true) {
			try {
				System.out.print("请输入一个时间:");
				String str = sc.nextLine();
				date=sdf.parse(str);
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("输入格式不对，请重新输入");
				continue;
			}
		}
		sc.close();
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		System.out.println("年:"+c.get(Calendar.YEAR));
		System.out.println("月:"+(c.get(Calendar.MONTH)+1));
		System.out.println("日"+c.get(Calendar.DAY_OF_MONTH));
	}

}
