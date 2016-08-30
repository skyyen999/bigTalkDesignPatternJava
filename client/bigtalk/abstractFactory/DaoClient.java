package bigtalk.abstractFactory;

import c15.abstractFactory.Department;
import c15.abstractFactory.IDeptDao;
import c15.abstractFactory.IFactory;
import c15.abstractFactory.IUserDao;
import c15.abstractFactory.OracleDaoFactory;
import c15.abstractFactory.SqlServerDaoFactory;
import c15.abstractFactory.User;

/**
 * 工廠模式中毎一個產品都要有專門的工廠來生產<br>
 * 在抽象工廠模式中，將同族系(例如說部門-員工)的產品集中由一個工廠生產，因此抽像工廠製造的不是一種產品，而是生成一組產品
 * @author Yan
 *
 */
public class DaoClient {
	public static void main(String[] args) {
		//取得存取oracle的Dao
		IFactory factory = new OracleDaoFactory();
		IUserDao userDao = factory.createUserDao();
		IDeptDao deptDao = factory.createDeptDao();
		
		userDao.insert(new User(1,""));
		userDao.getUser(1);
		
		deptDao.insert(new Department(2,""));
		deptDao.getDept(2);
		
		System.out.println();
		
		//換成存取 sql server
		factory = new SqlServerDaoFactory();
		userDao = factory.createUserDao();
		deptDao = factory.createDeptDao();
		userDao.insert(new User(111,""));
		userDao.getUser(111);
		
		deptDao.insert(new Department(222,""));
		deptDao.getDept(222);
		
	}
}
