package day08;

public class test04_Student {
	String name;
	int age;
	double score;
	String remark;
	public void display(String name,int age,double score,String remark){
		System.out.println("姓名:"+name);
		System.out.println("年龄:"+age);
		System.out.println("成绩:"+score);
		System.out.println("老师备注:"+remark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test04_Student zs=new test04_Student();
		zs.name="张三";
		zs.age=25;
		zs.score=88;
		zs.remark="几次模拟考试起伏较大";
		zs.display(zs.name,zs.age,zs.score,zs.remark);
		System.out.println("------------------------------");
		test04_Student ls=new test04_Student();
		ls.name="李四";
		ls.age=19;
		ls.score=95.5;
		ls.remark="几次模拟考试成绩比较稳定，希望保持发挥。";
		ls.display(ls.name,ls.age,ls.score,ls.remark);
		System.out.println("------------------------------");
		ls.display(ls.name,ls.age,ls.score,ls.remark);
		System.out.println("------------------------------");
		test04_Student empty=new test04_Student();
		empty.display(empty.name, empty.age, empty.score, empty.remark);
		
		
	}

}
