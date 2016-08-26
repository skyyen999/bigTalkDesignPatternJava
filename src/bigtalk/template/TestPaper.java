package bigtalk.template;

/**
 * 考試卷，共用的題目先寫好做為template，其他會變動的部分交由子類別實作 
 * @author Yan
 *
 */
public abstract class TestPaper {
	/**
	 * 列印整張考卷的題目與做答結果
	 * @param question
	 * @param answer
	 */
	public void display(){
		System.out.println(answerA() + " " + QuestionA());
		System.out.println(answerB() + " " + QuestionB());
		System.out.println(answerC() + " " + QuestionC());
	};
	
	/**
	 * @return 這張考卷題目1 作答的答案
	 */
	protected abstract String answerA();
	/**
	 * @return 這張考卷題目2 作答的答案
	 */
	protected abstract String answerB();
	/**
	 * @return 這張考卷題目3作答的答案
	 */
	protected abstract String answerC();
	
	private String QuestionA(){
		return "1.楊過的玄鐵劍材質可能是[]? a.球磨鑄鐵  b.馬蹄鐵  c.高速合金鋼  d.碳纖維";
	}
	private String QuestionB(){
		return "2.情花谷的情花被剷光了會造成[]? a.使這種植物不會再害人  b.使一種稀有植物滅絕  c.破壞當地生態圈  d.造成當地沙漠化";
	}
	private String QuestionC(){
		return "3.藍鳳凰下讀使人嘔吐不止，應該用什麼藥物治療[]? a.阿斯匹靈  b.牛黃解毒片  c.大量生牛奶  d.以上皆錯";
	}
}
