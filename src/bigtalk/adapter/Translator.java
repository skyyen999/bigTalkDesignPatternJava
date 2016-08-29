package bigtalk.adapter;

public class Translator extends Player{
	private ForeignCenterPlayer wjzf;
	
	public Translator(String name) {
		wjzf = new ForeignCenterPlayer(name);
	}

	@Override
	public void attack() {
		System.out.print(wjzf.getName() + " gogogo shot");
		System.out.print("->" );
		wjzf.attackC();
	}

	@Override
	public void defense() {
		System.out.print(wjzf.getName() + " try stop him");	
		System.out.print("->" );

		wjzf.defenseC();
	}

}
