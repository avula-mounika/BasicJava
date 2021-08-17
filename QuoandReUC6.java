import java.util.Scanner;

public class QuoandReUC6 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter a dividend ");   
			int dividend=scan.nextInt();
		try (Scanner scans = new Scanner(System.in)) {
			System.out.println("Enter a divisor ");   
			int divisor=scan.nextInt();
			int quotient = dividend / divisor;
		    int remainder = dividend % divisor;

		    System.out.println("Quotient = " + quotient);
		    System.out.println("Remainder = " + remainder);
			}
		}
	}

}
