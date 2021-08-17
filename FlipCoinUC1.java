import java.util.Scanner;

public class FlipCoinUC1 {

	public static void main(String[] args) {
		int head = 0, tail = 0, i=0;
			try (Scanner scan = new Scanner(System.in)) {
				System.out.println("how many times you want to flip coin");
				int Times = scan.nextInt();
				while (i < Times){
					int flip = (int) Math.floor(Math.random() *10) % 2;
						if (flip == 1) {
							System.out.println("head");
							head++;
						}
						else { 
							System.out.println("tail");
							tail++;
						}
						i++;
				}
					
					
					int headpercent=(head*100/Times);
					int tailpercent=(tail*100/Times);
					System.out.println("headpercent= " +headpercent);
					System.out.println("tailpercent= " +tailpercent);
			}
			
	}
}
