package c23.command;
/**
 * 燒烤店-客戶端(命令模式)
 * @author Yan
 *
 */
public class BarbecueClient {

	public static void main(String[] args) {
		//開店前準備
		Barbecuer boy = new Barbecuer();
		Command bakeMutton = new BakeMutonCommand(boy);
		Command bakeChicken = new BakeChickenWingCommand(boy);
		Waiter girl = new Waiter();
		
		//開始營業 客戶點餐
		girl.setOrder(bakeMutton);
		girl.setOrder(bakeMutton);
		girl.setOrder(bakeChicken);
		girl.setOrder(bakeChicken);
		// 雞翅賣完
		girl.setOrder(bakeChicken);
		girl.setOrder(bakeMutton);
		// 取消一個雞翅
		girl.cancelOrder(bakeChicken);
		
		girl.setOrder(bakeChicken);
		
		// 雞翅又賣完了
		girl.setOrder(bakeChicken);
		girl.setOrder(bakeMutton);
		System.out.println();
		// 點餐完成，烤肉
		girl.notifyBaker();
	}
	
}
