package c14.observer;
/**
 * 櫃台秘書小妹，在門口看到老闆回來負責通知不務正業的同事
 * @author Yan
 *
 */
public class Secretary extends Subject{

	@Override
	public void notifyObserver(String states) {
		for(Observer ob:list){
			ob.update(states);;
		}
	}	
}
