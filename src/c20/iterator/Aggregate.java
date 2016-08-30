package c20.iterator;

/**
 * 集合元素抽象介面
 * @author Yan
 * @param <T>
 */
public interface Aggregate<T> {
	Iterator<T> createIterator();
}
