package creational.Builder;

public class MailSender implements Sender{

	@Override
	public void Send() {
		System.out.println("This is Mail Sender!");
	}
	
}
