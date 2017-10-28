// Mandy Woo 

import java.util.Arrays;

public class Split {

public static void main(String[] args) {
// Your task Part 0
//String.split();
//It's a method that acts on a string, <StringName>.split(<String sp>);
//Where sp is the string where the string splits
//And it returns an array
// Example: "I like apples!".split(" "); 
//	it will split at spaces and return an array of ["I","like","apples!"]
// Example 2: "I really like really red apples".split("really")
//	it will split at the word "really" and return an array of ["I "," like "," red apples!"]
//play around with String.split! 
//What happens if you "I reallyreally likeapples".split("really") ?
	System.out.println(Arrays.toString("I like apples!".split(" ")));
	System.out.println(Arrays.toString("I really like really red apples".split("really")));
	System.out.println(Arrays.toString("I reallyreally likeapples".split("really")));
	System.out.println(Arrays.toString("really I like apples!".split("really")));
	System.out.println(Arrays.toString("I like apples! really".split("really")));
	
	filling("breadapplespineappleslettustomatobaconmayohamcheesebread");
	filling("applespineappleslettustomatobaconmayohambreadbreadcheese");
	filling2("apples pineapples bread lettus tomato bacon mayo bread ham cheese");
	}




//Your task Part 1:
/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/

//finds filling of string with no spaces
	public static void filling(String everything) {
		//splits string at bread
		String[] splitArr = everything.split("bread");
		//array to string
		String str = Arrays.toString(splitArr);
		System.out.println(str);
		//index of where bread was replaced
		int breadInd = str.indexOf(", ");
		int breadInd2 = str.indexOf(", ", str.indexOf(", ")+1);
		System.out.println(breadInd2);
		int breadInd3 = str.indexOf(", ", breadInd2 + 1);
		if((breadInd == -1 && breadInd2 == -1)||(breadInd2==-1 && (everything.indexOf("bread", everything.indexOf("bread")+1)==-1))||(breadInd+2==breadInd2)) {
			System.out.println("There is no filling in "+everything);
		}else {
			if(breadInd3 != -1) {
				System.out.println("The filling is "+str.substring(breadInd+2, breadInd2) +" and "+str.substring(breadInd2+2, breadInd3));
			}else if(true) {
				System.out.println(everything.indexOf("bread", everything.indexOf("bread")+1)+6);
				System.out.println("The filling is "+str.substring(breadInd+2));
				//System.out.println("The filling is "+str.substring(breadInd+2, breadInd2));
			}else {
				System.out.println("The filling is "+str.substring(breadInd+2, breadInd2));
			}
		}
	}
	
	
//Your task Part 2:
/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
* Again, what if it's a fancy sandwich with multiple pieces of bread?
*/
	
//finds filling in String with spaces
public static void filling2(String everything) {
	String[] splitArr = everything.split(" ");
	String str = Arrays.toString(splitArr);
	int breadInd = str.indexOf("bread");
	int breadInd2 = str.indexOf("bread", str.indexOf("bread")+1);
	int breadInd3 = str.indexOf("bread", breadInd2 + 1);
	if((breadInd == -1 && breadInd2 == -1)||(breadInd2==-1)||(breadInd+7==breadInd2)) {
		System.out.println("There is no filling in "+everything);
	}else {
		if(breadInd3 != -1) {
			System.out.println("The filling is "+str.substring(breadInd+7, breadInd2) +" and "+str.substring(breadInd2+7, breadInd3-2));
		}else {
			System.out.println("The filling is "+str.substring(breadInd+7, breadInd2-2));
		}
	}
}

}