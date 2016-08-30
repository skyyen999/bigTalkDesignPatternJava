package c20.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<T> items = new ArrayList<>();
	
	@Override
	public Iterator<T> createIterator() {
		return new ConcreteIterator<>(this);
	}
	
	public int size(){
		return items.size();
	}
	
	public T get(int index){
		return items.get(index);
	}
	
	public void add(T t){
		items.add(t);
	}
}
