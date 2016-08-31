package c27.interpreter;
/**
 * 樂譜解析-客戶端(解譯器模式)
 * @author Yan
 *
 */
public class ContextPlayClient {
	public static void main(String[] args) {
		PlayContext context = new PlayContext();
		context.setText("O 2 E 0.5 G 0.5 A 3 ");
		
		Expression expression = null;
		
		while(context.getText().length() > 0){
			String str = context.getText().substring(0, 1);
			if("O".equals(str)){
				expression = new Scale();
			} else {
				expression = new Note();
			}
			
			expression.interpret(context);
		}
	}
}
