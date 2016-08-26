package bigtalk.strategy;

import bigtalk.strategy.simpleFactory.CashDiscount;
import bigtalk.strategy.simpleFactory.CashNomal;
import bigtalk.strategy.simpleFactory.CashReturn;
import bigtalk.strategy.simpleFactory.CashSuper;

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
