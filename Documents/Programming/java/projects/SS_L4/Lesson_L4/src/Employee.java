
import java.util.Scanner;

public class Employee {

	private String name;
	private int department_number;
	private double salary;

	public Employee() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartment_number() {
		return department_number;
	}

	public void setDepartment_number(int department_number) {
		this.department_number = department_number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name = " + name + ", department_number = " + department_number + ", salary = " + salary + "]";
	}

	public void setInfo(Employee[] mas) {
		Scanner in = new Scanner(System.in);
		String name;
		int department_number;
		double salary;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = new Employee();
			System.out.println("Input name: ");
			name = in.next();
			mas[i].setName(name);
			System.out.println("Input department number: ");
			department_number = in.nextInt();
			mas[i].setDepartment_number(department_number);
			System.out.println("Input salary: ");
			salary = in.nextDouble();
			mas[i].setSalary(salary);

		}

		in.close();
	}

	public void findWithDN(Employee[] mas) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input department number: ");
		int depart_num;
		depart_num = in.nextInt(); // Чому воно не дає ввести число з консолі (вискакує помилка)?
//		depart_num = 3;			  // Якщо зразу ініціалізувати, то все працює.
		for (int i = 0; i < mas.length; i++) {
			if (mas[i].department_number == depart_num) {
				System.out.println(mas[i]);
			}
		}

		in.close();
	}

	public void sortWithSalary(Employee[] mas) {
		double temp;
		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = 1; j > mas.length; j++) {
				if (mas[i].salary > mas[j].salary) {
					temp = mas[i].salary;
					mas[i].salary = mas[j].salary;
					mas[j].salary = temp;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

	}

}
