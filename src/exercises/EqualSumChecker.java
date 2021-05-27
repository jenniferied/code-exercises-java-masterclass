/* Code Exercise 06
 *  Write a method hasEqualSum with 3 parameters of type int.
 *  The method should return boolean and it needs to return true if the
 *  sum of the first and second parameter is equal to the third parameter.
 *  Otherwise, return false.
 */

package exercises;

public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,2,3));
        System.out.println(hasEqualSum(3, 3, 5));
        System.out.println(hasEqualSum(-2, 4,2));
    }

    public static boolean hasEqualSum(int v, int v1, int v2) {
        return v + v1 == v2;
    }
}