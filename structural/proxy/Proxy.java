package structural.proxy;


//代理模式就是多一个代理类出来，替原对象进行一些操作
public class Proxy implements Sourceable{
	
	private Source source;
	
	public Proxy() {
		super();
		this.source = new Source();
	}
	
	@Override
	public void method() {
		before();
		source.method();
		after();
	}
	
	public void after() {
		System.out.println("After proxy!");
	}
	
	public void before() {
		System.out.println("Before proxy!");
	}
		
}
