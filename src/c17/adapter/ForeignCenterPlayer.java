package c17.adapter;

public class ForeignCenterPlayer {
	private String name;
	
	public ForeignCenterPlayer(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	/**
	 * 字尾C表示只能聽懂中文
	 */
	public void attackC(){
		System.out.println(name + " 上去投藍");
	}
	
	/**
	 * 字尾C表示只能聽懂中文
	 */
	public void defenseC(){
		System.out.println(name + " 把他擋下");
	}
}
