import java.util.Scanner;

public class QuadraticClient {

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		boolean finished = false;
		while (!finished) {
			System.out.println("Provide values for coefficients a, b, and c.");
			System.out.println("a: ");
			double a = userInput.nextDouble();
			System.out.println("b: ");
			double b = userInput.nextDouble();
			System.out.println("c: ");
			double c = userInput.nextDouble();
			String str = Quadratic.quadrDescriber(a, b, c);
			System.out.println(str);
			System.out.println("Do you want to keep going? (Type \"quit\" to end)");
			String quit = userInput.next();
			if (quit.charAt(0)==('q')) {
				finished = true;
			}

		}
	}

}
