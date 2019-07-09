package day08;

public class test08_NoteBook {
	double price;//笔记本的价格
	int page;//页数
	int quality;//质量(g)
	double length;//长(cm)
	double width;//宽
	public void show(){
		System.out.println("价格:"+price+",页数:"+page+",质量:"+quality+""
				+ ",长:"+length+",宽:"+width);
	}
	public void show1(test08_NoteBook noteBook){
		System.out.println("价格:"+noteBook.price+",页数:"+noteBook.page+",质量:"+noteBook.quality+""
				+ ",长:"+noteBook.length+",宽:"+noteBook.width);
	}
	public void show2(double price,int page,int quality,double length,double width){
		System.out.println("价格:"+price+",页数:"+page+",质量:"+quality+""
				+ ",长:"+length+",宽:"+width);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test08_NoteBook noteBook=new test08_NoteBook();
		noteBook.price=18.5;
		noteBook.page=100;
		noteBook.quality=450;
		noteBook.length=30;
		noteBook.width=20;
		noteBook.show();
		noteBook.show1(noteBook);
		noteBook.show2(noteBook.price, noteBook.page, noteBook.quality, noteBook.length, noteBook.width);
	}

}
