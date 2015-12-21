package creational.singleton;

public class SingletonTest {
	
	//在自己的类中创建实例
	private static SingletonTest instance = null;
	
	//使用private 的声明方式，禁止外部使用new关键字创建
	private SingletonTest() {
		
	}
	//使用synchronized防止多线程环境
	private static synchronized void syncInit() {
		if(instance == null) {
			instance = new SingletonTest();
		}
	}
	
	public static SingletonTest getInstance() {
		if(instance == null) {
			syncInit();
		}
		return instance;
	}
}
