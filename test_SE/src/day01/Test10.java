package day01;
/*
 * 10���ж�.java�ļ����Ƿ���ȷ
 */
public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Test10.java";
		int index=-1;
		index=str.lastIndexOf('.');
		if (index>0&&str.substring(index+1,str.length()).equals("java")) {
			System.out.println("java�ļ�����ȷ");
		}else {
			System.out.println("java�ļ�������ȷ");
		}
	}

}
