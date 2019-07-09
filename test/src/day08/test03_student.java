package day08;

public class test03_student {
	String name;//学生姓名
	int age;//学生年龄
	char sex;//学生性别
	int classNo;//学生学号
	public void show(){
		System.out.println(name+","+age+","+sex+","+classNo);
	}
	public void show1(String name,int age,char sex,int classNo){
		System.out.println(name+","+age+","+sex+","+classNo);
	}
	public void show2(test03_student ts){
		System.out.println(ts.name+","+ts.age+","+ts.sex+","+ts.classNo);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test03_student xiaoWang=new test03_student();
		test03_student xiaoHong=new test03_student();
		test03_student xs=new test03_student();
		test03_student xz=new test03_student();
		xiaoWang.name="小王";
		xiaoWang.age=25;
		xiaoWang.sex='男';
		xiaoWang.classNo=01;
		xiaoHong.name="小红";
		xiaoHong.age=20;
		xiaoHong.sex='女';
		xiaoHong.classNo=02;
		xs.name="小三";
		xs.age=19;
		xs.sex='男';
		xs.classNo=03;
		xz.name="小张";
		xz.age=15;
		xz.sex='男';
		xz.classNo=04;
		xiaoHong.show2(xiaoHong);
//		System.out.println(xiaoWang.name+"的信息:");
//		System.out.println("姓名:"+xiaoWang.name);
//		System.out.println("年龄:"+xiaoWang.age);
//		System.out.println("性别:"+xiaoWang.sex);
//		System.out.println("编号:"+xiaoWang.classNo);
//		System.out.println(xiaoHong.name+"的信息:");
//		System.out.println("姓名:"+xiaoHong.name);
//		System.out.println("年龄:"+xiaoHong.age);
//		System.out.println("性别:"+xiaoHong.sex);
//		System.out.println("编号:"+xiaoHong.classNo);
	}

}
