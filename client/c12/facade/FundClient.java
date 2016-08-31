package c12.facade;

import c12.facade.Fund;
/**
 * 基金-客戶端(外觀模式)<br>
 * 外觀模式將
 * @author Yan
 *
 */
public class FundClient {
	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buyFund();
		fund.sellFund();
	}
}
