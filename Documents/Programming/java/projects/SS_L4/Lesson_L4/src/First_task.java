import java.util.Scanner;

public class First_task {

	public void firstTask() {
		Scanner in = new Scanner(System.in);
		int[] mas = new int[10];
		System.out.println("Введіть елементи масиву: ");
		for (int i = 0; i < mas.length; i++) {
			mas[i] = in.nextInt();
		}
		int max = mas[0];
		for (int i = 0; i < mas.length; i++) {
			if (max < mas[i]) {
				max = mas[i];
			}
		}
		System.out.println("Максимальне значення = " + max);
		int sum = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > 0) {
				sum += mas[i];
			}
		}
		System.out.println("Сума = " + sum);
		int amount = 1;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 0) {
				amount *= mas[i];
			}
		}
		System.out.println("Добуток = " + amount);
		in.close();
	}

}
