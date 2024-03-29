package Day07.Ex04_02_AccessModifier;

import Day07.Ex04_01_AccessModifier.Person;

public class Manager {
	
	public static void main(String[] args) {
		Student student = new Student();
		student.defaultSetting();
		System.out.println("name : " + student.name);			// name 만 public
		System.out.println("height : " + student.getHeight());	// getter 메소드
		System.out.println("age : " + student.getAge());
		System.out.println("weight : " + student.getWeight());
		
		System.out.println();
		
		Person person = new Person("김휴면", 175, 20, 60);
		System.out.println("name : " + person.name);			// name 만 public
		System.out.println("height : " + person.getHeight());
		System.out.println("age : " + person.getAge());
		System.out.println("weight : " + person.getWeight());
		
		System.out.println();
	}
}
