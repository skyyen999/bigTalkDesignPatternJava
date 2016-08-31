package c27.interpreter;
/**
 * 音符
 * @author Yan
 *
 */
public class Note extends Expression {

	@Override
	public void excute(String playKey, String playValue) {
		String node = "";
		switch(playKey){
			// key = C，演奏1(do)
			case "C": node = "1" ; break;
			// key = D，演奏2(ri)		
			case "D": node = "2" ; break; 

			case "E": node = "3" ; break; 

			case "F": node = "4" ; break; 

			case "G": node = "5" ; break; 

			case "A": node = "6" ; break; 

			case "B": node = "7" ; break; 

		}
		System.out.print(node+" ");
	}

}
