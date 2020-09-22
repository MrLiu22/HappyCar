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
			System.out.println("���ݿ����ӳɹ���");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("���ݿ����Ӵ���");
		}

		String URL = "jdbc:sqlserver://localhost:1433;DatabaseName=Lejia";

		Connection conn = null; // userName�������ݿ���û�����sa,
		try {
			conn = DriverManager.getConnection(URL, "sa", "sql2008");
			System.out.println("���ݿ����ӳɹ���");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print("���ݿ����Ӵ���");
		}
		return conn;

	}

	// ��ȡ���ݿ����п�����Ϣ
	public static List<LeJia> getKaoQin() throws SQLException {

		String sql = "select * from KaoQin order by date";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<LeJia> list = qr
				.query(conn, sql, new BeanListHandler(LeJia.class));

		DbUtils.closeQuietly(conn);

		return list;

	}

	// ���ӿ�����Ϣ
	public static void addKaoQin(String courseName, String studyTime,
			String date, String states) throws SQLException {

		Connection conn = getConnect();

		// �����ݿ��User�����һ����¼
		String sql = "insert into KaoQin (courseName,studyTime,date,states) values (?,?,?,?) ";

		// ʵ����QueryRunner����
		QueryRunner qr = new QueryRunner();
		// ִ��SQL���
		qr.update(conn, sql, courseName, studyTime, date, states);

		// �ر�����
		DbUtils.closeQuietly(conn);
	}

	// �����û���Ϣ
	public static void addUser(String userName, String password,
			String repassword, String email, String phoneNum, String educa,
			String hobby, String sex) throws SQLException {

		Connection conn = getConnect();

		// �����ݿ��User�����һ����¼
		String sql = "insert into UserInfo (userName,password,repassword,email,phoneNum,educa,hobby,sex) values (?,?,?,?,?,?,?,?) ";

		// ʵ����QueryRunner����
		QueryRunner qr = new QueryRunner();
		// ִ��SQL���
		qr.update(conn, sql, userName, password, repassword, email, phoneNum,
				educa, hobby, sex);

		// �ر�����
		DbUtils.closeQuietly(conn);
	}

	// ���û����������ѯ List ���Ͻӿ�
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

	// ���û�����ѯ List ���Ͻӿ�
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

	// ��ѯ�������� List ���Ͻӿ�
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

	// ��ѧϰʱ����ѯ List ���Ͻӿ�
	public static List<LeJia> getKaoQinByStudyTime(String studyTime) throws SQLException {
		String sql = "select * from KaoQin where studyTime = ?";

		Connection conn = LeJiaService.getConnect();

		QueryRunner qr = new QueryRunner();

		List<LeJia> list = qr.query(conn, sql, new BeanListHandler(LeJia.class),studyTime);

		DbUtils.closeQuietly(conn);

		return list;

	}
	
	//�޸��û���Ϣ
		public static void updateUserInfo(String userName1,String password1,String repassword1,
				String email1,String phoneNum1,String educa1,String hobby1,String sex1,String userName) throws SQLException 
		{
			

			Connection conn = getConnect();


			String sql = " update UserInfo set userName = ? , password = ? , repassword = ? , email= ? , phoneNum= ? , educa = ? , hobby = ? , sex= ? where userName = ? ";
					
					

			// ʵ����QueryRunner����
			QueryRunner qr = new QueryRunner();

			//ִ��SQL���
			qr.update(conn, sql,userName1, password1, repassword1,
					 email1, phoneNum1, educa1, hobby1, sex1, userName);
			
			//�ر�����
			DbUtils.closeQuietly(conn);
			
		}
		
		//ɾ���û���Ϣ
				public static void deleteUserInfo(String date1) throws SQLException 
				{
					

					Connection conn = getConnect();


					String sql = " delete from KaoQin where date = ? ";

					// ʵ����QueryRunner����
					QueryRunner qr = new QueryRunner();

					//ִ��SQL���
					qr.update(conn, sql,date1);
					
					//�ر�����
					DbUtils.closeQuietly(conn);
					
				}

}
