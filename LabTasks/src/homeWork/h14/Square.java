package homeWork.h14;

public class Square extends Rectangle {
	private double side;
	
	public Square() {
		super();
		side = 1.0;
		// TODO Auto-generated constructor stub
	}
	
	public Square(double side) {
		super(side,side);
		// TODO Auto-generated constructor stub
	}

	public Square(double side, String color, boolean filled) {
		super(side,side,color, filled);
		// TODO Auto-generated constructor stub
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public void setWidth(double side) {
		super.setWidth(side);
	}
	public void setLength(double side) {
		super.setLength(side);
	}

	@Override
	public String toString() {
		return "Square [" +super.toString() + "]";
	}
	
}
