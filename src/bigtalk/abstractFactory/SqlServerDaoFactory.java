package bigtalk.abstractFactory;
/**
 * 用來建立存取sql server資料的各種dao
 * @author Yan
 *
 */
public class SqlServerDaoFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new SqlServerUserDao();
	}

	@Override
	public IDeptDao createDeptDao() {
		return new SqlServerDeptDao();
	}

}
