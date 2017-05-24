import java.util.ArrayList;
import java.util.List;

/**
 * @decs this class will generate specific range of numbers based on the user input,
 * then find all the prime numbers in this range.
 * Generator implement the inteface PrimeNumberGenerator methods(generate(),isPrime()). 
 * @author EssamAlmutair
 * @date May 24/17 
 *
 */

public class Generator implements PrimeNumberGenerator {

	//Implementation of the interface method
	public boolean isPrime(int value) {
		//skip 0,1,2 and even numbers>2
		 if ( value > 2 && value%2 == 0 ) {
		      //  System.out.println(value + " is not prime");
		        return false;
		    }
		 
		    int temp = (int)Math.sqrt(value) + 1;
		    
		    for(int i = 3; i < temp; i+=2){
		        if(value % i == 0){
		        //    System.out.println(value + " is not prime");
		            return false;
		        }
		    }
		    //System.out.println(value + " is prime");
		    return true; 
	}//end of method

	//Implementation of the interface method to generate numbers
	public List<Integer> generate(int startingValue, int endingValue) {
		
		// list to save all the prime numbers
		List<Integer>list= new ArrayList<Integer>();
		
		boolean value= true;
		//for inverse range
		if(startingValue>= endingValue){
			
			for(int i=startingValue;i>=endingValue;i--){
				value = isPrime(i);// call isPrime to check if number is prime 
				if(value==true){
					list.add(i);
				}// end if
			}//end for loop
			
		}else{//for normal range
					for(int i=startingValue;i<=endingValue;i++){
				value =isPrime(i);// call isPrime to check if number is prime
				if(value==true){
					list.add(i);
				}//end if 
			}//end of for
		}//end else
		return list;
	
	}//end method
}//end of class
