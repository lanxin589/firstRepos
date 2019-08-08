package day09_03;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal=new Bird();
		if (animal instanceof Bird) {
			Bird bird=(Bird)animal;
			bird.age=4;
			bird.color="红色";
		}
		animal.info();
		System.out.println();
		animal=new Fish();
		if (animal instanceof Fish) {
			Fish fish=(Fish)animal;
			fish.age=2;
			fish.weight=5;
		}
		animal.info();
	}

}
