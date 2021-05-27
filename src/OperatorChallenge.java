/** Operator Challenge
 *  1. Create a double variable with a value of 20.00
 *  2. Create a second variable of type double with the value of 80.00
 *  3. Add both numbers together and multiply by 100
 *  4. Use the remainder operator to figure out what the remainder from the result of the
 *  operation in step 3 and 40.00. We used modulus or remainder operator on ints but can
 *  do so on a double too.
 *  5. Create a boolean value that assigns the value true if the remainder in #4 is 0, or
 *  false if its not zero.
 *  6. Output the boolean variable.
 *  7. Write an if-then statement that displays a message "Got some remainder" if the boolean
 *  in step 5 is not true. Don't be surprised if you see output for this step, where you might
 *  expect it not to show."
 */

public class OperatorChallenge {
    public static void main(String[] args) {
        challenge();
    }

    static void challenge() {
        double doubleValue01 = 20.00;
        double doubleValue02 = 80.00;
        double sum = (doubleValue01 + doubleValue02) * 100.00;
        double remainder = sum % 40.00;
        boolean booleanValue = (remainder == 0);
        System.out.println(booleanValue);
        if(!booleanValue) {
            System.out.println("Got some remainder");
        }
    }
}
