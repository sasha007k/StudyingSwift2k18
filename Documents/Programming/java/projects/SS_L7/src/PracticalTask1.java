import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PracticalTask1 {

	public static void main(String[] args) {

		List<Integer> myCollection = new ArrayList<Integer>();
		List<Integer> newCollection = new ArrayList<Integer>();

		Random rand = new Random();

		for (int i = 0; i < 10; i++) {
			myCollection.add(rand.nextInt(30));
		}
		System.out.println("myCollection: ");
		System.out.println(myCollection);

		//// 1

		// for (int i = 0; i < 10; i++) {
		// if (myCollection.get(i) > 5)
		// {
		// newCollection.add(myCollection.get(i));
		// }
		//
		// }
		// System.out.println("newCollection: ");
		// System.out.println(newCollection);

		//// 2

		// Iterator <Integer> it = myCollection.iterator();
		// for (int i = 0; i < 10; i++) {
		// if (it.next() > 20)
		// {
		// it.remove();
		// }
		//
		// }
		// System.out.println("myCollection: ");
		// System.out.println(myCollection);

		//// 3

		// myCollection.add(1, 1);
		// myCollection.add(4, -4);
		// myCollection.add(7, -3);
		//
		// System.out.println("myCollection: ");
		// for (int i = 0; i < 13; i++) {
		// System.out.println("position – " + i + ", " + "value of element – " +
		// myCollection.get(i));
		//
		// }

		//// 4

		// Collections.sort(myCollection);
		// System.out.println("myCollection: ");
		// System.out.println(myCollection);

	}

}
