package c07.proxy;

public class Proxy implements IGiveGift{
	private SchoolGirl mm;		 //收禮物的女學生
	private Pursuit orgPursuit;  //被代理的人
	private String  name;        //代理人的姓名 
	
	/**
	 * 
	 * @param ps 被代理的人
	 * @param proxyName 代理人的姓名 
	 */
	public Proxy(Pursuit ps, String proxyName){
		this.orgPursuit = ps;
		this.name = proxyName;
		this.mm = ps.getSchoolGirl();
	}
	
	@Override
	public void giveDolls() {
		System.out.println(this.name + " 幫 " + orgPursuit.name + " 送洋娃娃給 " + mm.name);
	}

	@Override
	public void giveFlowers() {
		System.out.println(this.name + " 幫 " + orgPursuit.name + " 送鮮花給 " + mm.name);
	}

	@Override
	public void giveChocolate() {
		System.out.println(this.name + " 幫 " + orgPursuit.name + " 送巧克力給 " + mm.name);
	}
}
