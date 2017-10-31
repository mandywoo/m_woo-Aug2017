import java.util.Arrays;

//Mandy Woo
public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);

		//Part 2
		//When you change numA, numB does not change
		int numA = 2;
		int numB = numA;
		numA = 3;
		System.out.println(numB +" "+numA);
		
		//When you change strA, strB does not change
		String strA = "Hello";
		String strB = strA;
		strA = "World";
		System.out.println(strB+" "+strA);
		
		//When you change arrA, arrB changes to the value of arrA
		int[] arrA = {9};
		int[] arrB = arrA;
		arrA[0] = 1;
		System.out.println(Arrays.toString(arrB) +" "+ Arrays.toString(arrA));
		
	}
	//The values in the main method do not change because this method only changes the references of the objects in the 
	//main method
	public static void changeMe(int x, String str, int[] arr) {
		x += 1;
		str += "2";
		arr[3]++;
	}
}

