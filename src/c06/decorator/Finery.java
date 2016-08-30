package c06.decorator;
/**
 * 服飾類別
 * @author Yan
 *
 */
public class Finery extends Person {
	protected Person component;
	public Finery(){
		
	}
		
	public Finery(Person p){
		this.component = p;
	}
	
	//打扮
	public void decorate(Person p){
		this.component = p;
	}
	
	@Override
	public void show() {
		if(component != null){
			component.show();
		}
	}
}

