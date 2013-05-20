/* 
 * Crear un proyecto en dicha tecnolog�a (o bien una categor�a que englobe las clases que van a participar en el proyecto)
 * Crear una clase DummyDesign, con un m�todo integranteX (donde X es el n�mero de integrante ordenado por orden alfab�tico). El m�todo debe devolver X (el n�mero). Ejemplo: el integrante 3 crea el proyecto, crea la clase DummyDesign, genera el m�todo integrante3 que devuelve 3.
 * Crear una clase test TestDummyDesign, con un m�todo testIntegranteX que verifica que X es lo que devuelve un objeto DummyDesign cuando se le env�a el mensaje integranteX.
Correr el test y verificar que da verde.

Subir el proyecto/categor�a a un repositorio de versionado de fuentes (Smalltalkhub, Git, SVN, CVS, etc.)
Dar permisos de escritura a los otros integrantes del grupo y a los docentes que corrigen (este paso tambi�n depende del repositorio que usen, comun�quense con el docente para que les provea usuario de xp-dev o googlecode, etc.) Es importante que los repositorios no sean p�blicos por motivos obvios.
Un segundo integrante debe bajar el proyecto en su m�quina local, agregar a la misma clase DummyDesign un m�todo integranteY que devuelve Y y el posterior test que prueba que Y es lo que devuelve el mensaje integranteY a un objeto DummyDesign. Llamar al test con el nombre testIntegranteY.
Ese segundo integrante debe subir al repositorio su parte.
Lo mismo con el resto de los integrantes del grupo. Esta tarea puede paralelizarse para ver c�mo se manejan los conflictos (mergeando el c�digo resultante).
Una vez completado el proceso la clase DummyDesign debe tener un m�todo por cada integrante y un test por cada integrante.
Se debe generar un tag (o concepto similar) en el repositorio, indicando que esa es una versi�n estable de la entrega.
Se debe avisar por mail a los docentes.
El docente verificar� en el historial del repositorio que todos hayan trabajado siguiendo la metodolog�a propuesta.
 *
 */



class DummyDesign {

	
	def integrante4()
	{
		return 4
	}

}
