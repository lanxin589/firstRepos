package day09;

import java.util.Scanner;

/*
 * 汽车租赁管理
 */
public class CarRentManage {// 汽车租赁管理类
	public void manage() {
		System.out.println("**********欢迎光临腾飞汽车租赁公司**********");
		Scanner sc = new Scanner(System.in);
		int choose = 0;// 选择客车与轿车
		CarOperation cOperation = new CarOperation();
		System.out.println("1、轿车\t2、客车");
		do {
			System.out.print("请选择你要租赁的汽车类型:");
			choose = sc.nextInt();
			if (choose == 1 || choose == 2) {
				break;
			}
			System.out.println("输入错误，请重新输入！");
		} while (true);
		String brand = "";
		String type = "";
		int location = 0;
		int chooseBrand = 0;// 选择品牌
		int chooseType = 0;// 选择型号
		int chooseLoc = 0;// 选择座位
		int day = 0;
		if (choose == 1) {// 租轿车
			do {
				System.out.print("请输入你要租赁的汽车品牌: 1、别克 2、宝马");
				chooseBrand = sc.nextInt();
				if (chooseBrand == 1 || chooseBrand == 2) {
					break;
				}
				System.out.println("输入错误，请重新输入！");
			} while (true);
			if (chooseBrand == 1) {// 选择别克
				brand = "别克";
				do {
					System.out.print("请输入你要租赁的汽车类型: 1、林荫大道 2、GL8");
					chooseType = sc.nextInt();
					if (chooseType == 1 || chooseType == 2) {
						break;
					}
					System.out.println("输入错误，请重新输入！");
				} while (true);
				if (chooseType == 1) {
					type = "林荫大道";
				} else if (chooseType == 2) {
					type = "GL8";
				}
			} else if (chooseBrand == 2) {// 选择宝马
				brand = "宝马";
				do {
					System.out.print("请输入你要租赁的汽车类型: 1、X6 2、550i");
					chooseType = sc.nextInt();
					if (chooseType == 1 || chooseType == 2) {
						break;
					}
					System.out.println("输入错误，请重新输入！");
				} while (true);
				if (chooseType == 1) {
					type = "X6";
				} else if (chooseType == 2) {
					type = "550i";
				}
			}

		} else if (choose == 2) {// 租客车
			do {
				System.out.print("请选择你要租赁的客车品牌: 1、金杯 2、金龙");
				chooseBrand = sc.nextInt();
				if (chooseBrand == 1 || chooseBrand == 2) {
					break;
				}
				System.out.println("输入错误，请重新输入！");
			} while (true);
			if (chooseBrand == 1) {// 选择金杯
				brand = "金杯";
			} else if (chooseBrand == 2) {// 选择金龙
				brand = "金龙";
			}
			do {
				System.out.print("请输入你租赁客车的座位数: 1、16 2、34");
				chooseLoc = sc.nextInt();
				if (chooseLoc == 1 || chooseLoc == 2) {
					break;
				}
				System.out.println("输入错误，请重新输入！");
			} while (true);
			if (chooseLoc == 1) {
				location = 16;
			} else if (chooseLoc == 2) {
				location = 34;
			}
		}
		// 调用租车方法
		Car car = cOperation.rentCar(brand, type, location);
		do {
			System.out.print("请选择你要租赁的天数:");
			day = sc.nextInt();
			if (day>0) {
				break;
			}
			System.out.println("输入错误，请重新输入！");
		} while (true);
		double rentmoney = car.calrent(day);
		if (rentmoney > 0) {
			System.out.println("租车成功！");
			System.out.println("分配给您的车牌号是:" + car.getCarNo());
			System.out.println("您需要支付的租赁费用是:" + rentmoney + "元");
		} else {
			System.out.println("租车失败！");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarRentManage carRentManage = new CarRentManage();
		carRentManage.manage();//调用管理方法
	}

}
