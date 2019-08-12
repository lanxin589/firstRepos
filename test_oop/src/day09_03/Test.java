package day09_03;

public class Test {//测试类
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handset handset=new CommonHandset();//实例化普通手机对象
		if (handset instanceof CommonHandset) {
			CommonHandset commonHandset=(CommonHandset)handset;
			commonHandset.play("abcdefg");//普通手机播放音频
			commonHandset.sendInfo();//普通手机发信息
			commonHandset.call();//普通手机打电话
		}
		handset=new AptitudeHandset();
		if (handset instanceof AptitudeHandset) {
			AptitudeHandset aHandset=(AptitudeHandset)handset;
			aHandset.play("----====");//智能手机播放视频
			aHandset.sendInfo();//智能手机发送信息
			aHandset.call();//智能手机打电话
		}
	}

}
