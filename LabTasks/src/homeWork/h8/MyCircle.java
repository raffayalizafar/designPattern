package homeWork.h8;

import homeWork.h7.MyPoint;

public class MyCircle {
	private MyPoint center;
	private int radius;
	
	public MyCircle() {
		center=new MyPoint(0,0);
		radius=1;
	}
	public MyCircle(int x, int y, int radius) {
		center=new MyPoint(x,y);
		this.radius=radius;
	}
	public MyCircle(MyPoint center, int radius) {
		this.center=center;
		this.radius=radius;
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public MyPoint getCenter() {
		return center;
	}
	public void setCenter(MyPoint center) {
		this.center = center;
	}
	public int getCenterX() {
		return center.getX();
	}
	public void setCenterX(int centerX) {
		center.setX(centerX);
	}
	public int getCenterY() {
		return center.getY();
	}
	public void setCenterY(int centerY) {
		center.setY(centerY);
	}
	public int[] getCenterXY() {
		int[] xy= {0,0};
		xy[0]=center.getX();
		xy[1]=center.getY();
		return xy;
	}
	public void setCenterXY(int x, int y) {
		setCenterX(x);
		setCenterY(y);
	}
	@Override
	public String toString() {
		return "MyCircle [center=" + center + ", radius=" + radius + "]";
	}
	public double getArea() {
		double area = Math.PI*(radius*radius);
		return area;
	}
	public double getCircumference() {
		double circumference = 2*Math.PI*radius;
		return circumference;
	}
	public double distance(MyPoint another) {
		double dist;
		dist=Math.sqrt(Math.pow((another.getX()-center.getX()),2)+Math.pow((another.getY()-center.getY()),2));
		return dist;
	}
}
