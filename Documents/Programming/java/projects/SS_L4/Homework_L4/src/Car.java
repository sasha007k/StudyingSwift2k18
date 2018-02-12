import java.util.Scanner;

public class Car {

	private String type;
	private int year;
	private double engine_cap;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getEngine_cap() {
		return engine_cap;
	}

	public void setEngine_cap(double engine_cap) {
		this.engine_cap = engine_cap;
	}

	public Car() {
	}

	public Car(String type, int year, double engine_cap) {
		this.type = type;
		this.year = year;
		this.engine_cap = engine_cap;
	}

	@Override
	public String toString() {
		return "Car [type = " + type + ", year = " + year + ", engine_cap = " + engine_cap + "]";
	}

	public void setInfo(Car[] mas) {
		Scanner in = new Scanner(System.in);
		String type;
		int year;
		double engine_cap;
		for (int i = 0; i < mas.length; i++) {
			mas[i] = new Car();
			System.out.println("Input type: ");
			type = in.next();
			mas[i].setType(type);
			System.out.println("Input year: ");
			year = in.nextInt();
			mas[i].setYear(year);
			System.out.println("Input engine capacity: ");
			engine_cap = in.nextDouble();
			mas[i].setEngine_cap(engine_cap);

		}

		in.close();
	}

	public void showWithYear(Car[] mas) {
		Scanner in = new Scanner(System.in);
		int year;
		// System.out.println("Input year: "); // Така ж проблема як і в практичному завданні
		// year = in.nextInt();
		year = 2000;
		for (int i = 0; i < mas.length; i++) {
			if (year == mas[i].year) {
				System.out.println(mas[i]);
			}
		}

		in.close();
	}

	public void sortWithYear(Car[] mas) {
		int temp;
		for (int i = 0; i < mas.length - 1; i++) {
			for (int j = i + 1; j < mas.length; j++) {
				if (mas[i].year > mas[j].year) {
					temp = mas[i].year;
					mas[i].year = mas[j].year;
					mas[j].year = temp;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			System.out.println(mas[i]);
		}

	}

}
