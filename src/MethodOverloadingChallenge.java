/** Method Overloading Challenge
 *  "Create a method called calcFeetAndInchesToCentimeters. It needs to have two parameters. Feet and inches.
 *  Validate that the first parameter is >= 0
 *  Validate that the second parameter is >= 0 and <= 12
 *  return -1 if either of the above is not true
 *
 *  If valid, calculate how many centimetres comprise the feet and inches passed to this method and return
 *  that value.
 *
 *  Create a second method of the same name but with ony one parameter. Inches.
 *  Validate that it is >=0 and return -1 if this is not true.
 *
 *  If valid, calculate how many feet are in inches.
 *
 *  Finally,
 *  call the other overloaded method passing the correct feet and inches calculated so that is can calculate
 *  correctly.
 *  Hint: Use double. 1 inch = 2.54cm and one foot = 12 inches.
 *
 *  Overloading Methods:
 *  - Using the same method name but with a different number of variables.
 *  - Methods that share the same name need to have the same return type."
 */

public class MethodOverloadingChallenge {
    public static void main(String[] args) {
        challenge();
        breakLine();
        score();
    }

    static void breakLine() {
        System.out.println("");
    }

    public static void challenge() {
        System.out.println("challenge()");
        System.out.println(calcFeetAndInchesToCentimeters(20, 0));
        System.out.println(calcFeetAndInchesToCentimeters(12, 11));
        System.out.println(calcFeetAndInchesToCentimeters(-12, -11));
        System.out.println(calcFeetAndInchesToCentimeters(112));
        System.out.println(calcFeetAndInchesToCentimeters(-112));
        System.out.println(calcFeetAndInchesToCentimeters(0, 0));
        System.out.println(calcFeetAndInchesToCentimeters(0));

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet >= 0 && inches >= 0 && inches <= 12) {
            return (feet * 12) * 2.54 + inches * 2.54;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches > 0) {
            double feet = Math.round((inches / 12));
            inches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, inches);
        }
        return -1;
    }

    public static void score() {
        System.out.println("score()");
        int newScore = calculateScore("Tim", 100);
        System.out.println("New score is " + newScore);
        newScore = calculateScore(250);
        System.out.println("New score is " + newScore);
        newScore = calculateScore();
        System.out.println("New score is " + newScore);
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}