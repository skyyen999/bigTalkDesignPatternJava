package c15.abstractFactory;

/**
 * table 定義的user類別
 * @author Yan
 *
 */
public class Department {
	private int id;
	private String deptName;
	
	public Department(int id, String deptName){
		this.id = id;
		this.deptName = deptName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
}
