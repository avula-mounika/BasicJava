import java.util.Scanner;

public class PowersofTwoUC3 {

	public static void main(String[] args) {
		int x=0 ;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter number : ");
			int number= scan.nextInt();

			if (x < number) {
			for(double i=1; i<= number;i++) {
				System.out.println((int)Math.pow(2,i));	
			}
			}
			else
				System.out.println("number is overflow");
		}
		
	}

}
