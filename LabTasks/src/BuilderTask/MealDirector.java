package BuilderTask;

public class MealDirector {
	
	public void makeMeal(MealBuilder mealBuilder) {
		
		mealBuilder.addSandwich("Subway");
		mealBuilder.addSides("Soup");
		mealBuilder.addDrink("Chai");
		mealBuilder.addOffer("Special Saturday");
		mealBuilder.setPrice(499);
	}
}
