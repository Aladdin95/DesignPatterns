package factoryPattern;

import java.util.Random;

public class Random1PizzaFactory implements PizzaFactory{

	@Override
	public Pizza get_pizza(String... type) {
		Random rand = new Random();
		int r = rand.nextInt(10);
		Pizza temp = null;
		if(r==0) {
			temp = new CheesePizza();
		} else if (r==1) {
			temp = new PepperoniPizza();
		} else {
			temp = new VeggiePizza(); 
		}
		return temp;
	}
	 
}
