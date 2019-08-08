package day09_03;

public class Deploy {
	PCI pci;
	public void setPci(PCI pci) {
		if (pci instanceof VGAcard) {
			this.pci=(VGAcard)pci;
		}else if (pci instanceof SoundCard) {
			this.pci=(SoundCard)pci;
		}else if (pci instanceof NIC) {
			this.pci=(NIC)pci;
		}
	}
	public void deploy(){
		System.out.println(pci+"安装完成");
	}
}
