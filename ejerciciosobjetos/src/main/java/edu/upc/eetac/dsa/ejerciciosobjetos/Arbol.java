package edu.upc.eetac.dsa.ejerciciosobjetos;

public class Arbol {
	public String s;

	public Arbol(int i) {
		s = "Un árbol de " + i + " metros";
	}

	public Arbol() {
		s = "Un árbol genérico";
	}

	public Arbol(String string) {
		s = "Un " + string;
	}

	public Arbol(int i, String string) {
		s = "Un " + string + " de " + i + " metros";
	}
	
	public void escriu() {
		System.out.println(s);
	}
	

}
