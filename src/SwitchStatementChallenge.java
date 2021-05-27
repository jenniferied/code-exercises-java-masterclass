/** Switch Statement Challenge
 * "1. Create a new char variable and set it to some value.
 *
 * 2. Create the switch statement, but this time you'll be testing for
 * the values a, b, c, d, or e in the cases.
 * 3. Display a message if any of these are found, and then break.
 * 4.Add a default or something in which displays a message saying that
 * a, b, c, d or e was not typed.
 */

public class SwitchStatementChallenge {
    public static void main(String[] args) {
        challenge('1');
        challenge('q');
        challenge('E');
        challenge('e');
        challenge('a');
    }

    public static void challenge(char character) {
        switch(character) {
            case 'a': case 'b': case 'c': case 'd': case 'e':
                System.out.println(character + " has been found");
                break;

            default:
                System.out.println("a, b, c, d or e have not been typed");
                break;
        }
    }
}