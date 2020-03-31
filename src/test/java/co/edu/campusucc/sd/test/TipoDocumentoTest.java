package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.modelo.TipoDocumento;

class TipoDocumentoTest {
	private static final Logger logger = Logger.getLogger(TipoDocumentoTest.class.getName());

	@Test
	void testPersist() {
		SessionFactory factory;

		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			fail("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}

		TipoDocumento o = new TipoDocumento();

		o.setIdTipoDocumento("C1");
		o.setNombreDocumento("Cedula "+new Date().getTime());

		
		Transaction tx = null;
		try {
			logger.log(Level.INFO, "persisting TipoDocumento instance");
			Session session = factory.openSession();
			tx = session.beginTransaction();
			session.save(o);
			tx.commit();
			logger.log(Level.INFO, "persist successful");
			assertTrue(true);
		} catch (Exception e) {
			fail(e.toString());
		}

	}

}
