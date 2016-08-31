package c02.strategy;

import org.junit.Test;

import c02.strategy.CashContext;
import c02.strategy.CashContextPro;
import c02.strategy.simpleFactory.CashDiscount;
import c02.strategy.simpleFactory.CashNomal;
import c02.strategy.simpleFactory.CashReturn;
/**
 * 收銀櫃檯-客戶端(策略模式)
 * @author Yan
 *
 */
public class CashClient {
	public static void main(String[] args) {
		CashContextTest();
		CashContextProTest();
	}

	/**
	 * 策略模式
	 */
	public static void CashContextTest(){
		int count = 5; //數量
		int price = 100; //價錢
		double discount = 0.9;
		
		// 與工廠模式相同，客戶端程式需傳入收費方式字串
		String type = "discount";
		CashContext cct = null;
		
		// 因為這樣又把switch case的程式暴露在客戶端程式，因此需要把判斷程式搬到Context內，將策略模式與工廠模式結合
		switch(type) {
			case "normal":  cct = new CashContext(new CashNomal()); break; 
			case "discount": cct = new CashContext(new CashDiscount(discount)); break; 
			case "return":  cct = new CashContext(new CashReturn(300,100));break; 
		}	
		System.out.println("========策略模式==========");

		System.out.println("買了:" + count*price + " 收費模式" + type +" 需收費:" + cct.GetResult(price*count) );

	}
	
	@Test
	/**
	 * 結合策略模式與工廠模式
	 */
	public static void CashContextProTest(){
		int count = 5; //數量
		int price = 100; //價錢
		String type = "discount";
		CashContextPro cct = new CashContextPro(type);
		System.out.println("========結合策略模式與工廠模式==========");
		System.out.println("買了:" + count*price + " 收費模式" + type +" 需收費:" + cct.GetResult(price*count) );

	}
}
