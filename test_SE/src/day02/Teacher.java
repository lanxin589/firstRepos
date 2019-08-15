package day02;
/*
 * toString()方法来自父类Object，输出一个对象的地址（类名+@+hashcode）
 * equals()方法来自父类Object，与==想同，比较两个对象的地址是否相同
 */
public class Teacher {
	private String name;
	private char sex;
	public Teacher(){
		
	}
	
	public Teacher(String name, char sex) {
		super();
		this.name = name;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Teacher: 姓名:" + name + ", 性别:" + sex;
	}
	@Override
	public boolean equals(Object obj){
		if (obj instanceof Teacher) {
			Teacher other=(Teacher)obj;
			if (obj==this||(this.name==other.name)&&(this.sex==other.sex)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
		
	}
}
