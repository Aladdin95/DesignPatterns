package factoryPattern;

public class ChicagoStyleClamPizza  extends Pizza {
	public ChicagoStyleClamPizza () {
		this.name = "Chicago Style Clam Pizza";
		this.dough = "Extra Thick Crust Dough";
		this.sauce = "Plum Tomato Sauce";
		this.toppings.add("Shredded Mozzarella Cheese");
		this.toppings.add("Frozen Clams from Chesapeake Bay");
	}
}
