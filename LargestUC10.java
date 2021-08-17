import java.util.Scanner;

public class LargestUC10 {

	public static void main(String[] args) {
		int a,b,c;
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter an first number:");
			a = scan.nextInt();
			System.out.println("Enter an second number:");
			b = scan.nextInt();
			System.out.println("Enter an third number:");
			c = scan.nextInt();
		if(a>=b && a>=c)
			System.out.println(a+ " is the largest number");
		else if(b>=a && b>=c)
			System.out.println(b+ " is the largest number");
		else
			System.out.println(c+ " is the largest number");
		}
	}
}
