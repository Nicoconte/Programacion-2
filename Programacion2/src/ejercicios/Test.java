package ejercicios;

import apis.*;
import estaticas.*;

public class Test {

	public static void main(String[] args) {
		
		DiccionarioSimpleTDA dic = new DiccionarioSimple();
		dic.inicializarDiccionariosSimple();
		
		dic.agregar(1, 64);
		//dic.agregar(3, 543);
		
		if (!dic.claves().pertenece(3)) {
			dic.agregar(21, 421312);

			System.out.println("Valor => " + dic.obtener(21));
			
			System.out.println("Claves => " + dic.claves().elegir());
			
			System.out.println("Eliminado");
			dic.eliminar(21);
			System.out.println("Pos eliminacion");
			
			System.out.println("Claves actualizadas => " + dic.claves());
						
		} else {
		
			System.out.println("La clave ya esta dentro");
		
		}
		
		
		

	}

}
