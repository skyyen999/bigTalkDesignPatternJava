package c17.adapter;

import c17.adapter.CenterPlayer;
import c17.adapter.Player;
import c17.adapter.Translator;

/**
 * NBA翻譯-客戶端(轉接器模式)
 * @author Yan
 *
 */
public class TranslatorClient {
	public static void main(String[] args) {
		Player b = new CenterPlayer("bill");
		b.attack();
		
		Player ym = new Translator("姚明");
		ym.attack();
		ym.defense();

	}
}
