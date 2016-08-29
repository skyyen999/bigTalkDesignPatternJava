package bigtalk.observerPro;

public class Boss extends Subject {

	@Override
	void notifyObserver(String states) {
		for(Observer ob : list){
			ob.update(states);
		}
	}
}
