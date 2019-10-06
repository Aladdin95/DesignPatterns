package factoryPattern;

public class ChicagoStyleVeggiePizza extends Pizza {
	public ChicagoStyleVeggiePizza() {
		this.name = "Chicago Deep Dish Veggie Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Black Olives");
		this.toppings.add("Spinach");
		this.toppings.add("Eggplant");
	}

}
