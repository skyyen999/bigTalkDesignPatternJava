package c28.visitor;
/**
 * 狀態
 * @author Yan
 *
 */
public interface Action {
	void getManConclusion(Man concreteElementA);
	void getWomanConclusion(Woman concreteElementB);
}
