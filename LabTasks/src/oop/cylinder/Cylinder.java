package oop.cylinder;

public class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		super();
		height = 1.0;
	}
	
	public Cylinder(double radius) {
		super(radius);
		height = 1.0;
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	public Cylinder(double radius, double height,String color) {
		super(radius, color);
		this.height =height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI *(super.getRadius()*super.getRadius())*height;
	}

	@Override
	public double getArea() {
		return 2*Math.PI *(super.getRadius()*height)*(2*Math.PI *(super.getRadius()*super.getRadius()));
	}
}
