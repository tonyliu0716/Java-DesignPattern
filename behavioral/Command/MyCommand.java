package behavioral.Command;

public class MyCommand implements Command{
	private Soldier soldier;
	
	public MyCommand(Soldier soldier) {
		this.soldier = soldier;
	}

	@Override
	public void exe() {
		soldier.action();
	}
	
	
}
