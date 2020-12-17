package apis;

//Conte, Nicolas

public interface PilaTDA {
	
	/**
	 * @Tarea inicializarPila: inicializa la estructura de la pila
	 * */
	void inicializarPila();
	
	/**
	 * @Tarea Apilar: Agrega un elemento
	 * @Precondicion: la pila debe estar inicializada
	 * */
	void apilar(int x);
	
	/**
	 * @Tarea Desapilar: elimina el ultimo elemento agregado a la pila
	 * @Precondicion: la pila debe estar inicializada y no vacia
	 * */
	void desapilar();
	
	/* *
	 * @Tarea Tope: obtiene el valor del ultimo elemento ingresado a la pila
	 * @Precondicion: la pila debe estar inicializada y no vacia
	 * */
	int tope();
	
	/**
	 * @Tarea pilaVacia: indica si la pila contiene elementos o no
	 * @Precondicion: la pila debe estar inicializada 
	 * */
	boolean pilaVacia();
	
	
}
