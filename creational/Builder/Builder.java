package creational.Builder;

import java.util.ArrayList;
import java.util.List;

//Builder是将各种产品几种起来进行管理，用来创建复合对象的。
//所谓复合对象就是指某个类具有不同的属性
public class Builder {
	
	private List<Sender> senders = new ArrayList<Sender>();
	
	public void produceMailSenders (int count) {
		for(int i = 0; i < count; i++) {
			senders.add(new MailSender());
		}
	}
	
	public void produceSmsSenders (int count) {
		for(int i =0; i < count; i++) {
			senders.add(new SmsSender());
		}
	}
	
}


//建造者模式将很多功能集成到一个类里，这个类可以创造出比较复杂的东西。
//所以与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
//因此，是选择工厂模式还是建造者模式，依实际情况而定。