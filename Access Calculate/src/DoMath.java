/* Mandy Woo
 * September 6, 2017
 * This is the runner for the calculate library. It is used to test the methods in Calculate.
 */
public class DoMath {

	public static void main(String[] args) {
		System.out.println(Calculate.square(-7));
		System.out.println(Calculate.cube(-1));
		System.out.println(Calculate.average(2,2));
		System.out.println(Calculate.average(-2,2,9));
		System.out.println(Calculate.toDegrees(3.14159/2));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(1,1,1));
		System.out.println(Calculate.toImproperFrac(3,1,2));
		System.out.println(Calculate.toMixedNum(7,2));
		System.out.println(Calculate.foil(2,3,6,-7,"n"));
	}
}
