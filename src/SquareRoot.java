import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 *Mr. HardMan
 *program to find the square root of a number
 *Nov 14
 */
public class SquareRoot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);

		double Unum;
		double SqNum;
		
		
		do{
			
			System.out.println("Please enter a positive number");
			Unum = userInput.nextDouble();
		
		if (Unum > 0){
			SqNum = Math.sqrt(Unum);
			
			System.out.println(Unum+ " has a square root of " +SqNum+ "!");
		}
		
		else if(Unum < 0){
			System.out.println("That is not a positive number.");
			
			}
		
		} while ( Unum < 0);
			userInput.close();
	}
}