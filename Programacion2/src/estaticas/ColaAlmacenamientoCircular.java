package estaticas;

import apis.ColaTDA;

public class ColaAlmacenamientoCircular implements ColaTDA {

	private int [] vector;
	private int poner, sacar;
	
	@Override
	public void inicializarCola() {
		vector = new int[101];
		poner = sacar = 0;
	}

	@Override
	public void acolar(int x) {
		vector[poner] = x;
		poner++;
		
		if (poner == 101) {
			poner = 0;
		}
	}

	@Override
	public void desacolar() {
		sacar++;
		
		if (sacar == 101) {
			sacar = 0;
		}

	}

	@Override
	public int primero() {
		return vector[sacar];
	}

	@Override
	public boolean colaVacia() {
		return sacar == poner;
	}

}
