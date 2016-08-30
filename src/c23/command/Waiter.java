package c23.command;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 接訂單的服務生
 * @author Yan
 *
 */
public class Waiter {
	private int chickhenWingCount = 2;
	private int muttonCount = 3;
	private List<Command> orders = new ArrayList<>();
	
	/**
	 * 接訂單
	 * @param command
	 */
	@SuppressWarnings("deprecation")
	public void setOrder(Command command){
		if(command.getName().equals("chickhenWing")){
			if(chickhenWingCount <= 0){
				System.out.println("雞翅賣完了");
			}  else{
				System.out.println("增加"+ command.getName() +"訂單 時間:" + new Date().toLocaleString());
				chickhenWingCount--;
				orders.add(command);
			}
		} else {
			if(muttonCount <= 0){
				System.out.println("羊肉串賣完了");
			} else{
				System.out.println("增加"+ command.getName() +"訂單 時間:" + new Date().toLocaleString());
				muttonCount--;
				orders.add(command);

			}
		}
	}
	
	@SuppressWarnings("deprecation")
	/**
	 * 取消訂單
	 * @param command
	 */
	public void cancelOrder(Command command){
		if(command.getName().equals("chickhenWing")){
			chickhenWingCount++;
		} else {
			 muttonCount++;
		}
		orders.remove(command);
		System.out.println("取消"+ command.getName() +"訂單 時間:" + new Date().toLocaleString());
	}
	
	/**
	 * 將訂單將給廚師
	 */
	public void notifyBaker(){
		for(Command c:orders){
			c.excuteCommand();
		}
	}
}
