package c12.facade;

import c12.facade.Fund;

public class FundClient {
	public static void main(String[] args) {
		Fund fund = new Fund();
		fund.buyFund();
		fund.sellFund();
	}
}
