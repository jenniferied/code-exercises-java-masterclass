/** Day Of The Week Challenge
 * "1. Write a method with the name printDayOfTheWeek, it's got one parameter int day.
 * - The method shouldn't return any value (void)
 * 2. Using a switch statement print Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
 * if the int parameter day is 0 1 2 3 4 5 or 6 respectively.
 * - If none of those are true print "Invalid day" instead.
 */

public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfTheWeek(4);
        printDayOfTheWeek(-1);
        printDayOfTheWeek(1);
        printDayOfTheWeek(6);
        printDayOfTheWeek(12);
    }

    public static void printDayOfTheWeek(int day) {
        switch(day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}