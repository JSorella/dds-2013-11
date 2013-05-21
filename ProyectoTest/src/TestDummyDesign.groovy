
import static junit.framework.Assert.*

import org.junit.Before 
import org.junit.Test

class TestDummyDesign extends GroovyTestCase {

	def integrante
	
	@Before
	void setUp () {
	  integrante = new DummyDesign()
	}
	
	@Test
	void testIntegrante2() {
		//Verifica que integrante2 devuelva 2
	  assertEquals(2, integrante.integrante2())
	}
	
	@Test
	void testIntegrante4() {
	  ///¿será igual a cuatro? :o
	  assertEquals(4, integrante.integrante4())
	}
	
}