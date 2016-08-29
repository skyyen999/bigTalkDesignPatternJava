package bigtalk.abstractFactory;

/**
 * 存取oracle資料庫user資料的dao
 * @author Yan
 *
 */
public class OracleUserDao implements IUserDao {

	@Override
	public void insert(User user) {
		System.out.println("在oracle資料庫插入一筆user");
	}

	@Override
	public User getUser(int id) {
		User user = new User(id,"");
		System.out.println("oracle資料庫取出Id為 " + id + " 的user");
		return user;
	}

}
