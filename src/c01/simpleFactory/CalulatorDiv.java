package c01.simpleFactory;

/**
 * 除法計算
 * @author Yan
 *
 */
public class CalulatorDiv extends Calculator {
	@Override
	public int getResult() {
		return numberA/numberB;
	}
}
