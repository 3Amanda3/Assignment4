

/**
 * @author a.schepp
 * Mr.Hardman
 * November 15
 * program to print numbers from 1-100 and print fizz on multiples of 3 and buzz on multiples of 5.
 *
 */
public class FizzBuzz {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
	
		
		for (int i = 1; i <= 100; i++){
	        
			if (i % 15 == 0){
				System.out.println("FizzBuzz");
			}
			
	        else if (i % 5 == 0){
	        	System.out.println("Buzz");
	        }
			
	        else if (i % 3 == 0){
	        	System.out.println("Fizz");
	        }
			
	        else{
	        	System.out.println(i);
	        }	
		}	
	}
}
	
