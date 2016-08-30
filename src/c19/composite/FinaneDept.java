package c19.composite;

public class FinaneDept extends Company {	
	public FinaneDept(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
		
	}

	@Override
	public void remove(Company c) {
		
	}

	@Override
	public void display(int depth) {
		for(int i = 0 ; i < depth ; i++){
			System.out.print('-');
		}
		System.out.println(name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name +  " 製造公司很賺錢的假像");
	}

}
