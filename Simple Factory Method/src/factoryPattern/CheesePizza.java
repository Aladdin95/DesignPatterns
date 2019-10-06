package factoryPattern;

public class CheesePizza extends Pizza{
	public CheesePizza(){
		this.name = "Cheese Pizza";
		this.dough = "Regular Crust";
		this.sause = "Marinara Pizza Sause";
		this.toppings.add("Fresh Mozzarella");
		this.toppings.add("Parmesan");
	}
}
