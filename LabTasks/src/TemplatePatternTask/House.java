package TemplatePatternTask;

public abstract class House {

	public final void buildHouse() {
		
		constructWalls();
		constructWindows();
		constructDoors();
		paintHouse();
		decorateHouse();
		
	}
	abstract void decorateHouse();
	abstract void paintHouse();
	abstract void constructDoors();
	abstract void constructWindows();
	abstract void constructWalls();
	final void constructRoof() {
		System.out.println("Roof has been constructed.");
	}
	final void constructBase() {
		System.out.println("Base has benn constructed.");
	}
	
}
