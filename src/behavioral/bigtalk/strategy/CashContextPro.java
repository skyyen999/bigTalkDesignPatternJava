package behavioral.bigtalk.strategy;

import behavioral.bigtalk.strategy.factory.CashDiscount;
import behavioral.bigtalk.strategy.factory.CashNomal;
import behavioral.bigtalk.strategy.factory.CashReturn;
import behavioral.bigtalk.strategy.factory.CashSuper;

public class CashContextPro {
	private CashSuper cs;
	
	public CashContextPro(String type){
		switch(type) {
			case "normal":  cs = new CashNomal(); break; 
			case "discount": cs = new CashDiscount(0.8); break; 
			case "return":  cs =new CashReturn(300,100);break; 
		}	
	}
	
	public int GetResult(int money){
		return cs.acceptCash(money);
	}
}
