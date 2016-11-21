import java.util.Scanner;

/**
 * 
 */

/**
 * @author a.schepp
 * Mr.Hardman
 * code to learn how much you would weigh on different planets.
 * November 14
 */
public class WeightPlanet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);

		double userWeight;
		String planet;
		double spaceWeight;
		                                                       
		
		
		System.out.println("Please enter your weight");
		userWeight = userInput.nextDouble();
		
		
		System.out.println("Please enter the celestial body you want to see how much you weigh on!");
		planet = userInput.next();
		
		
		
		if(planet.equalsIgnoreCase("mercury")){
			spaceWeight = userWeight *0.38;
			System.out.println("You weigh, " +spaceWeight+ " On Mercury");
		}
		
		else if(planet.equalsIgnoreCase("venus")){
			spaceWeight = userWeight *0.91;
			System.out.println("You weigh, " +spaceWeight+ " On Venus");
		}
		
		else if(planet.equalsIgnoreCase("earth")){
			System.out.println("I believe your on Earth right now so your weight remains the same.");
		}
		
		else if(planet.equalsIgnoreCase("moon")){
			spaceWeight = userWeight *0.165;
			System.out.println("You weigh, " +spaceWeight+ " On the Moon");
		}
		
		else if(planet.equalsIgnoreCase("mars")){
			spaceWeight = userWeight *0.38;
			System.out.println("You weigh, " +spaceWeight+  " On Mars");
		}
		
		else if(planet.equalsIgnoreCase("jupiter")){
			spaceWeight = userWeight *2.34;
			System.out.println("You weigh, " +spaceWeight+ " On Jupiter");
		}
		
		else if(planet.equalsIgnoreCase("saturn")){
			spaceWeight = userWeight *1.06;
			System.out.println("You weigh, " +spaceWeight+ " On Saturn");
		}
		
		else if(planet.equalsIgnoreCase("uranus")){
			spaceWeight = userWeight *0.92;
			System.out.println("You weigh, " +spaceWeight+ " On Uranus");
		}
			
		else if(planet.equalsIgnoreCase("neptune")){
			spaceWeight = userWeight *1.19;
			System.out.println("You weigh, " +spaceWeight+ " On Neptune");
		}
		
		else if(planet.equalsIgnoreCase("Pluto")){
			spaceWeight = userWeight *0.06;
			System.out.println("You weigh, " +spaceWeight+ " On Pluto");
		}
		
		else if(planet.equalsIgnoreCase("Sun")){
			System.out.println("On the sun you would weigh nothing, because you would be burnt dust.");
		}

		else{
			System.out.println("Please check your spelling of your chosen celestial body");
		}
		userInput.close();
	}
}
			
			
			
	
		