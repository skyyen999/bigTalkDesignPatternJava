package c14.observer;

/**
 * 上班看NBA的同事
 * @author Yan
 *
 */
public class NBAObserver extends Observer{

	public NBAObserver(String name, Subject sub) {
		super(name, sub);
	}

	@Override
	public void update(String states) {
		System.out.println(states + "->" + name + " 把NBA關了!!");
	}

}
