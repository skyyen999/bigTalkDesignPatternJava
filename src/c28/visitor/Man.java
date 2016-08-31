package c28.visitor;

public class Man implements Person {

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}

}
