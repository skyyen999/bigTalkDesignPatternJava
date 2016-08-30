package c25.mediator;
/**
 * 國家
 * @author Yan
 *
 */
public abstract class Country {
	protected UniteNations mediator;
	public Country(UniteNations mediator){
		this.mediator = mediator;
	}
}
