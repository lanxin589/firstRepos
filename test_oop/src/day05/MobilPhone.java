package day05;

public class MobilPhone {
	public String brand;
	public MobilPhone(){
		this.brand="诺基亚";
	}
	public MobilPhone(String bra){
		this.brand=brand;
	}
	public String buy(){
		return "没发工资,买一个"+brand+"牌子的手机吧!";
	}
	public String buy(String reason){
		return reason+",快买一个"+brand+"牌子的手机吧!";
	}
}
