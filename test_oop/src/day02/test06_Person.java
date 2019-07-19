package day02;
/*
 * 编写Java程序用于显示人的姓名和年龄。 定义一个人类Person该类中应该有两个属性：姓名name和年龄age。
定义构造方法用来初始化数据成员(数据自定义)。再定义显示display方法将姓名和年龄打印出来。 在main方法中创建人类的实例然后将信息显示。
 */
public class test06_Person {
	String name;//人的姓名
	int age;//年龄
	public test06_Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void display(){//显示
		System.out.println("人的信息如下：");
		System.out.println("姓名:"+name+",年龄:"+age);
	}
	public static void main(String[] args) {
		test06_Person person=new test06_Person("邬秋生", 29);
		person.display();
	}
}
