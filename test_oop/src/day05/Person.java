package day05;

class Person {
	private int age;
	private String name;
	public Person(){}
	public Person(String name,int age){
		super();
		this.age=age;
		this.name=name;
	}
	
}
class Student extends Person{
	private String subject;
	public Student(String name,int age,String subject){
		//super(name, age);
		this.subject=subject;
		
	}
	
	
}