
/*Mandy Woo
 * 
 * Pseudocode
 * QuadraticClient:
 * Import Declaration before header
 * Main Method
 * Do, while loop(not quit)
 * Initialize scanner
 * Take in input values(a,b,c) for quadratic formula
 * Put input values in quadrDesciber method
 * Print output
 * Prompt: Do you want to keep going? (Type "quit" to end)
 * 
 * Quadratic:
 * main method
 * quadrDescriber method
 * standard form method
 * direction it open: check if a is negative or positive
 * axis of symmetry: complete the square
 * vertex: complete the square
 * x - intercept(s): quadForm method, then calculate 
 * y- intercept: c
 * add all to String
 * return String
 */


import java.util.*;
public class QuadraticClient {

	public static void main(String[] args) {
		//initialize scanner
		Scanner userInput = new Scanner(System.in);
		boolean finished = false;
		while (!finished) {
			System.out.println("Provide values for coefficients a, b, and c.");
			//get input value for a 
			System.out.print("a: ");
			double a = userInput.nextDouble();
			//get user input value for b
			System.out.print("b: ");
			double b = userInput.nextDouble();
			//get user input value for c
			System.out.print("c: ");
			double c = userInput.nextDouble();
			//get and print quadrDescriber info on graph
			String quadInfo = Quadratic.quadrDescriber(a, b, c);
			System.out.println(quadInfo);

			//ask user if they want to go again
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String quit = userInput.next();
			if (quit.charAt(0)==('q')) {
				finished = true;
			}
		}
	}
}
