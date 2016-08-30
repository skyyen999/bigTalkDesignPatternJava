package c16.state;

/**
 * 工作
 * @author Yan
 *
 */
public class Work {
	private int hour;				//現在時間
	private boolean finish = false; //是否完成
	private State current;          //目前狀態
	
	public Work(){
		current = new ForenoonState();
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}

	public State getState() {
		return current;
	}

	public void setState(State current) {
		this.current = current;
	}
	
	public void writeProgram(){
		current.writeProgram(this);
	}
}
