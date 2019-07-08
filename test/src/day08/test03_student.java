package day08;

public class test03_student {
	String name;
	int age;
	char sex;
	int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test03_student xiaoWang=new test03_student();
		test03_student xiaoHong=new test03_student();
		xiaoWang.name="小王";
		xiaoWang.age=25;
		xiaoWang.sex='男';
		xiaoWang.id=01;
		xiaoHong.name="小红";
		xiaoHong.age=20;
		xiaoHong.sex='女';
		xiaoHong.id=02;
		System.out.println(xiaoWang.name+"的信息:");
		System.out.println("姓名:"+xiaoWang.name);
		System.out.println("年龄:"+xiaoWang.age);
		System.out.println("性别:"+xiaoWang.sex);
		System.out.println("编号:"+xiaoWang.id);
		System.out.println(xiaoHong.name+"的信息:");
		System.out.println("姓名:"+xiaoHong.name);
		System.out.println("年龄:"+xiaoHong.age);
		System.out.println("性别:"+xiaoHong.sex);
		System.out.println("编号:"+xiaoHong.id);
	}

}
