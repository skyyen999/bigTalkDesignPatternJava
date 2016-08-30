package c14.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 通知者介面，負責通知那些不物正業的員工，老闆回來了
 * @author Yan
 *
 */
public abstract class Subject {
	protected List<Observer> list = new ArrayList<>();

	public void attach(Observer observer){
		list.add(observer);
	};
	public void detach(Observer observer){
		list.remove(observer);
	}
	
	public abstract void notifyObserver(String states);
}
