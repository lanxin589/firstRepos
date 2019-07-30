package mark2;
/*
 * 在包mark2中创建类Stest的main方法中测试。
	在实例化S类前，其static块被调用一次。
	调用S类中的weight ，能否被修改????
	调用S类中的size，能否被修改????
 */
public class Stest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S s=new S();
		//s.weight=2;final修饰的变量为常量，不可修改
		S.size=2;//static修饰的静态变量可以直接类名.修改其值
	}

}
