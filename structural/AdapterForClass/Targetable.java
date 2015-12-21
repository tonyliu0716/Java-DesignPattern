package structural.AdapterForClass;

public interface Targetable {
	//与Source中的方法相同:使得Targetable接口的实现类，具有了Source类的功能
	public void method1();
	
	//新类的方法
	public void method2();
}
