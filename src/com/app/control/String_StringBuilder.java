package com.app.control;

import java.util.Scanner; // Acceso a la libreria que contiene la clase Scanner

public class String_StringBuilder { // String es inmutable - StringBuilder es mutable

	public static void main(String[] args) {
		
		String texto = "  Luke, yo soy tu padre. "; // Instancia = new

		// M�todo length() -> Devuelve el n�mero de caracteres que tiene el texto
		// (String)
		int textSize = texto.length();
		p("Mi frase tiene " + textSize + " caracteres.");
		// M�todo toLowerCase() / toUpperCase() -> M�todos que sirven para pasar a
		// minisculas o mayusculas respectivamente
		p(texto.toUpperCase()); // Ejemplo de la inmutabilidad de String
		p(texto);
		String textoUpper = texto.toUpperCase();
		p(textoUpper);
		String textoLower = texto.toLowerCase();
		p(textoLower);

		// M�todo substring(int a, int b) -> Devuelve una subcadena comprendida entre
		// los valores pasados (Inicio "Inclusivo" - Final "Exclusivo")
		String subTexto = texto.substring(6);
		p(subTexto);
		String subTexto2 = texto.substring(6, 12);
		p(subTexto2);
		// M�todo charAt(int pos) -> Devuelve el char(caracter) que corresponde a la
		// posici�n que le damos como argumento
		char letra = texto.charAt(texto.length() - 1); // -> Todos los iterables parten de la posici�n 0(inicio) a //
														// length -1(fin)
		p(letra);

		// M�todo indexOf(String expresion) -> Nos devuelve un int que corresponde al
		// valor de la posici�n donde comienza la expresi�n buscada

		int indexPos = texto.indexOf("Darth Vader"); // Al no encontrar coincidencia con la busqueda nos devuelve -1
		p(indexPos);

		// M�todo replace(String c1, String c2) sustituye c1 por c2
		String textoRemplazado = texto.replace("Luke", "Mark");
		p(textoRemplazado);
		String textoRemplazadoChar = textoRemplazado.replace('o', 'a');
		textoRemplazadoChar = textoRemplazadoChar.replace('u', 'i');
		p(textoRemplazadoChar);
		textoRemplazado = texto.replace(texto.substring(6, 8), "tu");
		p(textoRemplazado);

		// M�todo startWith(String s1)/endsWith(String s2) NOs devuelve true/false
		// despues de comprobar si el texto empieza o termina
		// con el argumento que le pasemos
		p(texto.startsWith("Luke"));
		p(texto.endsWith("Luke"));
		// M�todo trim() nos quita espacios al principio y al final
		p(texto.trim());
		// System.out.println(texto.replace("yo","nosotros").toUpperCase().trim().substring(2));
		p(texto.startsWith("Luke"));

		// M�todo concat(String s) concatena el texto original con el nuevo texto
		// (argumento)
		p(texto.concat("Y adem�s eres muy feo."));

		// M�todo isEmpty() nos dice si la cadena de caracteres esta vacia
		p(texto.isEmpty());
		String textoVacio = "";
		p(""+textoVacio.isEmpty());

		Scanner sc = new Scanner(System.in); // Instancia de la clase que permite entrada por teclado
		String nuevaFrase = sc.nextLine();
		// M�todo isBlank() nos dice si el texto esta en blanco
		p(nuevaFrase.isBlank());
		p(nuevaFrase.isEmpty());
		// M�todo equals(String textoParaComparar) compara el texto original con el texto que le pasamos por argumento
		p(nuevaFrase.equals(texto.trim())); // (5 == 8)
		// M�todo repeat(int count) repetimos el texto concatenandolo el n�mero de veces que le digamos por argumento
		p(nuevaFrase.repeat(10));
		// M�todo strip() similar a trim pero reconoce m�s espacios en blanco
		p(nuevaFrase.trim());
		p(nuevaFrase.strip());
		
		
		// STRINGBUILDER
		//StringBuilder sbTexto2 = new StringBuilder("Que la fuerza te acompa�e");
		
		StringBuilder sbTexto = new StringBuilder(sc.nextLine());
		p(sbTexto);
		// M�todo append(Dato nombreDato) a�ade al final de nuestro String el argumento que le pasemos (Concatena).
		sbTexto.append(" fin.");
		p(sbTexto);
		// M�todo insert(int pos, Dato nombreDato) introduce en la posici�n especificada el dato que le pasamos
		p(sbTexto.insert(4, "algoNuevo"));
		// M�todo replace(int posInicial, int posFinal, String nuevoTexto) similar al replace de String
		// pero en este caso intercambia por posici�n en lugar de por valor 
		p(sbTexto.replace(4,13,"Remplazo"));
		// M�todo delete(int posInicial, int posFinal) elimina el contenido del rango de posiciones indicado
		p(sbTexto.delete(4,13));
		// M�todo reverse() invierte el orden de nuestro texto
		p(sbTexto.reverse());
		

		// compareTo(StringBuilder sb2) compara los dos stringbuilder lexicograficamente
		StringBuilder sb = new StringBuilder("Frase uno");
		StringBuilder sb2 = new StringBuilder("Frase una");
		p(sb.compareTo(sb2));
		 
		
	}

	// [MODIFICADOR DE ACCESO][TIPO DE DEVOLUCI�N][NOMBRE][()][{ BLOQUE DE
	// INSTRUCCIONES }]
	public static void p(String text) {
		// Instrucciones
		System.out.println(text);
	}
	public static void p(boolean text) {
		// Instrucciones
		System.out.println(text);
	}
	public static void p(StringBuilder text) {
		// Instrucciones
		System.out.println(text);
	}
	public static void p(int text) {
		// Instrucciones
		System.out.println(text);
	}
}
