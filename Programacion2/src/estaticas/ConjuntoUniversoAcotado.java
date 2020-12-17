package estaticas;

import apis.ConjuntoTDA;

public class ConjuntoUniversoAcotado implements ConjuntoTDA {
	
	private boolean [] vector;
	private int indice;
	private final int cotaInf = 5;
	private final int cotaSup = 9;
	
	@Override
	public void inicializarConjunto() {
		vector = new boolean[cotaSup - cotaInf + 1];
		indice = 0;
		for(int i = 0; i < cotaSup - cotaInf + 1; i++) {
			vector[i] = false;
		}
	}

	@Override
	public void agregar(int x) {
		vector[x - cotaInf] = true;
		indice++;
	}

	@Override
	public void sacar(int x) {
		vector[x - cotaInf] = false;
		indice--;
	}

	@Override
	public int elegir() {
		int i = 0;
		 while(!vector[i]) {
			 i++;
		 }
		 
		return i + cotaInf;
	}

	@Override
	public boolean conjuntoVacio() {
		return indice == 0;
	}

	@Override
	public boolean pertenece(int x) {
		//TODO: Implementar metodo
		return false;
	}

}
