package c28.visitor;
/**
 * 失敗狀態
 * @author Yan
 *
 */
public class Failing implements Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName() + " "+ this.getClass().getSimpleName()+"時，會被女人唾棄");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName() + " "+  this.getClass().getSimpleName()+"時，上網QQ找人回收");		
	}

}
