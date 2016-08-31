package c22.bridge;
/**
 * 手機軟體-客戶端(橋接模式)
 * @author Yan
 *
 */
public class HandsetClient {
	public static void main(String[] args) {
		HandsetBrand hb;
		//M牌手機
		hb = new HandsetBrandM();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		hb.setHandsetSoft(new HandsetContactList());
		hb.run();
		System.out.println();
		
		//N牌手機
		hb = new HandsetBrandN();
		hb.setHandsetSoft(new HandsetGame());
		hb.run();
		hb.setHandsetSoft(new HandsetContactList());
		hb.run();
		
	}
}
