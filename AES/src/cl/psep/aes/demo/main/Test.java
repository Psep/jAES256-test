package cl.psep.aes.demo.main;

import java.util.ArrayList;
import java.util.Iterator;

import cl.psep.aes.demo.util.AESDemo;

public class Test {

	public static void main(String[] args) throws Exception {
		AESDemo d = new AESDemo();

		System.out.println("Encrypted string: " + d.encrypt("Hello"));
		String encryptedText = d.encrypt("Hello");
		System.out.println("Decrypted string: " + d.decrypt(encryptedText));
		
		Prueba prueba = new Prueba();
		prueba.uno = 1;
		prueba.dos = 2;
		prueba.tres= "tres !!!";
		
		ArrayList<Object> lista = new ArrayList<Object>();
		lista.add(prueba);
		lista.add("Esto es un mensaje");
		lista.add(123);
		
		Iterator<Object> iter = lista.iterator();
		
		while (iter.hasNext()) {
			Object object = (Object) iter.next();
			Class<? extends Object> clase = object.getClass();
			
			System.out.println(clase.getName());
		}
	}
}

class Prueba {
	public int uno;
	public Integer dos;
	public String tres;
}
