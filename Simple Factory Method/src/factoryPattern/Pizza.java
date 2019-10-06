package factoryPattern;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough;
	String sause;
	ArrayList<String> toppings = new ArrayList<String>();

	public String get_name() {
		return this.name;
	}
	
	public void prepare() {
		System.out.println("Preparing " + this.name);
	}
	
	public void bake() {
		System.out.println("Baking " + this.name);
	}
	
	public void cut() {
		System.out.println("Cutting " + this.name);
	}
	
	public void box() {
		System.out.println("Boxing " + this.name);
	}
	
	@Override
	public String toString() {
		String s;
		s = "----" + this.name + "----\n";
		s+= this.dough + "\n";
		s+= this.sause + "\n";
		for(String topping : toppings) {
			s+= topping + "\n";
		}
		return s;
	}
}
