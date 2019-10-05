
public abstract class Batta {
	protected int id;
	protected String name;
	protected static int c=0;
	
	protected FlyBehaviour fb;
	
	public Batta(){
		this.id = c++;
		this.name = "Batta#"+this.id;
		this.fb = new FlyWithWings();
	}
	
	public String swim() {
		return "hey, I'm swimming! :D";
	}
	
	protected abstract String display();
	
	public void perform() {
		System.out.println("Hi I'm " + this.name);
		System.out.println(this.swim());
		System.out.println(this.display());
		System.out.println(this.fb.fly());
	}
}
