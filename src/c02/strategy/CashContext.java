package c02.strategy;

import c02.strategy.simpleFactory.CashSuper;

public class CashContext {
	private CashSuper cs;
	
	public CashContext(CashSuper cs){
		this.cs = cs;
	}
	
	public int GetResult(int money){
		return cs.acceptCash(money);
	}
}
