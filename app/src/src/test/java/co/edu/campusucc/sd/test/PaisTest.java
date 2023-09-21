package co.edu.campusucc.sd.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.campusucc.sd.daos.PaisDAO;
import co.edu.campusucc.sd.modelo.Pais;

class PaisTest {

	@Test
	final void testPersist() {
		PaisDAO dao = new PaisDAO();
		Pais o = new Pais();
		
		o.setIdPais("CR");
		o.setNombre("COSTA RICA");
		o.setGentilicioNacional("TICO");
		
		try {
			dao.persist(o);
			assertTrue(true);
		} catch (Exception e) {
			fail(e.toString());
		}
	}

	@Test
	final void testDelete() {
		assertTrue(true);
	}

	@Test
	final void testMerge() {
		assertTrue(true);
	}

	@Test
	final void testFindById() {
		assertTrue(true);
	}

}
