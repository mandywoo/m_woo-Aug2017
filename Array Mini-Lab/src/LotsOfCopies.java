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

	}
	public static void changeMe(int x, String str, int[] arr) {
		x += 1;
		str += "2";
		arr[3]++;
	}
	
}

