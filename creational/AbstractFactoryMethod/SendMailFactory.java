package creational.AbstractFactoryMethod;

public class SendMailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}
	
}
