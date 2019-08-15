package day02;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 1、获取当前的时间，然后输出明日此刻的时间
 * (要求输出格式 xxxx年xx月xx日  上午/下午    xx时：xx分：xx秒   星期几 )。
 */
public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		long l=date.getTime();
		System.out.println("当前时间:"+l);
		long tomorrow=l+24*3600*1000;
		date.setTime(tomorrow);
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 a HH时:mm分:ss秒 E");
		String s=sdf.format(date);
		System.out.println("明日此刻的时间:"+s);
	}

}
