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
	
	public static String foil(int num1, int num2, int num3, int num4, String letter) {
		return (num1*num3) + letter + "^2+" + (num2*num3+num1*num4) + letter + "+" + (num2*num4);
	}
}
