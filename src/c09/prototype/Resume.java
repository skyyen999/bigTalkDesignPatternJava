package c09.prototype;

/**
 * 履歷
 * @author Yan
 *
 */
public class Resume implements Cloneable{
	private String name;
	private String age;
	private String education;
	private WorkExperience work;
	
	
	public Resume(String name){
		this.name = name;
		work = new WorkExperience();
	}
	
	private Resume(WorkExperience work) throws CloneNotSupportedException{
		this.work = (WorkExperience) work.clone();
	}
	
	public void setProfile(String age, String education){
		this.age = age;
		this.education = education;
	}
	
	public void setWorkExperience(String workDate, String company){
		work.setWorkDate(workDate);
		work.setCompany(company);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// 直接使用 super.clone()，不會得到新的 WorkExperinece實體
		Resume clone = new Resume(this.work);
		clone.name = this.name;
		clone.age = this.age;
		clone.education = this.education;
		return clone;
	}
	
	
	public void display(){
		System.out.printf("%s %s %s \n", name,education,age);
		System.out.printf("工作經歷: %s %s \n", work.getWorkDate(), work.getCompany());
	}
}


/**
 * 履歷中的工作經驗
 * @author Yan
 *
 */
class WorkExperience  implements Cloneable {
	private String workDate;
	private String company;
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getWorkDate() {
		return workDate;
	}
	public void setWorkDate(String workDate) {
		this.workDate = workDate;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
