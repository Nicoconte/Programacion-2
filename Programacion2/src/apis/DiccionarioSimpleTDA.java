package apis;

//Conte, Nicolas

public interface DiccionarioSimpleTDA {
	
	/*
	 *@Tarea inicializarDiccionariosSimple: inicializa la estructura diccionarios simple 
	 * */
	void inicializarDiccionariosSimple();
	
	/*
	 * @Tarea agregar: permite agregar un elemento x a una clave suministrada
	 * @Precon: El diccionario debe estar inicializado y no debe existir la clave
	 * @param c
	 * @param x 
	 * */
	void agregar(int c, int x);
	
	
	/*
	 *@Tarea eliminar: Permite eliminar una clave suministrada
	 *@Precon: La clave debe existir
	 *@param c
	 * */
	void eliminar(int c);
	
	
	/*
	 * @Tarea obtener: Devuelve el valor asociada a una clave suministrada. No elimina el valor
	 * @Precon: La clave debe existir
	 * @return int
	 * */
	int obtener(int c);
	
	/*
	 *@Tarea claves: Devuelve un conjunto de claves del diccionario. No elimina las claves 
	 *@Precon: El diccionario debe estar inicializado
	 *@return ConjuntoTDA
	 * */
	ConjuntoTDA claves();
}
