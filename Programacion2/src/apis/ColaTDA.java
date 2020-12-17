package apis;

//Conte, Nicolas

public interface ColaTDA {
	
	/*
	 * @Tarea inicializarCola: inicializa la estructura cola 
	 * */
	void inicializarCola();
	
	/*
	 * @Tarea acolar: agregar un elemento 
	 * @Parametro (int x)
	 * @Condicion: la cola debe estar inicializada
	 * */
	void acolar(int x);
	
	/*
	 * @Tarea desacolar: Elimina el elemento mas antiguo agregado
	 * @Condicion: La estructura no debe estar vacia
	 * */
	void desacolar();
	
	/*
	 * @Tarea primero: Obtiene el primer elemento a eliminar
	 * @Condicion: La estructura no debe estar vacia
	 * @Retorna: numero entero
	 * */
	int primero();
	
	
	/*
	 * @Tarea colaVacia: Indica si la cola contiene elementos o no
	 * @Condicion: La estructura debe estar inicializada
	 * @Retorna: Valor booleano
	 * */
	boolean colaVacia();
	
}
