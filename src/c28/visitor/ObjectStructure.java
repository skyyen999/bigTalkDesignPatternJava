package c28.visitor;

import java.util.ArrayList;
import java.util.List;

// 物件結構
public class ObjectStructure {
	private List<Person> elements = new ArrayList<>();
	/**
	 * 新增
	 * @param element
	 */
	public void attach(Person element){
		elements.add(element);
	}
	/**
	 * 移除
	 * @param element
	 */
	public void detach(Person element){
		elements.remove(element);	
	}
	/**
	 * 查看顯示
	 */
	public void display(Action visitor){
		for(Person e : elements){
			e.accept(visitor);
		}
	}
}
