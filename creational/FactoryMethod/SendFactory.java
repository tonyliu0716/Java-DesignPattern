package creational.FactoryMethod;

public class SendFactory {
	
	public Sender produce(String type) {
		if("mail".equals(type)) {
			return new MailSender();
		} else if ("sms".equals(type)) {
			return new SmsSender();
		} else {
			System.out.println("Please input the correct type!");
			return null;
		}
	}
	
	//multiFactoryMethod 多个工厂方法模式
	//与上面相比，我们直接返回相对应的对象
	public Sender produceMail () {
		return new MailSender();
	}
	
	public Sender produceSms () {
		return new SmsSender();
	}
	
}
