package day02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1����ȡ��ǰ��ʱ�䣬Ȼ��������մ˿̵�ʱ��
 * (Ҫ�������ʽ xxxx��xx��xx��  ����/����    xxʱ��xx�֣�xx��   ���ڼ� )��
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long l=date.getTime();
		System.out.println("��ǰʱ��:"+l);
		long tomorrow=l+24*3600*1000;
		date.setTime(tomorrow);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd�� a HHʱ:mm��:ss�� E");
		String s=sdf.format(date);
		System.out.println("���մ˿̵�ʱ��:"+s);
	}

}
