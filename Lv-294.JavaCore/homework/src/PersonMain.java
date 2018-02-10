public class PersonMain {

	public static void main(String[] args) {
			
		Person p1 = new Person("Dima", 1989);
		Person p2 = new Person("Vasya", 1966);
		Person p3 = new Person("Sasha", 2000);
		Person p4 = new Person("Ivan", 1900);
		Person p5 = new Person("Nikita", 1889);
		
		System.out.println(p1.Output());
		System.out.println(p2.Output());
		System.out.println(p3.Output());
		System.out.println(p4.Output());
		System.out.println(p5.Output());
		
		p1.Age();
		p2.Age();
		p3.Age();
		p4.Age();
		p5.Age();
		
		p1.changeName("Max");
		System.out.println(p1.Output());		
		
		Person p6 = new Person();
		p6.Input();
		System.out.println(p6.Output());
		
		
	}


}
