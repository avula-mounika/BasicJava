import java.util.Scanner;

public class LeapYearUC2 {

	public static void main(String[] args) {
		int yy=0;
				try (Scanner scan = new Scanner(System.in)) {
				System.out.println("Enter year (yyyy) : ");
				yy = scan.nextInt();
				if (yy % 4 !=0)
				   System.out.println(+yy +" is not a leap year"); 
				else if (yy % 400 == 0) 
				System.out.println(+yy +" is a leap year" ); 
				else if (yy % 100 ==0)
				System.out.println( +yy +" is  not a leap year" );  
				else
				System.out.println(+yy +" is a leap year");   
			}
	}

}
