
import java.util.List;
import java.util.Scanner;
/**
 * @decs This is the main class. It handle the interval range and 
 * print out the prime numbers  
 * @author EssamAlmutair
 * @date May 24/17 
 */
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Generator generator = new Generator(); 
		
		
		System.out.println("please enter first number in the range");
		Scanner scan = new Scanner(System.in);
		
		// Read first number in the interval 
		int start_val = scan.nextInt();
		System.out.println("please enter last number in the range");
		// Read last number in the interval
		int end_val = scan.nextInt();
	
		// Generate all numbers between start and end and get back primary number only
		List<Integer>list=generator.generate(start_val, end_val);
		//Testing 
		System.out.println("prime numbers in the range between "+start_val+" and "+end_val +" are "+list);
		
	}

}
