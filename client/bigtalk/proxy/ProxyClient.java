package bigtalk.proxy;

import c07.proxy.Proxy;
import c07.proxy.Pursuit;
import c07.proxy.SchoolGirl;

/**
 * 代理人幫人送禮物的客戶端程式
 * @author Yan
 *
 */
public class ProxyClient {
	public static void main(String[] args) {
		SchoolGirl girl = new SchoolGirl();
		girl.name = "校花Sarah";
		
		// 以下程式碼實現 "戴笠哥幫魯什弟"送禮物給校花Sarah"
		Pursuit ps = new Pursuit("魯什弟");
		ps.setSchoolGirl(girl);
		Proxy proxy = new Proxy(ps, "戴笠哥");
		proxy.giveChocolate();
	}
}
