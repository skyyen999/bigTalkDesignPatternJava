package bigtalk.factory;

/**
 * 南丁格爾服務團simple factory
 * @author Yan
 *
 */
public class SimpleFactory {
	public static Nightingale CreatNightingale(String type) {
		Nightingale nt = null;
		switch(type){
			case "undergraduate": 
				System.out.println("熱心大學生行前教育中...");
				nt = new Undergraduate();
				System.out.println("熱心大學生出發服務老人");
				break;
			case "volunteer": 
				System.out.println("社區義工訓練中...");
				nt = new Volunteer();
				System.out.println("社區義工待命中");
				break;
		}
		
		return nt;
	}
}
