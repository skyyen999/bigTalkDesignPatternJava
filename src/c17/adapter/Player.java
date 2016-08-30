package c17.adapter;

public abstract class Player {
	protected String name;
	public Player(){
		
	}
	
	public Player(String name){
		this.name = name;
	}
	
	public abstract void attack();
	public abstract void defense();
}
