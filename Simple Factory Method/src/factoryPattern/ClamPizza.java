package factoryPattern;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		this.name = "Clam Pizza";
		this.dough = "Thin crust";
		this.sause = "White garlic sause";
		this.toppings.add("Clams");
		this.toppings.add("Grated parmesan cheese");
	}
}
