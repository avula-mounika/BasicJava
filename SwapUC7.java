import java.util.Scanner;

public class SwapUC7 {

	public static void main(String[] args) {
		int a, b, c;// x and y are to swap   
	       try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the value of X and Y");  
			   a = scan.nextInt();  
			   b = scan.nextInt();
	       System.out.println("before swapping numbers: "+a +"  "+ b);  
	       /*swapping */  
	       c = a;  
	       a = b;  
	       b = c;  
	       System.out.println("After swapping: "+a +"   " + b);  
	       System.out.println( );  	}
	}
}
