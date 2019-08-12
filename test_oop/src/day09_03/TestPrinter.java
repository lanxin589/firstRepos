package day09_03;

public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer=new DotMatrixPrinter();
		printer.print();
		printer=new InkpetPrinter();
		printer.print();
		printer=new LaserPrinter();
		printer.print();
	}

}
