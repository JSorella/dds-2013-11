
import static junit.framework.Assert.*

import org.junit.Before 
import org.junit.Test

//.... si les dice que no encuentra @Before y el @Test, es porque deben tener la librería del Junit 3.
// El junit 4 está instalado.... hagan click derecho en Proyecto > Build Path > Library ... y ahí está para elegir

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