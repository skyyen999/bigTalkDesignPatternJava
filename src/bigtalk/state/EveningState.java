package bigtalk.state;
/**
 * 中午吃飯休息狀態
 * @author Yan
 *
 */
public class EveningState implements State {

	@Override
	public void writeProgram(Work work) {
		if(work.isFinish()){
			work.setState(new RestState());
			work.writeProgram();
		} else if(work.getHour() < 21){
			System.out.println(work.getHour() + "點，加班中，哭哭");
		} else {
			System.out.println(work.getHour() + "點，警位伯伯要關門下班了");
			work.setState(new RestState());
			work.writeProgram();
		}
	}

}
