import java.util.Scanner;

public class HarmonicUC4 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number : ");
			int num= scan.nextInt(); 
	        double result = 0.0;
	 
	        System.out.println("The harmonic series is: ");
	        for (int i = num; i > 0; i--) {
	        	result = result + (double)1 / i;
	            System.out.print(result + ", ");
	        }
		}
	}
}
