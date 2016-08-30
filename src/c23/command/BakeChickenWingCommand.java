package c23.command;
/**
 * 烤雞翅命令
 * @author Yan
 *
 */
public class BakeChickenWingCommand extends Command {
	private String name = "chickhenWing";
	public BakeChickenWingCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeChickenWing();
	}

	public String getName(){
		return name;
	}
}
