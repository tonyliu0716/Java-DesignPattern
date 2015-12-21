package behavioral.ChainOfResponsibility;

//有多个对象，每个对象持有对下一个对象的引用，这样就会形成一条链，请求在这条链上传递，直到某一对象决定处理该请求。

public class MyHandler extends AbstractHandler implements Handler{

	private String name;
	
	public MyHandler(String name) {
		this.name = name;
	}
	
	@Override
	public void operator() {
		System.out.println(name + " deal!");
		if(getHandler() != null) {
			getHandler().operator();
		}
	}
	
}
