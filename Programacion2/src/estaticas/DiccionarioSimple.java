package estaticas;

import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;

public class DiccionarioSimple implements DiccionarioSimpleTDA {
	
	/*
	 *  Diccionario = (clave, valor)
	 * */
	class Diccionario {
		int clave, valor;
	}
	
	private Diccionario [] vector;
	private int indice;
	
	@Override
	public void inicializarDiccionariosSimple() {
		vector = new Diccionario[100];
		indice = 0;
	}

	@Override
	public void agregar(int c, int x) {
		vector[indice] = new Diccionario();
		vector[indice].clave = c;
		vector[indice].valor = x;
		indice++;
	}

	@Override
	public void eliminar(int c) {
		int i = indice - 1;
		while(vector[i].clave != c) {
			i--;
		}
		
		vector[i] = vector[i];
		indice--;
	}

	@Override
	public int obtener(int c) {
		int i = indice - 1;
		while(vector[i].clave != c) {
			i--;
		}
		return vector[i].valor;
	}

	@Override
	public ConjuntoTDA claves() {
		ConjuntoTDA conjunto = new ConjuntoMaximoAcotado();
		conjunto.inicializarConjunto();
		int i = indice - 1;
		
		while(0 < i) {
			conjunto.agregar(vector[i].clave);
			i--;
		}
		return conjunto;
	}

}
