package bigtalk.state;
/**
 * 中午吃飯休息狀態
 * @author Yan
 *
 */
public class NoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 13){
			System.out.println("中午" + work.getHour() + "點，吃飯吃飯");
		} else {
			work.setState(new AfternoonState());
			work.writeProgram();
		}
	}

}
