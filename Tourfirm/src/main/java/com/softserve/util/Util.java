package com.softserve.util;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.softserve.domain.City;
import com.softserve.domain.Client;
import com.softserve.domain.Hotel;
import com.softserve.domain.Visa;

public class Util {

	/** The sesion factory. */
	private static SessionFactory sesionFactory;

	/** The config file location. */
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";

	/** The Constant threadLocal. */
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();

	/** The Constant cfg. */
	private static final Configuration cfg = new Configuration();

	/** The session factory. */
	private static org.hibernate.SessionFactory sessionFactory;

	/**
	 * Current session.
	 *
	 * @return the session
	 * @throws HibernateException
	 *             the hibernate exception
	 */
	public static Session currentSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		if (session == null) {
			if (sessionFactory == null) {
				try {
					cfg.configure(CONFIG_FILE_LOCATION);
					sessionFactory = cfg.addAnnotatedClass(Client.class).addAnnotatedClass(Visa.class).
							addAnnotatedClass(Hotel.class).addAnnotatedClass(City.class).
							buildSessionFactory();
				} catch (Exception e) {
					System.err.println("Error Creating SessionFactory");
					e.printStackTrace();
				}
			}
			session = sessionFactory.openSession();
			threadLocal.set(session);
		}
		return session;
	}

	/**
	 * Close session.
	 *
	 * @throws HibernateException the hibernate exception
	 */
	public static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null) {
			session.close();
		}
	}

}
