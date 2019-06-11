package Cesar;

public class Main {

	public static void main(String[] args) {
		
		
		Cesar cesar = new Cesar();
		
		cesar.readEncryptedFile("src/encrypt.txt");
		cesar.writeDecryptedFile( "src/encrypt.txt","src/decrypted.txt");

		

	}

}
