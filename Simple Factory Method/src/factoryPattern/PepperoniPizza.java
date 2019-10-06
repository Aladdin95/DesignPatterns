package factoryPattern;

public class PepperoniPizza extends Pizza{
	public PepperoniPizza() {
		this.name = "Pepperoni Pizza";
		this.dough = "Crust";
		this.sauce = "Marinara Sause";
		this.toppings.add("Sliced Pepproni");
		this.toppings.add("Sliced Onion");
		this.toppings.add("Grated parmesan cheese");
	}
}
