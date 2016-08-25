package behavioral.bigtalk.strategy.factory;

public class CashDiscount extends CashSuper{
	private double discount ;

	@SuppressWarnings("unused")
	private CashDiscount(){};
	
	/**
	 * 建立本類別時一定要傳入折扣
	 * @param discount
	 */
	public CashDiscount(double discount){
		this.discount = discount;
	}
	
	@Override
	/**
	 * 打折收費，收費 = 原價*折扣
	 */
	public int acceptCash(int money) {
		return (int) Math.round(money*discount);
	}

		
}
