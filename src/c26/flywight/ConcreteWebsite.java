package c26.flywight;
/**
 * 實體網站
 * @author Yan
 *
 */
public class ConcreteWebsite implements Website {
	private String name ;
	public ConcreteWebsite(String name) {
		this.name = name;
	}
	@Override
	public void use(User user) {
		System.out.println("網站分類：" + name + " 用戶："+user.getName());
	}

}
