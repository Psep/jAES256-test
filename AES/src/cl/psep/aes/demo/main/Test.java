package cl.psep.aes.demo.main;


import cl.psep.aes.demo.util.AESDemo;

public class Test {

	public static void main(String[] args) throws Exception {
		AESDemo d = new AESDemo();

		String encryptedText = d.encrypt("Hello");
		System.out.println("Encrypted string: " + encryptedText);
		System.out.println("Decrypted string: " + d.decrypt(encryptedText));
	}
}
