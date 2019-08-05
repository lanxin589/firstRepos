package day09;

public abstract class Car {//汽车类
	private String brand;//品牌
	private double rentmoney;//日租金
	String carNo;//车牌号
	public Car() {
		
	}
	public Car(String brand,double rentmoney,String carNo) {
		this.brand = brand;
		this.rentmoney=rentmoney;
		this.carNo = carNo;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getRentmoney() {
		return rentmoney;
	}
	public void setRentmoney(double rentmoney) {
		this.rentmoney = rentmoney;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}
	public abstract double calrent(int day);
}
