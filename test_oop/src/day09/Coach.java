package day09;

public class Coach extends Car {// 客车
	private int location;// 座位数

	public Coach() {
		super();
	}

	public Coach(String brand, double rentmoney,String carNo,int location) {
		super(brand, rentmoney, carNo);
		this.location = location;
	}
	

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	public double calrent(int day) {
		double rentmoney=this.getRentmoney()*day;
		if (day>=150) {
			rentmoney*=0.6;
		}else if (day>=30) {
			rentmoney*=0.7;
		}else if(day>=7){
			rentmoney*=0.8;
		}else if (day>=3) {
			rentmoney*=0.9;
		}
		return rentmoney;
	}
}
