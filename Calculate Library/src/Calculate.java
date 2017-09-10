/* Mandy Woo
 * September 6, 2017
 * Our self written math library
 * it contains a series of methods to do basic math functions
 */
public class Calculate {
	//square the input
	public static int square(int operand) {
		return operand*operand;
	}
	//cube the input
	public static int cube(int number) {
		return number*number*number;
	}
	//average of two double inputs
	public static double average(double number1, double number2) {
		return (number1+number2)/2;
	}
	//average of three double inputs
	public static double average(double number1, double number2, double number3) {
		return (number1+number2+number3)/3;
	}
	//converts angle measurement to degrees
	public static double toDegrees(double angleMeasure) {
		return (angleMeasure*180)/3.14159;
	}
	//converts degree measurements to radians
	public static double toRadians(double degreeMeasure) {
		return (degreeMeasure*3.14159)/180;
	}
	//finds discriminant of coefficients in a quadratic equation
	public static double discriminant(double a, double b, double c) {
		return b*b-4*a*c;
	}
	//convert mixed number to improper fraction
	public static String toImproperFrac(int wholeNum, int numerator, int denominator) {
		int newNumerator = wholeNum*denominator+numerator;
		return ( newNumerator + "/" + denominator);
	}
	//convert improper fraction to mixed number
	public static String toMixedNum(int numerator, int denominator) {
		int wholeNum = numerator/denominator;
		int newNumerator = numerator%denominator;
		return (wholeNum + "_" + newNumerator +"/"+ denominator);
	}
	//foils form (ax + b)(cx+d) into standard form
	public static String foil(int a, int b, int c, int d, String letter) {
		return (a*c) + letter + "^2+" + (b*c+a*d) + letter + "+" + (b*d);
	}
	//figure if num1 is divisible by num2
	public static boolean isDivisibleBy(int num1,int num2) {
		if(num1%num2==0) {
			return true;
		}else{
			return false;
		}
	}
	//returns absolute value of input
	public static double absValue(double number) {
		if(number<0) {
			return number*-1;
		}else {
			return number;
		}
	}
	//returns greater number out of 2 numbers
	public static double max(double num1, double num2) {
		if(num1>num2) {
			return num1;
		}else{
			return num2;
		}
	}
	//returns greatest number out of 3 numbers
	public static double max(double num1, double num2, double num3) {
		if(num1>num2 && num1>num3) {
			return num1;
		}else if(num2>num1 && num2>num3){
			return num2;
		}else{
			return num3;
		}
	}
    //returns smaller number of two integers
	public static int min(int num1, int num2) {
		if(num1<num2) {
			return num1;
		}else{
			return num2;
		}
	}
	//rounds number to 2 decimal places	
	public static double round2(double number) {
		double difference = number % .01;
		double roundedNum = number - difference;
		if(difference <= .0049) {
			return roundedNum;
		}else {
			return roundedNum + .01;
		}
		
	}
		
		
}
