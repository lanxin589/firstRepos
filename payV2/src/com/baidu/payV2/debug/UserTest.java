package com.baidu.payV2.debug;

public class UserTest {
	//在栈中开辟了一段main方法的栈桢
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *     当new出一个对象时,在栈中又开辟了一段构造器的栈桢，引用变量liuming
		 * 在main方法的栈桢中，而new出的对象放在堆中，成员变量在堆中，
		 *     由引用变量指向堆中new出的对象。方法区中存放成员方法，.class文件
		 * 构造方法结束，构造器的栈桢消失
		 *     由引用变量liuming在栈中调用方法区的set方法，在栈中为每个调用的方法
		 * 创建对应的栈桢，在每个栈桢中存放对应方法的局部变量，调用方法结束后，
		 * 对应的栈桢和局部变量一起消失。
		 * 	   声明一些main方法的局部变量存放在main方法的栈桢中，此时引用变量在
		 * main方法栈桢中调用方法区的get方法,在栈中为每个调用的方法创建对应栈桢，
		 * 在每个栈桢中存放对应方法的局部变量，那些局部变量接收调用get方法后的值
		 * 调用方法结束后，对应的栈桢和局部变量一起消失
		 *     main方法结束,对应的栈桢和main方法的局部变量一起消失
		 * 
		 * 
		 */
		com.baidu.payV2.market.User liuming=new com.baidu.payV2.market.User();
		liuming.setAdmin("741459927");
		liuming.setUsername("刘明");
		liuming.setUserpwd("589589");
		liuming.setAddress("741459927@qq.com");
		String admin=liuming.getAdmin();
		String username=liuming .getUsername();
		String userpwd=liuming.getUserpwd();
		String address=liuming.getAddress();
		System.out.println("账号:"+admin+" 用户名:"+username+" 密码:"+userpwd+" 地址:"+address);
	}

}
