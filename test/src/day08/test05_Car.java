package day08;

public class test05_Car {
	String brand;
	double price;
	String color;
	public void show(String brand,double price,String color){
		System.out.println("汽车对象的属性:");
		System.out.println("品牌:"+brand);
		System.out.println("价格:"+price);
		System.out.println("颜色:"+color);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test05_Car tCar=new test05_Car();
		tCar.show(tCar.brand,tCar.price,tCar.color);
	}

}
