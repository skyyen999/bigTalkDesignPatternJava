package c01.simpleFactory;

/**
 * 毎一種計算邏輯(+,-,*,/)各自獨立抽出一個"計算class"，Calculator class規範"計算class"應該有哪些方法
 * @author Yan
 *
 */
public abstract class Calculator {
	protected int numberA = 0;
	protected int numberB = 0;
	
	public void setNumber(int a, int b){
		numberA = a;
		numberB = b;
	}
	
	/**
	 * 這個方法需要被overwrite，計算的方法請在這邊實作
	 * @return
	 */
	public abstract int getResult();
}
