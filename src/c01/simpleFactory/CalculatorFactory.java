package c01.simpleFactory;

/**
 * SimpleFactory Pattern
 * 使用Calculator Factory來產生對應的計算類別<br>
 * 缺點是程式碼被拆的很散，不是適合簡單的小功能<br>
 * 優點是容易擴充與維護，因為毎個計算類別都是獨立的
 * 因此寫程式的人只要專注在一個計算類別是就好<br>
 * 要擴充時也只要新增類別，並且來這個SimpleFactory增加switch選相即可
 * @author Yan
 *
 */
public class CalculatorFactory {
	
	
	public static Calculator getCalculator(char operator) throws Exception{
		Calculator calculator = null;
		switch(operator){
			case '+' : calculator = new CalulatorAdd(); break;  
			case '-' : calculator = new CalulatorSub(); break;  
			case '*' : calculator = new CalulatorMul(); break;  
			case '/' : calculator = new CalulatorDiv(); break;  
			default : throw new Exception("輸入錯誤");
		}
		
		return calculator;
	}
}
