import java.util.Scanner;

public class EvenorOddUC8 {

	public static void main(String[] args) {
		int num;
	    //The input provided by user is stored in num
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter an Integer number:");
			num = scan.nextInt();
	    // If number is divisible by 2 then it's an even number
	     // else odd number
	    if ( num % 2 == 0 )
	        System.out.println(+num +" is a even number");
	     else
	        System.out.println(+num +" is a odd number");
	    }
	}
}
