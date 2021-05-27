/** If Then, Logical AND, Logical OR
 * "This lesson we are looking at the logical AND and OR.
 * Both operate on boolean operands - Checking if a given condition is true or false.
 * && AND
 * || OR
 * & bitwise operator working at the bit level.
 * | bitwise operator working at the bit level.
 * ! or NOT operator is also known as the Logical Complement Operator
 * ? boolean : boolean is known as a ternary operator
 * shorthand for if-then-else statement
 */

public class IfThen {
    public static void main(String[] args) {
        ifAndThen();
        breakLine();
        ifOrThen();
    }

    static void breakLine() {
        System.out.println();
    }

    static void ifAndThen() {
        int intValue = 10;
        if(12 > intValue && intValue < 15) {
            System.out.println("Both expressions evaluate to true.");
        }
    }

    static void ifOrThen() {
        int intValue = 10;
        if(12 > intValue || intValue < 11) {
            System.out.println("One of the expressions evaluates to true.");
        }
    }
}
