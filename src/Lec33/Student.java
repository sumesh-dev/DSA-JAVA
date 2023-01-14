package Lec33;

public class Student {
	String name;
	int age;

	public void Intro_YourSelf() { //non static function
		System.out.println("My Name Is " + name + " And Age Is " + age);
	}
	public void SayHey(String name) {
		System.out.println(name+" Say Hey "+this.name);
	}
	static {
		System.out.println("Loading Student.java");
	}
}
