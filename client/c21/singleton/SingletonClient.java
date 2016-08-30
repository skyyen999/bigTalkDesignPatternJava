package c21.singleton;

/**
 * singleton客戶端
 * @author Yan
 *
 */
public class SingletonClient {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if(s1 == s2){
			System.out.println("兩個是同一個物件");
		};

	}
}
