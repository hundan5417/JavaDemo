package hibernate.users;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UsersTest {
	private static Logger logger = Logger.getLogger(UsersTest.class);
	private Session session = null;
	private SessionFactory sessionFactory = null;

	/*
	 * ��ȡsession
	 * 
	 * @return
	 */
	public Session getsession() {
		// ��ȡ�����ļ�������sessionFactory����
		sessionFactory = new Configuration().configure().buildSessionFactory();
		// ����session����
		session = sessionFactory.openSession();
		return session;

	}

	// �ر�session
	public void closeSession() {
		if (session != null)
			session.close();
		if (sessionFactory != null)
			sessionFactory.close();
	}

	/*
	 * ��������
	 * 
	 * @param users
	 * 
	 * @return
	 * 
	 */
	public Long insert(Users users) {
		session = getsession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		Long id = (Long) session.save(users);// �����
		transaction.commit();
		return id;
	}

	/*
	 * ��������
	 * 
	 * @param users
	 * 
	 * 
	 */
	public void update(Users users) {
		session = getsession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		session.update(users);
		transaction.commit();
		closeSession();
	}

	/*
	 * ɾ��������
	 * 
	 * @param users
	 * 
	 * 
	 */
	public void delete(Users users) {
		session = getsession();
		Transaction transaction = session.beginTransaction();// ��ʼ����
		session.delete(users);
		transaction.commit();
		closeSession();
	}

	/*
	 * ��ȡһ������
	 * 
	 * @param users
	 * 
	 * @return
	 */
	public Users getUserById(Long id) {
		session = getsession();
		Users users = session.get(Users.class, id);
		closeSession();
		return users;
	}

	/*
	 * ��ȡ�б�
	 * 
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Users> getUsersList() {
		session = getsession();
		// List<Users> users = session.createQuery("from Users").list();�ɰ淽��
		List<Users> usersList = session.createQuery("from Users").getResultList();
		closeSession();
		return usersList;
	}

	public static void main(String[] args) {
		UsersTest test = new UsersTest();
		//Long userId = test.insert(new Users(null,"jack11","jack11"));
		//logger.info(userId);
		//logger.info(test.getUserById(userId));

	    test.update(new Users(6L,"tom11","tom11"));
		Users users = new Users();
		users.setId(6L);
		test.delete(users);
		logger.info(test.getUserById(5L));

		List<Users> userList = test.getUsersList();
		for (Users users1 : userList) {
			logger.info(users1);

		}
	}

}
