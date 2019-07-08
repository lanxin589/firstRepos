package day06_test;

public class test02_DeleteElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] phones = { "iphone3GS", "iphone4", "iphone4s", "iphone5" };
		int index = -1;
		for (int i = 0; i < phones.length; i++) {
			if (phones[i].equals("iphone4") ) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			for (int i = index; i < phones.length - 1; i++) {
				phones[i] = phones[i + 1];
			}
			phones[phones.length - 1] = null;
		} else {
			System.out.println("没有找到删除的内容");
		}

		for (String string : phones) {
			System.out.println(string);
		}
	}

}
