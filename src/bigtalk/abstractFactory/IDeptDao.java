package bigtalk.abstractFactory;

/**
 * 定義建造UserDao的工廠介面
 * @author Yan
 *
 */
public interface IDeptDao {
	/**
	 * 插入一筆dept到資料庫
	 * @param dept
	 */
	void insert(Department dept);
	/**
	 * 使用id取出一筆dept資料
	 * @param id
	 * @return
	 */
	Department getDept(int id);
}
