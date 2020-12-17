package estaticas;

import apis.ConjuntoTDA;
import apis.DiccionarioMultipleTDA;

public class DiccionarioMultiple implements DiccionarioMultipleTDA {
	
	
	class Diccionario {
		int clave;
		int posLibre;
		int [] valores;
	}
	
	private Diccionario [] listaClaves;
	private int indiceClaves;
	
	@Override
	public void inicializarDiccionarioMultiple() {
		listaClaves = new Diccionario[100];
		indiceClaves = 0;
	}

	@Override
	public void agregar(int c, int x) {
		
	}

	@Override
	public void eliminar(int c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarValor(int c, int x) {
		// TODO Auto-generated method stub

	}

	@Override
	public ConjuntoTDA obtener(int c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ConjuntoTDA claves() {
		// TODO Auto-generated method stub
		return null;
	}

}
