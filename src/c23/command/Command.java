package c23.command;
/**
 * 抽象命令
 * @author Yan
 *
 */
public abstract class Command {
	// 接受指令的人
	protected Barbecuer receiver;
	public Command(Barbecuer receiver){
		this.receiver = receiver;
	}
	
	// 執行指令
	abstract public void excuteCommand();
	
	abstract public String getName();

}
