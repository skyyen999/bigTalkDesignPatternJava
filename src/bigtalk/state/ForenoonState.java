package bigtalk.state;
/**
 * 早上上班狀態
 * @author Yan
 *
 */
public class ForenoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 12){
			System.out.println("早上" + work.getHour() + "點，工作很有精神");
		} else {
			work.setState(new NoonState());
			work.writeProgram();
		}
	}

}
