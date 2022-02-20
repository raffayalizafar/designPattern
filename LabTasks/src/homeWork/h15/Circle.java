package homeWork.h15;

public class Circle implements GeometricObject{
	protected double radius;
	
	public Circle() {
		radius = 1.0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public double getArea() {
		return Math.PI*(radius*radius);
	}
}
