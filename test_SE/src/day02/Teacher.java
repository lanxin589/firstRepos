package day02;
/*
 * toString()�������Ը���Object�����һ������ĵ�ַ������+@+hashcode��
 * equals()�������Ը���Object����==��ͬ���Ƚ���������ĵ�ַ�Ƿ���ͬ
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
		return "Teacher: ����:" + name + ", �Ա�:" + sex;
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
