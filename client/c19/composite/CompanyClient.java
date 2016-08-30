package c19.composite;
/**
 * 組合模式-客戶端
 * @author Yan
 *
 */
public class CompanyClient {
	public static void main(String[] args) {
		Company root = new ConcreteCompany("月球總部");
		root.add(new HRDept("總部人力資源處"));
		root.add(new FinaneDept("總部財務處"));
		
		Company mars = new ConcreteCompany("火星分部");
		mars.add(new HRDept("火星分部人力資源處"));
		mars.add(new FinaneDept("火星分部財務處"));
		root.add(mars);

		Company m1 = new ConcreteCompany("火衛1號辦事處");
		m1.add(new HRDept("火衛1號辦事處人事室"));
		m1.add(new FinaneDept("火衛1號辦事處會計室"));
		mars.add(m1);
		
		Company m2 = new ConcreteCompany("火衛2號辦事處");
		m2.add(new HRDept("火衛2號辦事處人事室"));
		m2.add(new FinaneDept("火衛2號辦事處會計室"));
		mars.add(m2);
		
		System.out.println("結構圖:");
		root.display(1);
		System.out.println("職責表");
		root.lineOfDuty();
	}
}
