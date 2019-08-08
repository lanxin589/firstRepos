package day09_03;
/*
 * 普通手机类继承手机类并实现播放接口
 */
public class CommonHandset extends Handset implements PlayWiring {

	@Override
	public void play(String content) {//重写播放方法
		// TODO Auto-generated method stub
		System.out.println("我用普通手机播放了一段音频:"+content);
	}

	@Override
	public void sendInfo() {//重写发信息方法
		// TODO Auto-generated method stub
		System.out.println("我用普通手机发了一条信息");
	}

	@Override
	public void call() {//重写通电话方法
		// TODO Auto-generated method stub
		System.out.println("我用普通手机打电话");
	}

}
