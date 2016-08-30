package c16.state;
/**
 * 中午吃飯休息狀態
 * @author Yan
 *
 */
public class AfternoonState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.getHour() < 18){
			System.out.println("下午" + work.getHour() + "點，等下班");
		} else {
			work.setState(new EveningState());
			work.writeProgram();
		}
	}

}
