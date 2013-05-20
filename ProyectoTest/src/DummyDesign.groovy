/* 
 * Crear un proyecto en dicha tecnología (o bien una categoría que englobe las clases que van a participar en el proyecto)
 * Crear una clase DummyDesign, con un método integranteX (donde X es el número de integrante ordenado por orden alfabético). El método debe devolver X (el número). Ejemplo: el integrante 3 crea el proyecto, crea la clase DummyDesign, genera el método integrante3 que devuelve 3.
 * Crear una clase test TestDummyDesign, con un método testIntegranteX que verifica que X es lo que devuelve un objeto DummyDesign cuando se le envía el mensaje integranteX.
Correr el test y verificar que da verde.

Subir el proyecto/categoría a un repositorio de versionado de fuentes (Smalltalkhub, Git, SVN, CVS, etc.)
Dar permisos de escritura a los otros integrantes del grupo y a los docentes que corrigen (este paso también depende del repositorio que usen, comuníquense con el docente para que les provea usuario de xp-dev o googlecode, etc.) Es importante que los repositorios no sean públicos por motivos obvios.
Un segundo integrante debe bajar el proyecto en su máquina local, agregar a la misma clase DummyDesign un método integranteY que devuelve Y y el posterior test que prueba que Y es lo que devuelve el mensaje integranteY a un objeto DummyDesign. Llamar al test con el nombre testIntegranteY.
Ese segundo integrante debe subir al repositorio su parte.
Lo mismo con el resto de los integrantes del grupo. Esta tarea puede paralelizarse para ver cómo se manejan los conflictos (mergeando el código resultante).
Una vez completado el proceso la clase DummyDesign debe tener un método por cada integrante y un test por cada integrante.
Se debe generar un tag (o concepto similar) en el repositorio, indicando que esa es una versión estable de la entrega.
Se debe avisar por mail a los docentes.
El docente verificará en el historial del repositorio que todos hayan trabajado siguiendo la metodología propuesta.
 *
 */



class DummyDesign {

	
	def integrante4()
	{
		return 4
	}

}
