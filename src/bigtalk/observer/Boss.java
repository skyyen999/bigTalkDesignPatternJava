package bigtalk.observer;
/**
 * 老闆也可以是一個通知者，只是被老闆通知上班別偷懶會很慘
 * @author Yan
 *
 */
public class Boss extends Subject {

	@Override
	void notifyObserver(String states) {
		for(Observer ob : list){
			ob.update(states);
		}
	}
}
