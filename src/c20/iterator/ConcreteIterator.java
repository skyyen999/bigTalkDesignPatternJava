package c20.iterator;

public class ConcreteIterator<T> implements Iterator<T> {
	private Aggregate<T> aggregate;
	private int current = 0;
	
	/**
	 * 初始化時傳入aggregate物件
	 * @param aggregate
	 */
	public ConcreteIterator(Aggregate<T> aggregate){
		this.aggregate = aggregate;
	}
	
	@Override
	public T first() {
		return aggregate.get(0);
	}

	@Override
	public T next() {
		current++;
		return current < aggregate.size() ? aggregate.get(current) : null;
	}

	@Override
	public boolean isDone() {
		return current < aggregate.size();
	}

	@Override
	public T currentItem() {
		return current < aggregate.size() ? aggregate.get(current) : null;
	}

}
