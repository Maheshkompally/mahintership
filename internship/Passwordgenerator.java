  package internship;
  import java.security.SecureRandom;

public class Passwordgenerator {
	public static void main(String[] args) {
		int length=10;
		String password=generatepassword(length);
		System.out.println("Generated password:" + password);
	}
	public static String generatepassword(int length) {
		String lower="abcdefghijklmnopqrstuvwxyz";
		String upper="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String num="1234567890";
		String symbols= "!@#$%^&*()_+{}";
		String allchars=lower+upper+num+symbols;
		SecureRandom random=new SecureRandom();
		StringBuilder password=new StringBuilder();
		for (int i=0; i< length;i++) {
			int randomIndex=random.nextInt(allchars.length());
			password.append(allchars.charAt(randomIndex));
		}
	return password.toString();	
	}
}


