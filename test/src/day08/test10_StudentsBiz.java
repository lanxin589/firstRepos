package day08;

import java.util.Scanner;

public class test10_StudentsBiz {
	String stuName;

	public void addStuName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入学生姓名:");
		stuName = scanner.next();
	}

	public void display() {
		System.out.print(stuName + "\t");
	}

	public boolean search(test10_StudentsBiz[] studentsBizs) {//查找位置以下标为基准
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		System.out.print("请输入要查找的位置:");
		int start = scanner.nextInt();
		System.out.print("请输入结束查找的位置:");
		int end = scanner.nextInt();
		System.out.print("请输入查找的姓名:");
		String name = scanner.next();
		System.out.println();
		if (start > end || start > studentsBizs.length - 1 || end < 0) {
			System.out.println("输入错误!");
		} else {
			if (start >= 0 && end <= studentsBizs.length - 1) {
				for (int i = start; i <= end; i++) {
					if ((name.equals(studentsBizs[i].stuName))) {
						flag = true;
						break;
					}
				}
			} else if (start < 0 && end > studentsBizs.length - 1) {
				for (int i = 0; i < studentsBizs.length; i++) {
					if ((name.equals(studentsBizs[i].stuName))) {
						flag = true;
						break;
					}
				}
			} else if (start < 0 && end <= studentsBizs.length - 1) {
				for (int i = 0; i <= end; i++) {
					if ((name.equals(studentsBizs[i].stuName))) {
						flag = true;
						break;
					}
				}
			} else if (start >= 0 && end > studentsBizs.length - 1) {
				for (int i = start; i < studentsBizs.length; i++) {
					if ((name.equals(studentsBizs[i].stuName))) {
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test10_StudentsBiz[] studentsBizs = new test10_StudentsBiz[5];
		for (int i = 0; i < studentsBizs.length; i++) {
			studentsBizs[i] = new test10_StudentsBiz();
		}
		test10_StudentsBiz test = new test10_StudentsBiz();
		for (int i = 0; i < studentsBizs.length; i++) {
			studentsBizs[i].addStuName();
		}
		System.out.println("本班学生列表:");
		for (int i = 0; i < studentsBizs.length; i++) {
			studentsBizs[i].display();
		}
		System.out.println();
		System.out.println();
		if (test.search(studentsBizs)) {
			System.out.println("***** 查找结果 *****");
			System.out.println("找到了!");
		} else {
			System.out.println("***** 查找结果 *****");
			System.out.println("没找到");
		}
	}

}
