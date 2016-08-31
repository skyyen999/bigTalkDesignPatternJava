package c26.flyweight;

import c26.flywight.User;
import c26.flywight.WebSiteFactory;
import c26.flywight.Website;

/**
 * 網站服務-客戶端
 * @author Yan
 *
 */
public class WebsiteClient {

	public static void main(String[] args) {
		WebSiteFactory f = new WebSiteFactory();
		
		//產品展示網站有兩個，但是他們其實只是共用一個物件
		Website pd = f.getWebsiteCategory("產品展示");
		pd.use(new User("小菜"));
		Website pd2 = f.getWebsiteCategory("產品展示");
		pd2.use(new User("大鳥"));
		Website blog = f.getWebsiteCategory("部落格");
		blog.use(new User("部落客"));
		Website ts = f.getWebsiteCategory("教學網站");
		ts.use(new User("陳老師"));

		System.out.println("目前共有" + f.getWebsiteCount() + "種網站");
	}
}
