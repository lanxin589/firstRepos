package day02;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
 * 创建一个工具类，以后可以使用这个工具类，提供一下功能：
1、通过传入整数x,返回随机1—x的随机数。[1,x]
2、获取当前系统时间。 （核心代码System.currentTimeMillis()）
3、1到整数x的求和。
4、整数x的阶乘
 */
public class test08_Instrument {
	public int Random_1_X(int x){//返回1-x的随机数
		return (int)(Math.random()*x+1);
	}
	public String getSystemTime(){//获取当前系统时间
		Date date=new Date(System.currentTimeMillis());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//以某种格式显示
		return sdf.format(date);//格式化系统时间
	}
	public int getSum_1_X(int x){//1到x的整数求和
		if (x==1) {
			return 1;
		}else {
			return x+getSum_1_X(x-1);
		}
	}
	public int factorial(int x){//整数x的阶乘
		if (x==1) {
			return 1;
		}
		else
			return x*factorial(x-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test08_Instrument instr=new test08_Instrument();
		System.out.println("1-x间的随机数:"+instr.Random_1_X(5));
		System.out.println("当前系统时间:"+instr.getSystemTime());
		System.out.println("1-x的整数的和:"+instr.getSum_1_X(5));
		System.out.println("整数x的阶乘:"+instr.factorial(5));
	}

}
