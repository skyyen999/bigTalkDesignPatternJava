package bigtalk.adapter;

import c17.adapter.CenterPlayer;
import c17.adapter.Player;
import c17.adapter.Translator;

/**
 * 轉接器-客戶端
 * @author Yan
 *
 */
public class TranslatorClient {
	public static void main(String[] args) {
		Player b = new CenterPlayer("bill");
		b.attack();
		
		Player ym = new Translator("姚明");
		ym.attack();

	}
}
