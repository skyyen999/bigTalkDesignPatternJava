package c25.mediator;
/**
 * 聯合國-客戶端(中介者模式)
 * @author Yan
 *
 */
public class UniteNationsClient {

	
	public static void main(String[] args) {
		UNSC unsc = new UNSC();
		USA c1 = new USA(unsc);
		Iraq c2 = new Iraq(unsc);
		
		unsc.setCountryA(c1);
		unsc.setCountryB(c2);
		
		c1.declare("快把海珊交出來");
		c2.declare("海珊昨天被你們炸死了");
	}
}
