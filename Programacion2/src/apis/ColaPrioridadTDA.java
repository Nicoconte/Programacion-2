package apis;

//Conte, Nicolas

public interface ColaPrioridadTDA {
	
	/*
	 * @Tarea inicializa la estructura cola
	 * */
	void inicializarCola();
	
	/*
	 * @Tarea acolarPrioridad: Agrega un elemento "x" con prioridad "p", ambos datos son suministrados
	 * @Condicion: La estructura debe estar inicializada
	 * */
	void acolarPrioridad(int x, int p);
	
	
	/*
	 * @Tarea desacolar: Elimina el elemento con mayor prioridad. 
	 * @Condicion: La estructura no debe estar vacia
	 * */
	void desacolar();
	
	
	/*
	 * @Tarea primero: Obtiene el valor del dato de mayor prioridad. El valor no se elimina
	 * @Condicion: La estructura no debe estar vacia
	 * */
	int primero();
	
	
	/*
	 * @Tarea prioridad: Obtiene la prioridad del valor del dato de mayor prioridad
	 * @Condicion: La estructura no debe estar vacia
	 * */
	int prioridad();
	
	
	/*
	 * @Tarea colaVacia: Indica si la cola contiene elementos o no
	 * @Condicion: La estructura debe estar inicializada
	 * */
	boolean colaVacia();
	
	
	
}
