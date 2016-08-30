package c06.decorator;
/**
 * 一開始還沒裝扮的人
 * @author Yan
 *
 */
public class Person {
	private String name;
	public Person(){
		
	}
	
	public Person(String name){
		this.name = name;
	}
	
	public void show(){
		System.out.println("裝扮的" + name);
	}
}
