/**/
public class GradeEncryption {

	public static void main(String[] args) {
		char grade = 'A';
		System.out.println("Current Grade - A");
		grade = (char)(grade+8);
		System.out.println("Grade after Encryption - " + grade);

//		Decrypt
		grade = (char)(grade - 8);
		System.out.println("Grade after Decrytion - " + grade);
	}

}
