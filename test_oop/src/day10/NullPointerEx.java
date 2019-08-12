package day10;

public class NullPointerEx {
	public static void main(String[] args) {
		String s=null;
		try {
			String s2=s.concat("123");
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}
}
