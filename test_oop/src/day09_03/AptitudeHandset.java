package day09_03;
/*
 * 智能手机类继承了手机类并实现了上网、播放、照相接口
 */
public class AptitudeHandset extends Handset implements PlayWiring, Network, TakePhotos {

	@Override
	public void networkConn() {//重写上网方法
		// TODO Auto-generated method stub
		System.out.println("我用智能手机上网");
	}

	@Override
	public void play(String content) {//重写播放方法
		// TODO Auto-generated method stub
		System.out.println("我用智能手机播放一段视频:"+content);
	}

	@Override
	public void sendInfo() {//重写发信息方法
		// TODO Auto-generated method stub
		System.out.println("我用智能手机发送了一条信息");
	}

	@Override
	public void call() {//重写通电话方法
		// TODO Auto-generated method stub
		System.out.println("我用智能手机打电话");
	}

}
