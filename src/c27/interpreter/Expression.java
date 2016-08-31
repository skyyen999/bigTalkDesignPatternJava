package c27.interpreter;
/**
 * 運算式類別
 * @author Yan
 *
 */
public abstract class Expression {
	public void interpret(PlayContext context){
		if(context.getText().length() > 0){
			// 從樂譜取出第一條命令  ex."O 3 E 0.5"取出 playkey = "O"，playValue = "3"
			String text = context.getText();
			String playKey = text.substring(0, 1);
			text = text.substring(2);
			String playValue = text.substring(0, text.indexOf(" "));
			context.setText(text.substring(text.indexOf(" ") + 1));
			excute(playKey,playValue);
		}
	}
	
	public abstract void excute(String playKey,String playValue);
}
