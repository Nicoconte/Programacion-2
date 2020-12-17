package apis;

/*
 * @Autor: Conte, Nicolas
 * Diccionario multiple es una coleccion de pares asociados (clave, valor), las claves son unicas.
 * No puede existir clave sin valor asociado. Los valores son unicos para la misma clave
 * */

public interface DiccionarioMultipleTDA {
	
	/*
	 * @Tarea inicializarDiccionarioMultiple: Inicializa el diccionario
	 * 
	 * */
	void inicializarDiccionarioMultiple();
	
	
	/*
	 * @Tarea agregar: Agrega una elemento x a una clave, ambos datos son suministrados
	 * @Precon: El diccionario debe estar inicializado y el valor no debe existir para esa clave
	 * @param c
	 * @param x
	 * */
	void agregar(int c, int x);
	
	
	/*
	 * @Tarea eliminar: Elimina una clave suministrada
	 * @Precon: La clave debe existir
	 * @param c
	 * */
	void eliminar(int c);
	
	
	/*
	 * @Tarea eliminarValor: Elimina un valor dado x asociado a una clave. Ambos datos son suministrados
	 * @Precon: Tanto la clave como el valor deben existir
	 * @param c
	 * @param x
	 * */
	void eliminarValor(int c, int x);
	
	
	/*
	 * @Tarea obtener: Devuelve el conjunto de valores asociada a una clave suministrada. No elimina los valores
	 * @Precon: La clave debe existir
	 * @Param int c
	 * @return ConjuntoTDA
	 * */
	ConjuntoTDA obtener(int c);
	
	
	
	/*
	 * @Tarea Claves: Devuelve el conjunto de claves del diccionario. No elimina las claves
	 * @Precon: El diccionario debe estar inicializado 
	 * */
	ConjuntoTDA claves();
	
}
