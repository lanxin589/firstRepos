package day07;

import day07_01.T1_PostGraduate;

public class T1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		T1_Student student=new T1_Student();
		student.print();
		System.out.println(student.name);//同一包的不同类访问sex
		T1_PostGraduate postGraduate=new T1_PostGraduate();
		postGraduate.print();
	}

}
