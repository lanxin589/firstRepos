package day01_HelloJava;

/**
 * 
 * @author 胡华
 *  使用三种java注释，给HelloWord每行代码添加注释
 */
public class Demo03_HelloWord {//声明类名，注意类名与文件名字一致。建议：类名首字母大写。
    //mian方法，是程序的入口。
	public static void main(String[] args) {
		
		/*
		 * System.out.println() 打印并换行。
		 * System.out.print()   打印，但不换行   
		 * System.out.print() 使用\n转义符， 让其能换行打印
		 * 
		 * 使用\t，让光标移动到下一个水平制表位置。
		 */
		System.out.println("HelloWord....");
		
		System.out.print("床前明月光，");
		System.out.print("疑是地上霜。");
		
		System.out.print("\n举头望明月，低头思故乡。\n");
		
		System.out.print("\t静夜思——李白");

	}

}
