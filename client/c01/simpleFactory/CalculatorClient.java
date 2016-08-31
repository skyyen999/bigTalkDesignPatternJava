package c01.simpleFactory;

/**
 * 計算機-客戶端(簡單工廠模式 )<br>
 * calculatorA()是測試沒有使用簡單工廠模式的計算機<br>
 * CalculatorFactory()是使用簡單工廠模式的計算機
 * @author Yan
 *
 */
public class CalculatorClient {
	public static void main(String[] args) {
		calculatorA();	
		CalculatorFactory();
	}
	
	/**
	 * 業物邏輯與UI拆開的簡易計算機測試
	 */
	public static void calculatorA(){
		System.out.println(">>>> calculatorA 測試 <<<< ");
		
		// 輸入值
		Integer numberA = 10;
		Integer numberB = 2;
		char    operator = '+';
		
		try {
			// 計算並輸出
			System.out.println("輸入:" + numberA + operator + numberB  );
			CalculatorA calculator = new CalculatorA();
			int result = calculator.calculate(numberA, numberB, operator);
			System.out.println("計算結果：" + numberA + operator + numberB + "=" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 使用簡單工廠模式(SimpleFactory Pattern)實現簡易計算機
	 */
	public static void CalculatorFactory(){
		System.out.println(">>>> CalculatorFactory 測試 <<<< ");
		
		// 輸入值
		Integer numberA = 10;
		Integer numberB = 2;	
		char    operator = '-';
		
		try {
			System.out.println("輸入:" + numberA + operator + numberB  );
			Calculator calculator = CalculatorFactory.getCalculator(operator);
			calculator.setNumber(numberA, numberB);
			int result = calculator.getResult();
			System.out.println("計算結果：" + numberA + operator + numberB + "=" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}

}
