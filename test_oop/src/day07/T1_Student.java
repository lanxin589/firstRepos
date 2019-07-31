package day07;
/*
 * 有类Student，属性sex被protected修饰。
 * 证明：
  sex不仅能在本类，同包中的其他类访问。跨包下，其子类 也访问
 */
public class T1_Student {
	protected String name="邬秋生";
	public void print(){
		System.out.println(this.name);//同一类中访问sex
	}
}
