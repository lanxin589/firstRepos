package day09;
/*
 * 初始化汽车数组与租车
 */
public class CarOperation {//汽车业务类
	public Car[] cars={
			new Carriage("宝马",800,"京NY28588","X6"),
			new Carriage("宝马", 600, "京CNY3284", "550i"),
			new Carriage("别克", 300, "京NT37465", "林荫大道"),
			new Carriage("别克", 600, "京NT96968", "GL8"),
			new Coach("金杯",800,"京6566754",16),
			new Coach("金龙",800,"京8696997",16),
			new Coach("金杯",1500,"京9696996",34),
			new Coach("金龙",1500,"京8696998",34)
	};
	public Car rentCar(String brand,String type,int location){//找车
		Car car=null;
		for (int i = 0; i < cars.length; i++) {
			if (cars[i] instanceof Carriage) {
				Carriage carriage=(Carriage)cars[i];
				//输入的品牌和类型是否匹配
				if (carriage.getBrand().equals(brand)&&carriage.getType().equals(type)) {
					car=carriage;
					break;
				}
				System.out.println("没有找到可匹配的轿车！");
			}else if(cars[i] instanceof Coach){
				Coach coach=(Coach)cars[i];
				//输入的品牌和座位数是否匹配
				if (coach.getBrand().equals(brand)&&coach.getLocation()==location) {
					car=coach;
					break;
				}
				System.out.println("没有找到可匹配的客车！");
			}
		}
		return car;
	}
}
