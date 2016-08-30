package c26.flywight;

import java.util.HashMap;

/**
 * 網站工廠
 * @author Yan
 *
 */
public class WebSiteFactory {
	private HashMap<String,ConcreteWebsite> flyweights = new HashMap<>();
	/**
	 * 取得網站分類
	 * @param key
	 * @return
	 */
	public Website getWebsiteCategory(String key){
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new ConcreteWebsite(key));
		}
		
		return flyweights.get(key);
	}
	
	/**
	 * 或得目前網站分類數
	 * @return
	 */
	public int getWebsiteCount(){
		return flyweights.size();
	}

}
