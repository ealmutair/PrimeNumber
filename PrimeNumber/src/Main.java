/*
 * Essam Almutair
 * May 24
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generator generator = new Generator(); 
		
		
		System.out.println("please enter numbers");
		Scanner scan = new Scanner(System.in);
		// Read first and last number in the interval 
		int start_val = scan.nextInt();
		int end_val = scan.nextInt();
	
		// Generate all numbers between start and end and get back primary number only
		generator.generate(start_val, end_val);
		//Testing 
		//System.out.println();
		
	}

}
