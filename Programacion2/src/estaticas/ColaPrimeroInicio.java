package estaticas;

import apis.ColaTDA;

public class ColaPrimeroInicio implements ColaTDA {
	
	private int [] vector;
	private int indice;
	
	@Override
	public void inicializarCola() {
		vector = new int [100];
		indice = 0;
	}

	@Override
	public void acolar(int x) {
		vector[indice] = x;
		indice++;
	}

	@Override
	public void desacolar() {
		for(int i = 0; i < indice - 1; i++) {
			vector[i] = vector[i + 1];
		}
		
		indice--;
	}

	@Override
	public int primero() {
		return vector[0];
	}

	@Override
	public boolean colaVacia() {
		return indice == 0;
	}

}
