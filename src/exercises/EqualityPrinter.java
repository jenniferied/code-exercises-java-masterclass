/* Code Exercise 10
 * Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
 * If one of the parameters is less than 0, print text "Invalid Value".
 * If all numbers are equal print text "All numbers are equal"
 * If all numbers are different print text "All numbers are different".
 * Otherwise, print "Neither all are equal or different".
 */

package exercises;

public class EqualityPrinter {
    public static void main(String[] args) {
        printEqual(-1, 2, 1);
        printEqual( 4, 4, 314);
        printEqual( 4,2,4);
        printEqual( 34,4,4);
        printEqual(21, 21, 21);
        printEqual(143593627, 345839, 345);
    }

    public static void printEqual(int v, int v2, int v3) {
        if(v < 0 || v2 < 0 || v3 < 0) {
            System.out.println("Invalid Value");
        } else if(v == v2 && v == v3) {
            System.out.println("All numbers are equal");
        } else if(v != v2 && v != v3 && v2 != v3) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
}