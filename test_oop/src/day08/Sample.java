package day08;

class Base {
	public Base(){
		System.out.println("Base");
	}
}
class Child extends Base{
	public Child(){
		System.out.println("Child");
	}
}
public class Sample{
	public static void main(String[] args){
		Child c=new Child();//输出：Base 换行 Child，当new Child对象时，
		//会先调用父类的无参构造方法
										
	}
}
