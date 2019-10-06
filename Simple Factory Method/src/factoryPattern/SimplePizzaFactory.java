package factoryPattern;

public class SimplePizzaFactory implements PizzaFactory{
	@Override
	public Pizza get_pizza(String... type_list) {
		Pizza pizza = null;
		String type;
		
		if(type_list.length > 0) {
			type = type_list[0];
		} else {
			type = "cheese";
		}
		
		if(type == "pepperoni") {
			pizza = new PepperoniPizza();
		}else if(type == "clam") {
			pizza = new ClamPizza();
		}else if(type == "veggie") {
			pizza = new VeggiePizza();
		} else {
			pizza = new CheesePizza();
		}

		return pizza;
	}
}
