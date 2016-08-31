package c06.decorator;
/**
 * 服飾類別
 * @author Yan
 *
 */
public class Sneakers extends Finery {
	public Sneakers(){
		
	}
	
	public Sneakers(Finery p) {
		super(p);
	}
	protected Finery component;	
	@Override
	public void show() {
		System.out.print("球鞋 ");
		super.show();
	}
}

