package estaticas;

import apis.PilaTDA;

public class PilaTopeInicio implements PilaTDA {

	private int [] vector;
	private int indice;
	
	@Override
	public void inicializarPila() {
		vector = new int[100];
		indice = 0;
	}

	@Override
	public void apilar(int x) {
		for(int i = indice; i > 0; i--) {
			vector[i] = vector[i-1];
		}
		
		vector[0] = x;
		indice++;
	}

	@Override
	public void desapilar() {
		for(int i = 0; i < indice - 1; i++) {
			vector[i] = vector[i + 1];
		}
		
		indice--;

	}

	@Override
	public int tope() {
		return vector[0];
	}

	@Override
	public boolean pilaVacia() {
		return indice == 0;
	}

}
