package StrategyPattern;
public class Le3ba extends Batta {
	public Le3ba() {
		super();
		this.fb = new FlyNoFly();
	}
	
	@Override
	protected String display() {
		return "I'm Le3ba";
	}
}
