package co.edu.campusucc.sd.daos;
// Generated 16/03/2020 09:12:18 PM by Hibernate Tools 5.4.7.Final

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InitialContext;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;

import co.edu.campusucc.sd.modelo.TipoCliente;

/**
 * Home object for domain model class TipoCliente.
 * @see co.edu.campusucc.sd.modelo.TipoCliente
 * @author Hibernate Tools
 */
public class TipoClienteHome {

	private static final Logger logger = Logger.getLogger(TipoClienteHome.class.getName());

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext().lookup("SessionFactory");
		} catch (Exception e) {
			logger.log(Level.SEVERE, "Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException("Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(TipoCliente transientInstance) {
		logger.log(Level.INFO, "persisting TipoCliente instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			logger.log(Level.INFO, "persist successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "persist failed", re);
			throw re;
		}
	}

	public void attachDirty(TipoCliente instance) {
		logger.log(Level.INFO, "attaching dirty TipoCliente instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void attachClean(TipoCliente instance) {
		logger.log(Level.INFO, "attaching clean TipoCliente instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			logger.log(Level.INFO, "attach successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "attach failed", re);
			throw re;
		}
	}

	public void delete(TipoCliente persistentInstance) {
		logger.log(Level.INFO, "deleting TipoCliente instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			logger.log(Level.INFO, "delete successful");
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "delete failed", re);
			throw re;
		}
	}

	public TipoCliente merge(TipoCliente detachedInstance) {
		logger.log(Level.INFO, "merging TipoCliente instance");
		try {
			TipoCliente result = (TipoCliente) sessionFactory.getCurrentSession().merge(detachedInstance);
			logger.log(Level.INFO, "merge successful");
			return result;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "merge failed", re);
			throw re;
		}
	}

	public TipoCliente findById(java.lang.String id) {
		logger.log(Level.INFO, "getting TipoCliente instance with id: " + id);
		try {
			TipoCliente instance = (TipoCliente) sessionFactory.getCurrentSession()
					.get("co.edu.campusucc.sd.modelo.TipoCliente", id);
			if (instance == null) {
				logger.log(Level.INFO, "get successful, no instance found");
			} else {
				logger.log(Level.INFO, "get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "get failed", re);
			throw re;
		}
	}

	public List findByExample(TipoCliente instance) {
		logger.log(Level.INFO, "finding TipoCliente instance by example");
		try {
			List results = sessionFactory.getCurrentSession().createCriteria("co.edu.campusucc.sd.modelo.TipoCliente")
					.add(Example.create(instance)).list();
			logger.log(Level.INFO, "find by example successful, result size: " + results.size());
			return results;
		} catch (RuntimeException re) {
			logger.log(Level.SEVERE, "find by example failed", re);
			throw re;
		}
	}
}
