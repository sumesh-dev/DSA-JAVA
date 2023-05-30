package Lec34;

public class Student {
	private String name = "Anish";
	private int age = 22;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void Intro_YourSelf() {
		System.out.println("My Name Is " + name + " And Age Is " + age);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			System.out.println("In Try ");
			if (age < 0) {
				throw new Exception("Bklol Age Kabhi -ve Nahi Hota");
			}
			this.age = age;

		} 
		catch (Exception e) {
			System.out.println("In Catch ");
			e.printStackTrace();
		}
		finally {
			System.out.println("I am in Fianlly Block");
		}
	}
}