package c13.builder;

public class LinePersonBuilder extends PersonBuilder{


	@Override
	public void buildHead() {
		System.out.println("畫一個圓做為頭");
	}

	@Override
	public void buildBody() {
		System.out.println("畫一個正方型做為身體");
	}

	@Override
	public void buildLeftArm() {
		System.out.println("一條線表示左手");
	}

	@Override
	public void buildRightArm() {
		System.out.println("一條線表示右手");
	}

	@Override
	public void buildLeftLeg() {
		System.out.println("一條線表示左腳");
	}

	@Override
	public void buildRightLeg() {
		System.out.println("一條線表示右腳");
	}

	@Override
	public void buildFinish() {
		System.out.println("線條人建造完成");
	}

}
