package BuilderTask;

public class Demo {

	public static void main(String[] args) {
		MealBuilder pizzaBuilder = new SandwichMealBuilder();
		MealDirector director = new MealDirector();
		director.makeMeal(pizzaBuilder);
		
		Meal meal = pizzaBuilder.getMeal();
		System.out.println(meal.toString());

	}

}
