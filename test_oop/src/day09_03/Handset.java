package day09_03;

public abstract class Handset {//手机
	String brand;//品牌
	String type;//型号
	public abstract void sendInfo();//发信息
	public abstract void call();//通电话
	public void info(){
		System.out.println("该手机的品牌:"+brand+"\t型号:"+type);
	}
}
