package bigtalk.builder;

/**
 * 指揮如何建造小人的類別
 * @author Yan
 *
 */
public class PersonDerector {
	private PersonBuilder pb;
	public void setPersonBuilder(PersonBuilder pb){
		this.pb = pb;
	}
	
	public void createPersonFromHead(){
		System.out.println("從頭往下畫");
		pb.buildHead();
		pb.buildBody();
		pb.buildLeftArm();
		pb.buildRightArm();
		pb.buildLeftLeg();
		pb.buildRightLeg();
	}
	
	public void createPersonFromLeg(){
		System.out.println("從腳開始往上畫");
		pb.buildLeftLeg();
		pb.buildRightLeg();

		pb.buildLeftArm();
		pb.buildRightArm();
		
		pb.buildBody();
		pb.buildHead();

	}
}
