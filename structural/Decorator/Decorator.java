package structural.Decorator;

public class Decorator implements Sourceable{

	private Sourceable source;
	
	public Decorator(Sourceable source) {
		this.source = source;
	}
	
	@Override
	public void method() {
		System.out.println("Before decorator!");
		source.method();
		System.out.println("After decorator!");
	}
	
}
