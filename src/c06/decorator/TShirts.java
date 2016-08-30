package c06.decorator;
/**
 * 服飾類別
 * @author Yan
 *
 */
public class TShirts extends Finery {
	public TShirts(Person p) {
		super(p);
	}
	public TShirts() {
	}
	protected Person component;	
	@Override
	public void show() {
		System.out.print("大T ");
		super.show();
	}
}

