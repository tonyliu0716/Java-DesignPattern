package behavioral.Observer;

import java.util.Enumeration;
import java.util.Vector;

public abstract class AbstractSubject implements Subject{
	
	private Vector<Observer> vector = new Vector<Observer>();
	
	//相当于重写了Subject当中的add方法
	public void add(Observer observer) {
		vector.add(observer);
	}
	
	//重写delete方法
	public void delete(Observer observer) {
		vector.remove(observer);
	}
	
	//重写了通知的方法
	public void notifyObservers() {
		Enumeration<Observer> enumo = vector.elements();
		while(enumo.hasMoreElements()) {
			enumo.nextElement().update();
		}
	}
	
	
}
