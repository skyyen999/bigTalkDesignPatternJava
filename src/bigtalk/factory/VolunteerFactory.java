package bigtalk.factory;

/**
 * 產生社區義工的義工班(工廠)
 * @author Yan
 *
 */
public class VolunteerFactory implements IFactory {

	@Override
	public Nightingale CreateNightingale() {
		System.out.println("社區義工教育訓練...");
		System.out.println("教育訓練完成");
		return new Volunteer();
	}
}
