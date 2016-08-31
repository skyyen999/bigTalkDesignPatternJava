package c27.interpreter;
/**
 * 演奏內容
 * @author Yan
 *
 */
public class PlayContext {
	private String text;
	/**
	 * 演奏樂譜
	 * @return
	 */
	public String getText() {
		return text;
	}

	/**
	 * 設定演奏的樂譜
	 * @param text
	 */
	public void setText(String text) {
		this.text = text;
	}
}
