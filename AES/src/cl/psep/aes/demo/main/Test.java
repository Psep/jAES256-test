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
	}
}
