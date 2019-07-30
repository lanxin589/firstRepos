package day07;

public class T5_PlainRect extends T5_Rect{
	double startX;//左上角横坐标
	double startY;//左上角纵坐标
	//带参构造方法
	public T5_PlainRect(double width, double height, double startX, double startY) {
		super(width, height);
		this.startX = startX;
		this.startY = startY;
	}
	//无参构造方法
	public T5_PlainRect(){
		this(0, 0, 0, 0);
	}
	public boolean IsInside(double x,double y){//判断点是否在矩形内
		if (x>=startX&&x<=(startX+width)&&y<startY&&y>=(startY-height)) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		//矩形初始位置(10,10),宽20,高10
		T5_PlainRect plainRect=new T5_PlainRect(20, 10, 10, 10);
		System.out.println("矩形的面积:"+plainRect.area());
		System.out.println("矩形的周长:"+plainRect.perimeter());
		if (plainRect.IsInside(25.5, 13)) {
			System.out.println("点(25.5,13)在矩形内");
		}else {
			System.out.println("点(25.5,13)不在矩形内");
		}
	}
}
