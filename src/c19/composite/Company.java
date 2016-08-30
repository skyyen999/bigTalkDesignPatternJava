package c19.composite;
/**
 * 公司抽象類別
 * @author Yan
 *
 */
public abstract class Company {
	protected String name;
	public Company(String name){
		this.name = name;
	}
	/**
	 * 增加轄下部門或分公司
	 * @param c
	 */
	public abstract void add(Company c);
	/**
	 * 移除轄下部門或分公司
	 * @param c
	 */
	public abstract void remove(Company c);
	/**
	 * 印出組織結構圖
	 * @param depth
	 */
	public abstract void display(int depth);
	
	/**
	 * 印出組織職責
	 */
	public abstract void lineOfDuty();


}
