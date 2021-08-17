import java.util.Scanner;

public class PrimeFactorUC5 {
	 static PrimeFactorUC5 obj= new PrimeFactorUC5();

	    public static void main(String[] args) {
	    	try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Enter a Number to find Prime Factors ");   
				int number=scan.nextInt();
				System.out.println("Given Number is : " + number);
				System.out.print("Prime Factors are : " );
				        for (int i = 2; i <= number; i++) {
				 
				            while (number % i == 0) {
				                System.out.print(i + " ");
				                number = number / i;
				            }
				        }
				 
				        if (number < 1) 
				        	System.out.println(number);
			}
	    }
	}