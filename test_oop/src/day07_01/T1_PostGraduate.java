package day07_01;

import day07.T1_Student;

public class T1_PostGraduate extends T1_Student{
	public void print(){
		System.out.println(super.name);//子类跨包访问
	}
}
