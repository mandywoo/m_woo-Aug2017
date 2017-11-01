//Mandy Woo
import java.util.Arrays;

public class ArraysLab3 {

	public static void main(String[] args) {
		//initialize arrays a1 and a2
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		//sum
		int[] sumArr = sum(a1, a2);
		System.out.println(Arrays.toString(sumArr));
		//append
		int appendNum = 200;
		int[] appendArr = append(a1, appendNum);
		System.out.println(Arrays.toString(appendArr));
		//remove
		int removeIdx = 5;
		int[] removeArr = remove(a2, removeIdx);
		System.out.println(Arrays.toString(removeArr));
		//sumEven
		int sumOfEvens = sumEven(appendArr);
		System.out.println(sumOfEvens);
		//rotateRight
		rotateRight(a1);
		System.out.println(Arrays.toString(a1));
	}
	
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] returnArr = new int[arr1.length];
		//add arr1 and arr2 elements to returnArr
		for(int i = 0; i < arr1.length; i++) {
			int sum = arr1[i] + arr2[i];			
			returnArr[i] = sum;
		}
		return returnArr;
	}

	public static int[] append(int[] arr, int num){
		int[] returnArr = new int[arr.length+1];
		//adds elements in arr to returnArr
		for(int i = 0; i < arr.length; i++) {
			returnArr[i]=arr[i];
		}
		//add num to end of returnArr
		returnArr[arr.length] = num;
		return returnArr;
	}
	
	public static int[] remove(int[] arr, int idx) {
		int[] returnArr = new int[arr.length-1];
		boolean removeIdx = false;
		//add every element in arr to returnArr except for the element of idx
		for(int i = 0; i < arr.length; i++) {
			//add elements before index
			if(i != idx && removeIdx == false) {
				returnArr[i] = arr[i];
			//came across idx
			}else if(i == idx && removeIdx == false){
				removeIdx = true;
			//add elements after index
			}else{
				returnArr[i-1] = arr[i];
			}
		}
		return returnArr;
	}
	
	public static int sumEven(int[] arr) {
		int returnInt = 0;
		//goes through every even index and adds element to returnInt sum
		for(int i = 0; i < arr.length; i+=2) {
			returnInt += arr[i];
		}
		return returnInt;
	}
	
	public static void rotateRight(int[] arr) {
		//store last element so the data isn't lost
		int lastElem = arr[arr.length-1];
		//move element to right one index
		for(int i = arr.length-2; i >= 0; i--) {
			arr[i+1] = arr[i];
		}
		//store last element to the first index
		arr[0] = lastElem;
	}
}
