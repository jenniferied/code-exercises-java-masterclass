/* Code Exercise 05
*  Write a method areEqualByThreeDecimalPlaces with two parameters of type double
*  The method should return boolean and it needs to return true if two double
*  numbers are the same up to three decimal places. Otherwise, return false.
 */

package exercises;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double v, double v1) {
        return (int) (v * 1000) == (int) (v1 * 1000);
    }
}