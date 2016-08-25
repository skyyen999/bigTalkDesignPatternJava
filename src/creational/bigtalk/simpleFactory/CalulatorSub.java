package creational.bigtalk.simpleFactory;

/**
 * 減法計算
 * @author Yan
 *
 */
public class CalulatorSub extends Calculator {
	@Override
	public int getResult() {
		return numberA-numberB;
	}
}
