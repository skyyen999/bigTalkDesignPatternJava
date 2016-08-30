package c15.abstractFactory;

/**
 * 定義建造UserDao的工廠介面
 * @author Yan
 *
 */
public interface IUserDao {
	/**
	 * 插入一筆user到資料庫
	 * @param user
	 */
	void insert(User user);
	/**
	 * 使用id取出一筆user資料
	 * @param id
	 * @return
	 */
	User getUser(int id);
}
