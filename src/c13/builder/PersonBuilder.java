package c13.builder;

/**
 * 小人建造器抽像類別，訂出要建造一個小人所需要的方法
 * @author Yan
 *
 */
public abstract class PersonBuilder {
	
	/**
	 * 畫一個小人的頭
	 */
	public abstract void buildHead();
	/**
	 * 畫一個小人的身體
	 */
	public abstract void buildBody();
	/**
	 * 畫一個小人的左手
	 */
	public abstract void buildLeftArm();
	/**
	 * 畫一個小人的右手
	 */
	public abstract void buildRightArm();
	/**
	 * 畫一個小人的左腳
	 */
	public abstract void buildLeftLeg();
	/**
	 * 畫一個小人的右腳
	 */
	public abstract void buildRightLeg();
	
	/**
	 * 宣告建造完成
	 */
	public abstract void buildFinish();
}

