/* Code Exercise 13
 * Write another method getDaysInMonth with two parameters month and year. Both of type int.
 * If parameter month is < 1 or > 12 return -1.
 * If parameter year is < 1 or > 9999 then return -1.
 * This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear described above.
 */

package exercises;

public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(2,1997));
        System.out.println(getDaysInMonth(6,3475));
        System.out.println(getDaysInMonth(36, 0));
        System.out.println(getDaysInMonth(-5, 600000));
    }

    public static boolean isLeapYear(int year) {
        if(year < 1 || year > 9999) { return false; }
        return year % 4 == 0 && (!(year % 100 == 0) || ((year % 100 == 0) && (year % 400 == 0)));
    }

    public static int getDaysInMonth(int month, int year) {
        if(month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        }
        switch(month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if(isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}