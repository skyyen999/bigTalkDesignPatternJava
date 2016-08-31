package c28.visitor;
/**
 * 成功狀態
 * @author Yan
 *
 */
public class Success implements Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName() + " "+ this.getClass().getSimpleName()+"時，背後多半有一個偉大的女人");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName() + " "+  this.getClass().getSimpleName()+"時，背後多半有一個QQ的男人");		
	}

}
