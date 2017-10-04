//Mandy Woo

import java.util.Scanner;
public class ProcessingNumbers {

	public static void main(String[] args) {
		int evenSum = 0;
		int evenNum = 0;
		int max = 0;
		int min = 0;
		Scanner userInput = new Scanner(System.in);
		boolean done = false;
		boolean first = true;
		do {
			System.out.println("Input an integer: ");
			int num = userInput.nextInt();
			if(first) {
				max = num;
				min = num;
				first = false;
			}else {
				if(max < num) {
					max = num;
				}
				if(min > num) {
					min = num;
				}
			}
			if(num%2==0) {
				evenSum+=num;
				if(num>evenNum) {
					evenNum = num;
				}
			}
			System.out.println("Are we done? ");
			String finished = userInput.next();
			if(finished.equals("yes")){
				done = true;
			}
		}while(!done);
	System.out.println("Smallest num: "+min+ " Largest num: "+max);
	System.out.println("Largest even number: "+evenNum+ " Sum of even number: "+evenSum);
	}
}
