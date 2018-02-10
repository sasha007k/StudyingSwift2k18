import java.util.Scanner;
public class Person 
{
	
	private String name;
	private int birthYear;
	
		
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getBirthYear() 
	{
		return birthYear;
	}
	public void setBirthYear(int birthYear) 
	{
		this.birthYear = birthYear;
	}
	
	public Person() {}
	public Person(String name, int birthYear) 
	{
		this.name = name;
		this.birthYear = birthYear;
	}
	
	public void Age()
	{
		int age;
		age = 2018 - birthYear;
		System.out.println(age);
	}
	
	public void Input() 
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Input name: ");
		name = in.nextLine();
		System.out.println("Input birth year: ");
		birthYear = in.nextInt();
		in.close();
		
	}
	
	public String Output()
	{
		return "Person [name = " + name + ", Birth year = " + birthYear + "]";

	}
	
	public void changeName(String name)
	{
		this.name = name;
	}
	
}
