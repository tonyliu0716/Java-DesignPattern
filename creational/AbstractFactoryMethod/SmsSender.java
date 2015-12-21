package creational.AbstractFactoryMethod;

public class SmsSender implements Sender{

	@Override
	public void send() {
		System.out.println("This is the SMS Sender!");
		
	}
	
}
