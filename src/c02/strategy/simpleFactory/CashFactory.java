package c02.strategy.simpleFactory;

public class CashFactory{	
	
	/**
	 * 收費方式工廠，根據傳入的參數決定要建立出哪種收費模式
	 */
	public static CashSuper createCashAccept(String type) {
		CashSuper cs = null;
		switch(type) {
			case "normal":  cs = new CashNomal(); break; 
			case "discount85": cs = new CashDiscount(0.85); break; 
			case "return300n100":  cs = new CashReturn(300,100);break; 
		}
		return cs;
	}

}
