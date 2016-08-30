package c17.adapter;

public class CenterPlayer extends Player{

	public CenterPlayer(String name) {
		super(name);
	}

	@Override
	public void attack() {
		System.out.println(name + " gogogo shot");
	}

	@Override
	public void defense() {
		System.out.println(name + " try stop him");	
	}

}
