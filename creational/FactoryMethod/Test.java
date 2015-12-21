package creational.FactoryMethod;

public class Test {
	public static void main (String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender = factory.produce("sms");
		sender.Send();
		
		//multiFactoryMethod,返回多个实例
		Sender senderforMulti1 = factory.produceMail();
		Sender senderforMulti2 = factory.produceSms();
		
		senderforMulti1.Send();
		senderforMulti2.Send();
	}
}
