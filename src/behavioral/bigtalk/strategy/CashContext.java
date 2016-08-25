package behavioral.bigtalk.strategy;

import behavioral.bigtalk.strategy.factory.CashSuper;

public class CashContext {
	private CashSuper cs;
	
	public CashContext(CashSuper cs){
		this.cs = cs;
	}
	
	public int GetResult(int money){
		return cs.acceptCash(money);
	}
}
