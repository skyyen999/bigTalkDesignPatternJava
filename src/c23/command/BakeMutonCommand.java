package c23.command;
/**
 * 烤羊肉串命令
 * @author Yan
 *
 */
public class BakeMutonCommand extends Command {
	private String name = "mutton";
	public BakeMutonCommand(Barbecuer receiver) {
		super(receiver);
	}

	@Override
	public void excuteCommand() {
		receiver.bakeMutton();
	}
	public String getName(){
		return name;
	}
}
