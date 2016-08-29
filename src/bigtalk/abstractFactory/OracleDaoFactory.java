package bigtalk.abstractFactory;
/**
 * 用來建立存取sql server資料的各種dao
 * @author Yan
 *
 */
public class OracleDaoFactory implements IFactory{

	@Override
	public IUserDao createUserDao() {
		return new OracleUserDao();
	}

	@Override
	public IDeptDao createDeptDao() {
		return new OracleDeptDao();
	}

}
