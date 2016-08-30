package c22.bridge;
/**
 * bridge客戶端
 * @author Yan
 *
 */
public class HandsetClient {
	public static void main(String[] args) {
		HandsetBrand hb;
		hb = new HandsetBrandM();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		hb.setHandsetSoft(new HandsetContactList());
		hb.run();
		System.out.println();
		hb = new HandsetBrandN();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		hb.setHandsetSoft(new HandsetContactList());
		hb.run();
		
	}
}
