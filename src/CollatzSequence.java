import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 *Mrhardman
 *a bonus program that uses collatz sequence to make any number equal 1 eventually
 *Novemeber 15
 */
public class CollatzSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
	

		System.out.println("Please enter a number");
		userNum = userInput.nextInt();
		 
		 do{
		
			 if (userNum % 2 == 0){
				 userNum=userNum / 2;
				 System.out.println(userNum);
			 }
		 
			 else{
				 userNum = userNum * 3 + 1;
				 System.out.println(userNum);
			 }
			
		
		 }	 while(userNum != 1);
		 		userInput.close();
	}
}

