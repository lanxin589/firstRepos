package day09;

public class Carriage extends Car{//轿车
	private String type;//型号
	
	public Carriage() {
		
	}
	
	public Carriage(String brand, double rentmoney,String carNo,String type){
		super(brand,rentmoney, carNo);
		this.type=type;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double calrent(int day){
		double rentmoney=this.getRentmoney()*day;
		if (day>150) {
			rentmoney*=0.7;
		}else if (day>30) {
			rentmoney*=0.8;
		}else if(day>7){
			rentmoney*=0.9;
		}
		return rentmoney;
	}
}
