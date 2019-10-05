package StrategyPattern;
public class Simulate {
	public static void main(String[] args) {
		Batta b1 = new Magro7a();
		b1.perform();
		
		System.out.println();
		
		Batta b2 = new Le3ba();
		b2.perform();
		
		System.out.println();
		
		System.out.println(((Magro7a)b1).gotShot());
		
		System.out.println();
		
		b1.perform();
	}
}
