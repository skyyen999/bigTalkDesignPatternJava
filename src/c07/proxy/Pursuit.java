package c07.proxy;

/**
 * 
 * 追求者類別，實做各種送禮物行為
 *
 */
public class Pursuit implements IGiveGift{
	private SchoolGirl mm;
	public String name;
	
	
	public Pursuit(String name){
		this.name = name;
	}
	
	@Override
	public void giveDolls() {
		System.out.println(this.name + " 送洋娃娃給 " + mm.name);
	}

	@Override
	public void giveFlowers() {
		System.out.println(this.name + " 送鮮花給 " + mm.name);		
	}

	@Override
	public void giveChocolate() {
		System.out.println(this.name + " 送巧克力給 " + mm.name);
	}

	// 要送禮物給哪個女學生
	public void setSchoolGirl(SchoolGirl mm){
		this.mm = mm;
	}
	
	public SchoolGirl getSchoolGirl(){
		return this.mm;
	}
}
