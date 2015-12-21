package structural.AdapterForObject;

public class Wrapper implements Targetable {
	
	private Source source;
	
	public Wrapper(Source source) {
		this.source = source;
	}
	
	@Override
	public void method1() {
		System.out.println("This is the targetable method!");
	}

	@Override
	public void method2() {
		source.method1();
	}
	
}
