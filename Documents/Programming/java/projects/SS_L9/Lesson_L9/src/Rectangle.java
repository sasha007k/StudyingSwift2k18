
public class Rectangle extends myException {

	private double a;
	private double b;

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public Rectangle() {
		super();
	}

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void squareRectangle(double a, double b) {
		try {
			multInMinus(a, b);
		} catch (myException e) {
			System.err.println(e);
		}
	}

}
