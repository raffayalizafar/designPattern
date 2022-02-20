package homeWork.circle;

public class testCircle {

	public static void main(String[] args) {
		Circle c = new Circle();
		System.out.println("The Radius and Color of the circle is "+c.getRadius()+ " and "+c.getColor());
		System.out.println("The Area of the circle is "+ c.getArea());
		Circle c2= new Circle(2.0);
		System.out.println("The Radius and Color of the circle is "+c2.getRadius()+ " and "+c2.getColor());
		System.out.println("The Area of the circle is "+ c2.getArea());
		Circle c3= new Circle(3.0,"Green");
		System.out.println("The Radius and Color of the circle is "+c3.getRadius()+ " and "+c3.getColor());
		System.out.println("The Area of the circle is "+ c3.getArea());
		System.out.println(c);
	}
	
}
