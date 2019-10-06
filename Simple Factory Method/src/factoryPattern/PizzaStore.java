package factoryPattern;

public class PizzaStore {
	PizzaFactory factory;
	
	public PizzaStore(PizzaFactory factory) {
		this.factory = factory;
	}
	
	public Pizza orderPizza(String... type) {
		Pizza pizza = this.factory.get_pizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
