
public class myException extends Exception {

	private double a;
	private double b;
	private String warn;

	public myException(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public myException() {
		super();
	}

	public myException(String warn) {
		super(warn);
		this.warn = warn;
	}

	public void multInMinus(double a, double b) throws myException {
		if (a < 0 || b < 0) {
			throw new myException("a or b or both are below 0");
		} else {
			System.out.println(a * b);
		}
	}

}
