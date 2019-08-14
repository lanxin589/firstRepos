package day08;

import java.util.Scanner;


public class test10_StudentsBiz {
	//学生姓名列表
	String[] names=new String[30];
	//行为
	
	/**
	 * 添加学生姓名
	 * @param name 要增加的姓名
	 */
	public void addStuName() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入学生姓名:");
		for (int i = 0; i < names.length; i++) {
			//遍历学生姓名列表，遇到第一个null赋值，并结束
			if (names[i]==null) {
				names[i] = scanner.next();
				break;
			}
		}
	}
	public void display() {
		System.out.println("本班学生列表: ");
		for (int i = 0; i < names.length; i++) {
			if (names[i]!=null) {//排除掉学生列表数组为null的元素
				System.out.print(names[i]+"\t");
			}
		}
	}
	/**
	 * 在一定区间查找学生姓名
	 * @param start 开始查找位置
	 * @param end 结束位置
	 * @param name 要查找的学生
	 * @return flag是否查到该学生 true为查到
 	 */
	public boolean search() {//查找位置以下标为基准
		Scanner scanner = new Scanner(System.in);
		boolean flag = false;
		System.out.print("请输入要查找的位置:");
		int start = scanner.nextInt();
		System.out.print("请输入结束查找的位置:");
		int end = scanner.nextInt();
		System.out.print("请输入查找的姓名:");
		String name = scanner.next();
		System.out.println();
		if (start > end || start > names.length - 1 || end < 0) {
			System.out.println("输入错误!");
		} else {
			if (start >= 0 && end <= names.length - 1) {
				for (int i = start; i <= end; i++) {
					if ((name.equals(names[i]))) {
						flag = true;
						break;
					}
				}
			} else if (start < 0 && end > names.length - 1) {
				for (int i = 0; i < names.length; i++) {
					if ((name.equals(names[i]))) {
						flag = true;
						break;
					}
				}
			} else if (start < 0 && end <= names.length - 1) {
				for (int i = 0; i <= end; i++) {
					if ((name.equals(names[i]))) {
						flag = true;
						break;
					}
				}
			} else if (start >= 0 && end > names.length - 1) {
				for (int i = start; i < names.length; i++) {
					if ((name.equals(names[i]))) {
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
		test10_StudentsBiz studentsBiz = new test10_StudentsBiz();
		for (int i = 0; i < 5; i++) {
			studentsBiz.addStuName();
		}
		//显示学生姓名列表
		studentsBiz.display();
		System.out.println();
		if (studentsBiz.search()) {
			System.out.println("***** 查找结果 *****");
			System.out.println("找到了!");
		} else {
			System.out.println("***** 查找结果 *****");
			System.out.println("没找到");
		}
	}

}
