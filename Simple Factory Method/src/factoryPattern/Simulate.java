package factoryPattern;

public class Simulate {

	public static void main(String[] args) {
		PizzaFactory simplefactory = new SimplePizzaFactory();
		PizzaFactory rand1factory = new Random1PizzaFactory();
		PizzaFactory rand2factory = new Random2PizzaFactory();
		
		PizzaStore mystore = new PizzaStore(simplefactory);
		Pizza mypizza = mystore.orderPizza();
		System.out.println("we got " + mypizza);
		
		mystore.factory = rand1factory;
		mypizza = mystore.orderPizza();
		System.out.println("we got " + mypizza);
		
		mystore.factory = rand2factory;
		mypizza = mystore.orderPizza();
		System.out.println("we got " + mypizza);
	}
	
}
