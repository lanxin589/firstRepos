package day02;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/*
 * 2���Լ�����¼��һ��ʱ�䣬��ʽΪ"yyyy-MM-dd HH:mm:ss"��Ȼ��ֱ�������ʱ��ķ������꣬�£��ա�
���¼��������ַ�����ʽ���ԣ�������¼��ʱ�䡣
 */
public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=null;
		while (true) {
			try {
				System.out.print("������һ��ʱ��:");
				String str = sc.nextLine();
				date=sdf.parse(str);
				break;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("�����ʽ���ԣ�����������");
				continue;
			}
		}
		sc.close();
		Calendar c=Calendar.getInstance();
		c.setTime(date);
		System.out.println("��:"+c.get(Calendar.YEAR));
		System.out.println("��:"+(c.get(Calendar.MONTH)+1));
		System.out.println("��"+c.get(Calendar.DAY_OF_MONTH));
	}

}
