package c20.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<T> implements Aggregate<T> {
	private List<T> items = new ArrayList<>();
	
	@Override
	public Iterator<T> createIterator() {
		return new ConcreteIterator<>(this);
	}
	@Override
	public int size(){
		return items.size();
	}
	@Override
	public T get(int index){
		return items.get(index);
	}
	@Override
	public void add(T t){
		items.add(t);
	}
}
