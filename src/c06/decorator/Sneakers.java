package c06.decorator;
/**
 * 服飾類別
 * @author Yan
 *
 */
public class Sneakers extends Finery {
	public Sneakers(){
		
	}
	
	public Sneakers(Person p) {
		super(p);
	}
	protected Person component;	
	@Override
	public void show() {
		System.out.print("球鞋 ");
		super.show();
	}
}

