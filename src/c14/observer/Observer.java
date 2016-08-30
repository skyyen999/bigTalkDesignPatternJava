package c14.observer;
/**
 * 定義各種不認真上班的同事，除了不物正業外，最重要的就是觀察通知者給的訊息，因此叫observer
 * @author Yan
 *
 */
public abstract class Observer {
	protected String name;
	protected Subject sub;
	public Observer(String name,Subject sub){
		this.name = name;
		this.sub = sub;
	}
	
	public abstract void update(String status);
}
