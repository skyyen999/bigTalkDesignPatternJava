package c15.abstractFactory;

/**
 * 定義存取table方法的UserDao介面
 * @author Yan
 *
 */
public interface IFactory {
	/**
	 * 取得存取資料庫user資料的DAO
	 * @return
	 */
	IUserDao createUserDao();
	
	/**
	 * 取得存取資料庫dept資料的DAO
	 * @return
	 */
	IDeptDao createDeptDao();
}
