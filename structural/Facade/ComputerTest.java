package structural.Facade;

//外观模式就是将他们的关系放在一个Facade类中(这里是Computer类)，降低了类类之间的耦合度
public class ComputerTest {
	public static void main(String[] args){
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}
}
