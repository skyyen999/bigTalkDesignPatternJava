package c28.visitor;
/**
 * 人
 * @author Yan
 *
 */
public interface Person {
	/**
	 * 接受
	 * @param visitor 用來取得"狀態"
	 */
	void accept(Action visitor);
}
