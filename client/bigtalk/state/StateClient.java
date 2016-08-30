package bigtalk.state;

import c16.state.Work;

/**
 * 上班狀態-客戶端
 * @author Yan
 *
 */
public class StateClient {
	public static void main(String[] args) {
		Work emergencyProject = new Work();
		emergencyProject.setHour(9);
		emergencyProject.writeProgram();
		emergencyProject.setHour(10);
		emergencyProject.writeProgram();
		emergencyProject.setHour(11);
		emergencyProject.writeProgram();
		emergencyProject.setHour(12);
		emergencyProject.writeProgram();
		emergencyProject.setHour(15);
		emergencyProject.writeProgram();
		emergencyProject.setFinish(true);
		
		emergencyProject.setHour(18);
		emergencyProject.writeProgram();
		
		emergencyProject.setHour(19);
		emergencyProject.writeProgram();
		emergencyProject.setHour(21);
		emergencyProject.writeProgram();
		
	}
	
}
