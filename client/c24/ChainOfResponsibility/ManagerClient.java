package c24.ChainOfResponsibility;
/**
 * 公司請假，加薪簽核-客戶端
 * @author Yan
 *
 */
public class ManagerClient {

	
	public static void main(String[] args) {
		Manager pm = new CommonManager("PM經理");
		Manager gl = new Majordomo("總監");
		Manager gm = new GeneralManager("總經理");
		
		// 設定上級，可隨實際需求更改
		pm.setSuperior(gl);
		gl.setSuperior(gm);
		
		ApplyRequest request = new ApplyRequest();
		request.setRequestType("請假");
		request.setRequestContent("小菜請假");
		request.setRequestCount(2);
		pm.apply(request);
		
		request.setRequestCount(4);
		pm.apply(request);

		request.setRequestType("加薪");
		request.setRequestContent("小菜加薪");
		request.setRequestCount(2000);
		pm.apply(request);

		request.setRequestCount(900);
		pm.apply(request);


	}

}
