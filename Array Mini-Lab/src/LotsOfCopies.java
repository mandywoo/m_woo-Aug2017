import java.util.Arrays;

//Mandy Woo
public class LotsOfCopies {

	public static void main(String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5};
		changeMe(num, strMain, arrMain);
		//num doesn't change
		System.out.println("In Main, num: " + num);
		//string doesn't change
		System.out.println("In Main, str: " + strMain);
		//prints changed to array
		System.out.println("In Main, arr: " + Arrays.toString(arrMain));

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
		//part 1
		System.out.println("In changeMe , before the change, num(aka a): " + x);
		x += 1;
		System.out.println("In changeMe , after the change, num(aka a): " + x);
		
		System.out.println("In changeMe , before the change, strMain(aka str): " + str);
		str += "2";
		System.out.println("In changeMe , after the change, strMain(aka str): " + str);
		
		System.out.println("In changeMe , before the change, arrMain(aka arr): " + Arrays.toString(arr));
		arr[3]++;
		System.out.println("In changeMe , after the change, arrMain(aka arr): " + Arrays.toString(arr));
		
		//part 2
		//a- start
		//b=a
		//a == new
		//b==?
		
		//int
		//bint doesn't change
		x = 3;
		int bint = x;
		x = 23;
		System.out.println("b: " + bint);
	
		//str
		//bstr doesn't change
		str = "hhhhhh";
		String bstr = str;
		str = "iiiiiiiiii";
		System.out.println("bstr: " + bstr);
		
		//arr
		//barr changes because barr was just a name that referred to the same arr
		int[] barr = arr;
		arr[0] = 200;
		System.out.println("barr: " + Arrays.toString(barr));
		
	}
}

