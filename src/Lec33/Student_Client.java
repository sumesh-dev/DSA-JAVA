package Lec33;

//import java.util.ArrayList;
public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Bye");
		Student s = new Student();
		Student s1 = new Student();
		s.name="kaju";
		s.age=21;
		s1.name="Katli";
		s1.age=22;
		s.Intro_YourSelf();
		s1.Intro_YourSelf();
		s.SayHey("Priya");
		System.out.println(s1.name);
		s1.SayHey("priya");
//		ArrayList<Integer> list = new ArrayList<>();
//		Scanner sc = new Scanner(System.in);
//		sc.close();
//		list.add(2);
	}
	static {
		System.out.println("********************************");
	}

}
