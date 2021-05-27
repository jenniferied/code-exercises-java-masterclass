/* Code Exercise 07
 * We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
 * Write a method named hasTeen with 3 parameters of type int.
 * The method should return boolean and it needs to return true if one of the parameters
 *  is in range 13(inclusive) - 19 (inclusive). Otherwise return false.
 *
 * Write another method named isTeen with 1 parameter of type int.
 * The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
 * Otherwise return false.
 */

package exercises;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(-1,12,3));
        System.out.println(hasTeen(3, 3, 14));
        System.out.println(hasTeen(21, 4,99));
    }

    public static boolean hasTeen(int v, int v1, int v2) {
        return isTeen(v) || isTeen(v1) || isTeen(v2);
    }

    public static boolean isTeen(int v) {
        return (13 <= v && v <= 19);
    }
}