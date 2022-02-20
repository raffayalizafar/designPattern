
package TemplatePatternTask;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Going to build Concrete Wall House...");
		House house = new ConcreteWallHouse();
		house.buildHouse();
		System.out.println("Concrete Wall House constructed successfully");
		System.out.println("********************************************");
		System.out.println("Going to build Glass Wall House...");
		house= new GlassWallHouse();
		house.buildHouse();
		System.out.println("Glass Wall House constructed successfully");
	}

}
