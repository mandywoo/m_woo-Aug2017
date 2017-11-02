import java.util.Arrays;

//Mandy Woo
public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		//num doesn't change
		System.out.println(num);
		//string doesn't change
		System.out.println(strMain);
		//prints changed to array
		System.out.println(Arrays.toString(arrMain));

		//intA changes, intB doesn't
		int intA = 0;
		int intB = intA;
		intA = 1;
		System.out.println(intA + " " + intB);
		
		//strA changes, strB doesn't
		String strA = "Hello";
		String strB = strA;
		strA = "World";
		System.out.println(strA + " " + strB);
		
		//both arrA and arrB change
		int[] arrA = {1};
		int[] arrB = arrA;
		arrA[0] = 4;
		System.out.println(Arrays.toString(arrA) + " " + Arrays.toString(arrB));
	}
	public static void changeMe(int x, String str, int[] arr) {
		x += 1;
		str += "2";
		arr[3]++;
	}
}

