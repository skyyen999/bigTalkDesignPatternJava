package c19.composite;

public class HRDept extends Company {	
	public HRDept(String name) {
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
		System.out.println(name +  " 招騙新鮮的肝");
	}

}
