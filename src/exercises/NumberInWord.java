/* Code Exercise 12
 * Write a method called printNumberInWord. The method has one parameter number which is the whole number.
 * The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9
 * or other for any other number including negative numbers. You can use if-else statement or switch statement
 * whatever is easier for you.
 */

package exercises;

public class NumberInWord {
    public static void main(String[] args) {
        printNumberInWord(2);
        printNumberInWord(6);
        printNumberInWord(36);
        printNumberInWord(-5);
    }

    public static void printNumberInWord(int wholeNumber) {
        switch(wholeNumber) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}