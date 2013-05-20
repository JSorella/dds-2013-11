
import static junit.framework.Assert.*

//import junit.framework.Before .... no se que onda, no encuentro esto del @Before y el @Test
import junit.framework.Test

class TestDummyDesign extends GroovyTestCase {

	def integrante = new DummyDesign()
	
	
	void testIntegrante4() {
	  ///¿será igual a cuatro? :o
	  assertEquals(4, integrante.integrante4())
	}
	
}