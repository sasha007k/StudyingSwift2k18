
public class mainPage {

	public static void main(String[] args) {

		//// 1
		// Rectangle rt = new Rectangle();
		// rt.squareRectangle(4, -5);

		//// 2
		try {
			Plant pl = new Plant(5, "Red", "Rose");
			Plant pl1 = new Plant(3, "Blue", "Iris");
			System.out.println(pl);
			System.out.println(pl1);
		} catch (TypeException | ColorException e) {
			System.err.println(e.getMessage() + "\n");
			e.printStackTrace();
		}

	}

}
