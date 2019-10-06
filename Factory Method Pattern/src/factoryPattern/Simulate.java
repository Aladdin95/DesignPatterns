package factoryPattern;

public class Simulate {

	public static void main(String[] args) {

		PizzaStore mystore = new NYPizzaStore();
		Pizza mypizza = mystore.orderPizza();
		System.out.println("we got " + mypizza);
		
		mystore = new ChicagoPizzaStore();
		mypizza = mystore.orderPizza();
		System.out.println("we got " + mypizza);
	}
	
}
