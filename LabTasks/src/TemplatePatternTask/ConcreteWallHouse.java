package TemplatePatternTask;

public class ConcreteWallHouse extends House {
	
	@Override
	void decorateHouse() {
		// TODO Auto-generated method stub
		System.out.println("Decorating Concrete Wall House");
	}

	@Override
	void paintHouse() {
		// TODO Auto-generated method stub
		System.out.println("Painting Concretet Wall House");
	}

	@Override
	void constructDoors() {
		// TODO Auto-generated method stub
		System.out.println("Construct Doors for Concrete Wall House");
	}

	@Override
	void constructWindows() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Windows for Concrete Wall House");
		
	}

	@Override
	void constructWalls() {
		// TODO Auto-generated method stub
		System.out.println("Constructing Concrete Wall for my House");
	}

}
