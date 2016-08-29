package bigtalk.observerPro;

public class NBAObserver extends Observer{

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update(String states) {
		System.out.println(states + "->" + name + " 快把NBA關了!!");
	}

}
