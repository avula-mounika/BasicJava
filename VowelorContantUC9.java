import java.util.Scanner;

public class VowelorContantUC9 {

	public static void main(String[] args) {
		
	      try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a Alphabet :");
			  char alphabet = scan.next().charAt(0);
			  // If alphabet = a,e,i,o,u  then it's an vowel
			     // else its an constant
			  if(alphabet == 'a'|| alphabet == 'e'|| alphabet == 'i' || alphabet == 'o' || alphabet == 'u'){
			     System.out.println("entered alphabet is a vowel");
			  }else{
			     System.out.println("entered alphabet is a consonant");
			  }
		}

	}

}
