package c20.iterator;
/**
 * 公車買票-客戶端(iterator模式) 
 * @author Yan
 *
 */
public class IteratorClient {
	public static void main(String[] args) {
		ConcreteAggregate<String> a = new ConcreteAggregate<>();
		a.add("鳥哥");
		a.add("蔡蟲");
		a.add("吉他");
		a.add("內部員工");
		a.add("小偷");
		
		Iterator<String> it = new ConcreteIterator<>(a);
		while(it.isDone()){
			System.out.println(it.currentItem() + " 買票!");
			it.next();
		}
	}
}
