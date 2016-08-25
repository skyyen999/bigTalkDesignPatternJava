package behavioral.bigtalk.strategy.factory;

/**
 * 商場收銀軟體，根據客戶所購買的商品與數量收費
 * @author Yan
 *
 */
public abstract class CashSuper {
	/**
	 * 各種收費規則的抽像類別，利如正常收費則acceptCash要回傳的就是原價 
	 * @param money
	 * @return
	 */
	public abstract int acceptCash(int money); 
}
