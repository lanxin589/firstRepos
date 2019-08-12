package day09_03;
/*
 * 声卡类实现PCI接口
 */
public class SoundCard implements PCI {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("声卡在PCI插槽中开始工作");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("声卡在PCI插槽中停止工作");
	}

	@Override
	public String toString() {
		return "声卡";
	}
	
}
