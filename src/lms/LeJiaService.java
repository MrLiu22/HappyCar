package lms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class LeJiaService {

	public static Connection getConnect() {

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("数据库连接成功！");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("数据库连接错误！");
		}

		String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=Lejia";

		Connection conn = null; // userName是你数据库的用户名如sa,
		try {
			conn = DriverManager.getConnection(URL, "sa", "sql2008");
			System.out.println("数据库连接成功！");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("数据库连接错误！");
		}
		return conn;

	}

	// 获取数据库所有考勤信息
	public static List<LeJia> getKaoQin() throws SQLException {

		String sql = "select * from KaoQin order by date";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<LeJia> list = qr
				.query(conn, sql, new BeanListHandler(LeJia.class));

		DbUtils.closeQuietly(conn);

		return list;

	}

	// 增加考勤信息
	public static void addKaoQin(String courseName, String studyTime,
			String date, String states) throws SQLException {

		Connection conn = getConnect();

		// 在数据库表User中添加一条记录
		String sql = "insert into KaoQin (courseName,studyTime,date,states) values (?,?,?,?) ";

		// 实例化QueryRunner对象
		QueryRunner qr = new QueryRunner();
		// 执行SQL语句
		qr.update(conn, sql, courseName, studyTime, date, states);

		// 关闭连接
		DbUtils.closeQuietly(conn);
	}

	// 增加用户信息
	public static void addUser(String userName, String password,
			String repassword, String email, String phoneNum, String educa,
			String hobby, String sex) throws SQLException {

		Connection conn = getConnect();

		// 在数据库表User中添加一条记录
		String sql = "insert into UserInfo (userName,password,repassword,email,phoneNum,educa,hobby,sex) values (?,?,?,?,?,?,?,?) ";

		// 实例化QueryRunner对象
		QueryRunner qr = new QueryRunner();
		// 执行SQL语句
		qr.update(conn, sql, userName, password, repassword, email, phoneNum,
				educa, hobby, sex);

		// 关闭连接
		DbUtils.closeQuietly(conn);
	}

	// 按用户名、密码查询 List 集合接口
	public static List<UserInfo> getPasswordByUserName(String userName,
			String password) throws SQLException {
		String sql = "select * from UserInfo where userName = ? and password = ?";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<UserInfo> list = qr.query(conn, sql, new BeanListHandler(
				UserInfo.class), userName, password);

		DbUtils.closeQuietly(conn);

		return list;

	}

	// 按用户名查询 List 集合接口
	public static List<UserInfo> getAllByUserName(String userName)
			throws SQLException {
		String sql = "select * from UserInfo where userName = ?";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<UserInfo> list = qr.query(conn, sql, new BeanListHandler(
				UserInfo.class), userName);

		DbUtils.closeQuietly(conn);

		return list;

	}

	// 查询考勤数据 List 集合接口
	public static List<LeJia> getQueryByCourseName(String key)
			throws SQLException {
		key = "%" + key + "%";

		String sql = "select * from KaoQin where courseName like ? ";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<LeJia> list = qr.query(conn, sql,
				new BeanListHandler(LeJia.class), key);

		DbUtils.closeQuietly(conn);

		return list;

	}

	// 按学习时长查询 List 集合接口
	public static List<LeJia> getKaoQinByStudyTime(String studyTime) throws SQLException {
		String sql = "select * from KaoQin where studyTime = ?";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<LeJia> list = qr.query(conn, sql, new BeanListHandler(LeJia.class),studyTime);

		DbUtils.closeQuietly(conn);

		return list;

	}
	
	//修改用户信息
		public static void updateUserInfo(String userName1,String password1,String repassword1,
				String email1,String phoneNum1,String educa1,String hobby1,String sex1,String userName) throws SQLException 
		{
			

			Connection conn = getConnect();


			String sql = " update UserInfo set userName = ? , password = ? , repassword = ? , email= ? , phoneNum= ? , educa = ? , hobby = ? , sex= ? where userName = ? ";
					
					

			// 实例化QueryRunner对象
			QueryRunner qr = new QueryRunner();

			//执行SQL语句
			qr.update(conn, sql,userName1, password1, repassword1,
					 email1, phoneNum1, educa1, hobby1, sex1, userName);
			
			//关闭连接
			DbUtils.closeQuietly(conn);
			
		}
		
		//删除用户信息
				public static void deleteUserInfo(String date1) throws SQLException 
				{
					

					Connection conn = getConnect();


					String sql = " delete from KaoQin where date = ? ";

					// 实例化QueryRunner对象
					QueryRunner qr = new QueryRunner();

					//执行SQL语句
					qr.update(conn, sql,date1);
					
					//关闭连接
					DbUtils.closeQuietly(conn);
					
				}

}
