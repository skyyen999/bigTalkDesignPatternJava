package c16.state;
/**
 * 中午吃飯休息狀態
 * @author Yan
 *
 */
public class RestState implements State {

	@Override
	public void writeProgram(Work work) {
		System.out.println(work.getHour()+"點 !!!下班回家休息了");
	}

}
