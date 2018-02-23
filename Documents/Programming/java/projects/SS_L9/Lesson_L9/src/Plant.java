
public class Plant {

	private int size;
	private Color color;
	private Type type;

	public Plant(int size, String color, String type) throws ColorException, TypeException {
		Color c = colorStrToEnum(color);
		Type t = typeStrToEnum(type);
		this.size = size;
		this.type = t;
		this.color = c;
	}
	
	public enum Type{
		Begonia, Iris, Rose;
	}
	
	public enum Color{
		Blue, Red, White;
	}

	private Color colorStrToEnum(String color) throws ColorException {

		switch (color.toLowerCase()) {
		case "blue":
			return Color.Blue;
		case "red":
			return Color.Red;
		case "white":
			return Color.White;
		default:
			throw new ColorException("Input only color blue, red or white");
		}

	}

	private Type typeStrToEnum(String type) throws TypeException {

		switch (type.toLowerCase()) {
		case "begonia":
			return Type.Begonia;
		case "iris":
			return Type.Iris;
		case "rose":
			return Type.Rose;
		default:
			throw new TypeException("Input only type begonia, iris or rose");
		}

	}

	@Override
	public String toString() {
		return "Plant [size = " + size + ", color = " + color + ", type = " + type + "]";
	}

}
