package c13.builder;

public class GundamBuilder extends PersonBuilder{


	@Override
	public void buildHead() {
		System.out.println("畫一個長橢圓做為頭");
		System.out.println("頭上兩條天線");
		System.out.println("畫眼睛，鼻子，嘴巴");
	}

	@Override
	public void buildBody() {
		System.out.println("畫一個長方型做為身體");
		System.out.println("畫鋼彈身體細部");
		System.out.println("畫身體後面的翅膀");
	}

	@Override
	public void buildLeftArm() {
		System.out.println("畫左手");
		System.out.println("..........裝配左手武器");
	}

	@Override
	public void buildRightArm() {
		System.out.println("畫右手");
		System.out.println("..........裝配右手武器");
	}

	@Override
	public void buildLeftLeg() {
		System.out.println("畫左腳，加上不會軟的膝蓋");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("畫左腳，加上不會軟的膝蓋");
	}

	@Override
	public void buildFinish() {
		System.out.println("鋼彈X建造完成");
	}

}
