/** Seconds And Minutes Challenge
 * "1. Create a method called getDurationString with two parameters, first parameter minutes
 * and second parameter seconds.
 *
 * Validate that minutes >= 0
 * Validate that seconds >= 0 and <= 59
 *
 * Return "Invalid value" in the method if either of the above are not true
 * If valid, calculate how many hours, minutes and seconds equal the minutes and seconds
 * passed to this method and return that value as String in format "XXh YYm ZZs"
 *
 * 2. Create a second method of the same name, but with only one parameter seconds.
 *
 * Validate that second >= 0 and return "Invalid value" if not true.
 *
 * If valid, calculate how many minutes are in the seconds value and then call the other
 * overloaded method passing the correct minutes and seconds calculated.
 *
 * Bonus: return in this format 01h 01m 00s.
 */

public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        challenge();
    }

    public static void challenge() {
        System.out.println(getDurationString(123,432));
        System.out.println(getDurationString(231, 22));
        System.out.println(getDurationString(60, 3));
        System.out.println(getDurationString(23424));
        System.out.println(getDurationString(112));
        System.out.println(getDurationString(0, 70));
        System.out.println(getDurationString(1));
        System.out.println(getDurationString(0));
        System.out.println(getDurationString(61, 0));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = (minutes / 60);
            minutes %= 60;
            return converter(hours) + "h " + converter(minutes) + "m " + converter(seconds) + "s";
        }
        return "Invalid value";
    }

    public static String getDurationString ( int seconds){
        if (seconds >= 0) {
            int minutes = (seconds / 60);
            seconds %= 60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid value";
    }

    public static String converter(int value) {
        if(value < 10) {
            return "0" + value;
        } else {
            return String.valueOf(value);
        }
    }
}