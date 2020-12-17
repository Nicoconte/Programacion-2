package apis;

//Conte, Nicolas

public interface ConjuntoTDA {

	/*
	 * @Tarea inicializarConjunto: Inicializa la estructura conjunto
	 * */
	void inicializarConjunto();
	
	/*
	 * @Tarea agregar: Agrega un elemento "x" suministrado
	 * @Condicion: El conjunto debe estar inicializado y el elemento no debe existir
	 * @param: "x" dato a agregar
	 * */
	void agregar(int x);
	
	/*
	 * @Tarea sacar: Elimina un elemento suministrado
	 * @Condicion: El elemento debe pertenecer al conjunto
	 * @param: "x" dato a sacar
	 * */
	void sacar(int x);
	
	/*
	 * @Tarea elegir: Devuelve un valor cualquiera del conjunto. El elemento no se elimina
	 * @Condicion: El conjunto no debe estar vacio
	 * */
	int elegir();
	
	/*
	 * @Tarea conjuntoVacion: Devuelve verdadero si el conjunto tiene elementos
	 * @Condicion: El conjunto debe estar inicializado
	 * */
	boolean conjuntoVacio();
	
	
	/*
	 * @Tarea pertenece: Devuelve verdadero si el valor "x" recibido como parametro pertenece al conjunto
	 * @Condicion: El conjunto debe estar inicializado
	 * */
	boolean pertenece(int x);
	
}
