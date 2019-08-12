package day10;

public class ScannerTest {
	double score;
	
	public void setScore(double score) throws InputException{
		if (score<0||score>100) {
			throw new InputException("请正确输入成绩信息");
		}else {
			this.score = score;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScannerTest sTest=new ScannerTest();
		try {
			sTest.setScore(-1);
		} catch (InputException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
