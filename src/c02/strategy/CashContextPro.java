package c02.strategy;

import c02.strategy.simpleFactory.CashDiscount;
import c02.strategy.simpleFactory.CashNomal;
import c02.strategy.simpleFactory.CashReturn;
import c02.strategy.simpleFactory.CashSuper;

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
