package c06.decorator;
/**
 * 服飾類別
 * @author Yan
 *
 */
public class Trouser extends Finery {
	public Trouser(Person p) {
		super(p);
	}
	public Trouser() {
	}
	protected Person component;	
	@Override
	public void show() {
		System.out.print("垮褲 ");
		super.show();
	}
}

