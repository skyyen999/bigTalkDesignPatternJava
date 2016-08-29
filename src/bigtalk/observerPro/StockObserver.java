package bigtalk.observerPro;

public class StockObserver extends Observer{

	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update(String states) {
		System.out.println(states + "->" + name + " 別再看股票行情了!!");
	}

}
