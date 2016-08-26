package bigtalk.prototype;
/**
 * 履歷-客戶端 
 * @author Yan
 *
 */
public class ResumeClient {
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("Yan");
		resume.setProfile("31", "master");
		resume.setWorkExperience("2016-2019", "FOYA");
	
		// 履歷表2跟1有許多相似的地方，因此直接複製履歷表1做修改
		Resume resume2  = (Resume) resume.clone();
		resume2.setWorkExperience("2011-2016", "IISI");
		
		// 履歷表3跟1有許多相似的地方，因此直接複製履歷表1做修改
		Resume resume3  = (Resume) resume.clone();
		resume3.setProfile("21", "bachelor");
		resume3.setWorkExperience("2005-2011", "TMD");
		
		resume.display();
		resume2.display();
		resume3.display();

	}
}
