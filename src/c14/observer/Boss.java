package c14.observer;
/**
 * 老闆也可以是一個通知者，只是被老闆通知上班別偷懶會很慘
 * @author Yan
 *
 */
public class Boss extends Subject {

	@Override
	public void notifyObserver(String states) {
		for(Observer ob : list){
			ob.update(states);
		}
	}
}
