package StrategyPattern;
public class Magro7a extends Batta {
	public Magro7a() {
		super();
		this.fb = new FlyWithWings();
	}
	
	@Override
	protected String display() {
		return "I'm Magro7a";
	}
	
	public String gotShot() {
		this.fb = new FlyNoFly();
		return "oh my god, I'm " + this.name + " and I've got shot :(";
	}
}
