
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
	void testIntegrante4() {
	  ///¿será igual a cuatro? :o
	  assertEquals(4, integrante.integrante4())
	}
	
}