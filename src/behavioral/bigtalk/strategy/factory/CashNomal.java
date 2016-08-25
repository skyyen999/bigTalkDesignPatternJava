package behavioral.bigtalk.strategy.factory;

public class CashNomal extends CashSuper{	
	@Override
	/**
	 * 正常收費，應該收多少錢就收多少錢
	 */
	public int acceptCash(int money) {
		return money;
	}

		
}
