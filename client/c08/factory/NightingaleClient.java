package c08.factory;

import c08.factory.IFactory;
import c08.factory.Nightingale;
import c08.factory.SimpleFactory;
import c08.factory.VolunteerFactory;

/**
 * 南丁格爾老人服務團-客戶端(工廠模式)
 * @author Yan
 *
 */
public class NightingaleClient {
	public static void main(String[] args) {
		// 大學生跑去幫助老人，使用simple factory
		undergraduateDoHelp();
		
		// 社區義工幫助老人，使用factory
		volunteerDoHelp();
	}
	
	/**
	 * 使用Factory，優點是當有新的物件類別，或是需要修改現有類別產生方式時，不用修改到Factory
	 */
	private static void volunteerDoHelp() {
		IFactory factory = new VolunteerFactory();
		Nightingale volunteer = factory.CreateNightingale();
		volunteer.buyRice();
	}


	/**
	 * 使用simple factory產生幫助老人的物件，如果要修改產生物件的方法，需要修改simple factory程式碼
	 */
	public static void undergraduateDoHelp(){
		Nightingale student = SimpleFactory.CreatNightingale("undergraduate");
		System.out.println("社區大學生幫助老人：");
		student.buyRice();
		student.sweep();
		student.wash();
		
	}
}
