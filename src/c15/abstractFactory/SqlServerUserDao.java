package c15.abstractFactory;
/**
 * 存取sql server資料庫user資料的dao
 * @author Yan
 *
 */
public class SqlServerUserDao implements IUserDao {

	@Override
	public void insert(User user) {
		System.out.println("在sql server資料庫插入一筆user");
	}

	@Override
	public User getUser(int id) {
		User user = new User(id,"");
		System.out.println("sql server資料庫取出Id為 " + id + " 的user");
		return user;
	}

}
