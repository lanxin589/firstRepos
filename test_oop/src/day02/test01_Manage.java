package day02;
/*
 * 1、键盘录入学员姓名与学分。
录入完毕后，管理系统能自动修改学员成绩，少于60的提高2分。也能输出所以的学员成绩。
 */
import java.util.Scanner;

public class test01_Manage {//管理系统
	int i;
	public void autoModify(Student[] student){//自动修改
		Scanner scanner=new Scanner(System.in);
		for (int i = 0; i < student.length; i++) {
			System.out.print("请输入学员姓名:");
			student[i].name=scanner.next();
			System.out.print("请输入学员学分:");
			student[i].score=scanner.nextDouble();
			if (student[i].score<60) {
				student[i].score+=2;
			}
		}
	}
	public void display(Student[] student){//显示所有学生信息
		System.out.println("所有学生的信息如下：");
		for (int i = 0; i < student.length; i++) {
			System.out.println("第"+(i+1)+"个学生的姓名:"+student[i].name+"\t成绩:"+student[i].score);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test01_Manage manage=new test01_Manage();
		Student[] students=new Student[3];
		for (int i = 0; i < students.length; i++) {
			students[i]=new Student();
		}
		manage.autoModify(students);
		manage.display(students);
	}

}
class Student{//学员类
	String name;//学员姓名
	double score;//学员成绩
}