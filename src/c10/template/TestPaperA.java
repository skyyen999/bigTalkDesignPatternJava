package c10.template;

public class TestPaperA extends TestPaper{

	@Override
	protected String answerA() {
		return "b";
	}

	@Override
	protected String answerB() {
		return "d";
	}

	@Override
	protected String answerC() {
		return "c";
	}
}
