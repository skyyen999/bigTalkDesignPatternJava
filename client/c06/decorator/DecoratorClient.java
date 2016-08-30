package c06.decorator;
/**
 * 裝飾模式-客戶端
 * @author Yan
 *
 */
public class DecoratorClient {
	public static void main(String[] args) {
		Person xc = new Person("小菜");
		
		
		Finery sneakers = new Sneakers();
		Finery trouser = new Trouser();
		Finery tShirts = new TShirts();

		sneakers.decorate(xc);
		trouser.decorate(sneakers);
		tShirts.decorate(trouser);
		tShirts.show();
	}
}
