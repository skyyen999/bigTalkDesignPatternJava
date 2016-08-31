package c27.interpreter;
/**
 * 音階
 * @author Yan
 *
 */
public class Scale extends Expression {

	@Override
	public void excute(String playKey, String playValue) {
		String node = "";
		switch(playValue){
			case "1": node = "低音" ; break;
			case "2": node = "中音" ; break; 
			case "3": node = "高音" ; break; 
		}
		System.out.print(node+" ");
	}

}
