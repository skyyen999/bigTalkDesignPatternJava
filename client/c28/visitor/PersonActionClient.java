package c28.visitor;
/**
 * 男人女人對比-客戶端(拜訪者模式)
 * @author Yan
 *
 */
public class PersonActionClient {
	public static void main(String[] args) {
		ObjectStructure os = new ObjectStructure();
		os.attach(new Man());
		os.attach(new Woman());
		
		Action success = new Success();
		os.display(success);;
		
		Action failure = new Failing();
		os.display(failure);;
	}
}
