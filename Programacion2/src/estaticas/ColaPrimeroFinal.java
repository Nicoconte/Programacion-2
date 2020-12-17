package estaticas;

import apis.ColaTDA;

public class ColaPrimeroFinal implements ColaTDA {
	
	private int [] vector;
	private int indice;
		
	@Override
	public void inicializarCola() {
		vector = new int [100];
		indice = 0;
	}

	@Override
	public void acolar(int x) {
		for(int i = indice; i > 0; i--) {
			vector[i] = vector[i - 1];
		}
		
		vector[0] = x;
		indice++;
	}

	@Override
	public void desacolar() {
		indice--;
	}

	@Override
	public int primero() {
		return vector[indice - 1];
	}

	@Override
	public boolean colaVacia() {
		return indice == 0;
	}

}
