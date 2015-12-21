package creational.AbstractFactoryMethod;

public interface Provider {
	//通过这个Provider提供统一的创建对象的入口
	public Sender produce ();
}
