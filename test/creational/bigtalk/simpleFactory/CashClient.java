package creational.bigtalk.simpleFactory;

import org.junit.Test;

import behavioral.bigtalk.strategy.factory.CashFactory;
import behavioral.bigtalk.strategy.factory.CashSuper;

/**
 * 商場收銀軟體，根據客戶所購買的商品與數量收費<br>
 * @author Yan
 *
 */
public class CashClient {
	
	@Test
	public void CashFactoryTest(){
		int count = 5; //數量
		int price = 100; //價錢
		String type = "normal";
		//type = "discount85";
		//type = "return300n100";
		
		// 工廠模式，客戶端程式需知道 CashSuper與 CashFactory兩個類別
		CashSuper csN = CashFactory.createCashAccept(type);
		
		int totalN = csN.acceptCash(count*price);
		System.out.println("買了:" + count*price + "收費模式normal 需收費:" + totalN );
	}

	
	
}
