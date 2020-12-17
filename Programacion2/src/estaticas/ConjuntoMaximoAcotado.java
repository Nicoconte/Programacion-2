package estaticas;

import java.util.Random;

import apis.ConjuntoTDA;

public class ConjuntoMaximoAcotado implements ConjuntoTDA {
	
	private int [] vector;
	private int indice;
	private Random posAzar;
	private final int posINF = 0;
	
	@Override
	public void inicializarConjunto() {
		vector = new int[100];
		indice = 0;
		posAzar = new Random(System.currentTimeMillis());
	}

	@Override
	public void agregar(int x) {
		vector[indice] = x;
		indice++;
	}

	@Override
	public void sacar(int x) {
		int i = indice - 1;
		
		while(vector[i] != x) {
			i--;
		}
		
		vector[indice] = vector[indice - 1];
		indice--;
	}

	@Override
	public int elegir() {
		int i = posAzar.nextInt(indice - 1 - posINF + 1) + posINF;
		return vector[i];
	}

	@Override
	public boolean conjuntoVacio() {
		return indice == 0;
	}

	@Override
	public boolean pertenece(int x) {
		int i = 0;
		
		while(i < indice && vector[i] != x) {
			i++;
		}
		
		return i < indice;
	}

}
