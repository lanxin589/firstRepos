package day08;


public class Phones {
	public void call(){
		System.out.println("手机");
	}
}
class IPhone extends Phones{
	public void call(){
		System.out.println("苹果手机");
	}
}
class APhone extends Phones{
	public void call(){
		System.out.println("安卓手机");
		
	}
}
class Test1{
	public static void main(String[] args) {
		Phones phones=new IPhone();
		phones.call();
		phones=new APhone();
		phones.call();
		WindowsPhone windowsPhone=new WPhone();
		windowsPhone.call();
	}
}
class WindowsPhone{
	public void call(){
		System.out.println("windows手机");
	}
}
class WPhone extends WindowsPhone{
	public void call(){
		System.out.println("WPhone");
		
	}
}