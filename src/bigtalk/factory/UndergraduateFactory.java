package bigtalk.factory;

/**
 * 產生熱心大學生的社團(工廠)
 * @author Yan
 *
 */
public class UndergraduateFactory implements IFactory {

	@Override
	public Nightingale CreateNightingale() {
		System.out.println("義工社熱心大學生行前教育...");
		System.out.println("行前教育完成");
		return new Undergraduate();
	}
}
