package c06.decorator;
/**
 * 打扮-客戶端(裝飾模式)
 * @author Yan
 *
 */
public class DecoratorClient {
	public static void main(String[] args) {
		Person xc = new Person("小菜");
		
		
		Finery sneakers = new Sneakers();
		sneakers.decorate(xc);
		
		Finery trouser = new Trouser(sneakers);
		Finery tShirts = new TShirts(trouser);


		//trouser.decorate(sneakers);
		//tShirts.decorate(trouser);
		tShirts.show();
	}
}
