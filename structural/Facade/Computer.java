package structural.Facade;

public class Computer {
	private Cpu cpu;
	private Disk disk;
	private Memory memory;
	
	public Computer() {
		cpu = new Cpu();
		disk = new Disk();
		memory = new Memory();
	}
	
	public void startup() {
		System.out.println("start the computer!");
		cpu.startup();
		disk.startup();
		memory.startup();
		System.out.println("started the computer finished!");
	}
	
	public void shutdown() {
		System.out.println("start to close the computer!");
		cpu.shutdown();
		disk.shutdown();
		memory.shutdown();
		System.out.println("computer closed!");
	}
}
