package estaticas;

import apis.ColaPrioridadTDA;

public class ColaMayorPrioridadFinal implements ColaPrioridadTDA {
	
	class Elemento {
		int x, p;
	}
	
	private Elemento [] vector;
	private int indice;
	
	@Override
	public void inicializarCola() {
		vector = new Elemento[100];
		indice = 0;
	}

	@Override
	public void acolarPrioridad(int x, int p) {
		int i = indice - 1;
		
		while (i >= 0 && p < vector[i].p) {
			vector[i + 1] = vector[i];
			i--;
		}
		
		vector[i + 1] = new Elemento();
		vector[i + 1].x = x;
		vector[i + 1].p = p;
		
		indice++;
	}

	@Override
	public void desacolar() {
		indice--;
	}

	@Override
	public int primero() {
		return vector[indice-1].x;
	}

	@Override
	public int prioridad() {
		return vector[indice-1].p;
	}

	@Override
	public boolean colaVacia() {
		return indice == 0;
	}

}
