package bigtalk.facade;

import org.omg.Messaging.SyncScopeHelper;

/**
 * 幫你操作股票的基金類別
 * @author Yan
 *
 */
public class Fund {
	Stock stock;
	Realty realty;
	Nationaldept dept;
	
	public Fund(){
		stock = new Stock();
		realty = new Realty();
		dept   = new Nationaldept();
	}
	
	/**
	 * 基金操做投資組合
	 */
	public void buyFund(){
		stock.buy();
		realty.buy();
		dept.buy();
	};
	
	/**
	 * 基金操做投資組合
	 */
	public void sellFund(){
		stock.sell();
		realty.sell();
		dept.sell();
	};
}

/**
 * 股票類
 * @author Yan
 *
 */
class Stock {

	public void buy(){
		System.out.println("買入股票");
	}
	
	public void sell(){
		System.out.println("賣出股票");
	}

}

/**
 * 國債類
 * @author Yan
 *
 */
class Nationaldept {

	public void buy(){
		System.out.println("買入國債");
	}
	
	public void sell(){
		System.out.println("賣出國債");
	}

}

/**
 * 不動產類
 * @author Yan
 *
 */
class Realty {

	public void buy(){
		System.out.println("買入不動產");
	}
	
	public void sell(){
		System.out.println("賣出不動產");
	}

}
