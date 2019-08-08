package day09_03;

public class TestPCI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deploy deploy=new Deploy();//实例化装配对象
		PCI pci=new VGAcard();//实例化显卡对象
		deploy.setPci(pci);//安装显卡
		deploy.deploy();
		pci.start();//显卡开始工作
		pci.stop();//显卡结束工作
		pci=new SoundCard();//实例化声卡对象
		deploy.setPci(pci);//安装声卡
		deploy.deploy();
		pci.start();//声卡开始工作
		pci.stop();//声卡结束工作
		pci=new NIC();//实例化网卡对象
		deploy.setPci(pci);//安装网卡
		deploy.deploy();
		pci.start();//网卡开始工作
		pci.stop();//网卡结束工作
	}

}
