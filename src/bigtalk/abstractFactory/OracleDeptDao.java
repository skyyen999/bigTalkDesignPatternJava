package bigtalk.abstractFactory;


/**
 * oracle資料庫存取dept資料表的Dao
 * @author Yan
 *
 */
public class OracleDeptDao implements IDeptDao {

	@Override
	public void insert(Department dept) {
		System.out.println("在oracle資料庫插入一筆dept");
	}

	@Override
	public Department getDept(int id) {
		Department user = new Department(id,"");
		System.out.println("oracle資料庫取出Id為 " + id + " 的Department");
		return user;
	}

}
