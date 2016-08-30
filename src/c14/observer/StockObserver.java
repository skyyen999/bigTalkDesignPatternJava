package c14.observer;

/**
 * 上班玩股票的同事
 * @author Yan
 *
 */
public class StockObserver extends Observer{

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update(String states) {
		System.out.println(states + "->" + name + " 別再看股票行情了!!");
	}

}
