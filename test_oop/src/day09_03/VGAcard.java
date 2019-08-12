package day09_03;
/*
 * 显卡实现PCI接口
 */
public class VGAcard implements PCI {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("显卡在PCI插槽中开始工作");
	}	

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("显卡在PCI插槽中停止工作");
	}

	@Override
	public String toString() {
		return "显卡";
	}
	
}
