package oop.rectangle;

public class testRectangle {

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
		System.out.println(r);
		r.setLength(2);
		r.setWidth(2);
		System.out.println("The Length and Width of the rectangle is "+r.getLength()+" and "+r.getWidth());
		System.out.println("The Area and Perimeter of the rectangle is "+r.getArea()+" and "+r.getPerimeter());
	}

}
