/** Method Challenge
 *  "Methods are a way to organise your code to reduce duplication and make your code easier
 *  to maintain.
 *
 *  Methods:
 *  - Can be placed in any order.
 *  - Can optionally be passed data by using parameters
 *  - Declared parameters for a method effectively become variables created automatically
 *  that are local to the method and are no longer accessible when the method stops
 *  executing.
 *  - Can optionally return a single value - later in this course Objects that return
 *  multiple values will be discussed.
 *
 *  Methods that do not return values are sometimes called PROCEDURES.
 *  Methods that do return a value are sometimes called FUNCtIONS.
 *  The terms: method, procedure and function are interchangeable.
 *
 *  Method declarations contain the following:
 *  1. For right now all methods begin with the words: public static - these are access
 *  modifiers. More on that later.
 *  2. Return type:
 *  - Use void if not returning a value.
 *  - If returning a value the data type of the return value must be specified.
 *  3. Name:
 *  - Should be written in camelCase
 *  - Use one or more words that describe an action
 *  4. (Optional) Parameter list:
 *  - All method names are immediately followed by left and right parenthesis.
 *  - If parameters are used they are added inside the parenthesis via a comma
 *  separated list of data types and variable names.
 *  - If no parameters are defined for a method the parenthesis are still required
 *
 *  Challenge: Create two methods. One called calculateHighScorePosition which has one parameter: int score
 *  The method should return a value that is calculated based on the score.
 *  return 1 if score >= 1000
 *  return 2 if score >= 500 and < 1000
 *  return 3 if score is >= 100 and < 500
 *  return 4 otherwise
 *
 *  The second method displayHighScorePosition should have two parameters, String name and int position.
 *  It does not return anything but outputs information about the player and the position.
 *  "<Name> managed to get to position <Position> on the high score table."
 *
 *  Call calculateHighScorePosition four times, passing the score 1500, 900, 400, and 50.
 *  Then pass it to displayHighScorePosition with a player name.
 *
 *  Objectives
 *  - Learn about methods
 *  - Note: psvm is shortcut for the main method in IntelliJ
 */

public class MethodChallenge {
    public static void main(String[] args) {
        displayHighsScorePosition("Tim", calculateHighScorePosition(1500));
        displayHighsScorePosition("Lisa", calculateHighScorePosition(900));
        displayHighsScorePosition("Bernd", calculateHighScorePosition(400));
        displayHighsScorePosition("Alex", calculateHighScorePosition(50));
    }

    public static int calculateHighScorePosition(int score) {
        if(score >= 1000) {
            return 1;
        } else if(score >= 500 && score < 1000) {
            return 2;
        } else if(score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighsScorePosition(String name, int position) {
        System.out.println(name + " managed to get to position " + position + " on the high score table.");
    }
}