package bigtalk.adapter;

import bigtalk.adapter.CenterPlayer;
import bigtalk.adapter.Player;
import bigtalk.adapter.Translator;

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
