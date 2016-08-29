package bigtalk.abstractFactory;

/**
 * sql server資料庫存取dept資料表的Dao
 * @author Yan
 *
 */
public class SqlServerDeptDao implements IDeptDao {

	@Override
	public void insert(Department dept) {
		System.out.println("在sql server資料庫插入一筆dept");
	}

	@Override
	public Department getDept(int id) {
		Department dept = new Department(id,"");
		System.out.println("sql server資料庫取出Id為 " + id + " 的dept");
		return dept;
	}

}
