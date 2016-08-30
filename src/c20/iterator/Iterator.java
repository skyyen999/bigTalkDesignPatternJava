package c20.iterator;

/**
 * 迭代器介面
 * @author Yan
 * @param <T>
 */
public interface Iterator<T> {
	/**
	 * 取出第一個元素
	 * @return
	 */
	T first();
	/**
	 * 取出下一個元素
	 * @return
	 */
	T next();
	/**
	 * 判斷是否結束
	 * @return
	 */
	boolean isDone();
	
	/**
	 * 取當前元素
	 * @return
	 */
	T currentItem();
	
}
