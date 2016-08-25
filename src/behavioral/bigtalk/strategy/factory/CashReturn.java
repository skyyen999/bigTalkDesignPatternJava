package behavioral.bigtalk.strategy.factory;

public class CashReturn extends CashSuper{
	private double moneyCoundition;
	private double moneyReturn;
	
	public CashReturn(double moneyCoundition, double moneyReturn){
		this.moneyCoundition = moneyCoundition;
		this.moneyReturn = moneyReturn;
	}
	
	@Override
	/**
	 * 紅利收費，利如說滿300送100
	 */
	public int acceptCash(int money) {
		int result = money;
		
		// 收的錢比設定的條件還大，扣掉紅利優惠
		if(money > moneyCoundition){
			result = (int) (money - Math.floor(money/moneyCoundition)*moneyReturn);
		}
		return result;
	}

		
}
