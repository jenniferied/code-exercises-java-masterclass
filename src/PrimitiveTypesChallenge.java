/**  Primitive Types Challenge
 * "Your challenge is to create a byte variable and set it to any valid byte number, it doesn't matter.
 *  Create a short variable and set it to any valid short number.

 *  Create an int variable and set it to any valid int number. Lastly, create a variable of type long
 *  and make it equal to 50000 plus 10 times the sum of the byte plus the short plus the integer values."

 *  Objectives
 *  - Declare an byte, short and int value and multiply their sum by a long value
 *  - Explore MIN_VALUE and MAX_VALUE of each primitive numeric data type
 */

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        challenge();
        breakLine();
        exploreMinMaxByte();
        breakLine();
        exploreMinMaxShort();
        breakLine();
        exploreMinMaxInt();
        breakLine();
        exploreMinMaxLong();
    }

    static void breakLine() {
        System.out.println();
    }
    
    static void challenge() {
        System.out.println("challenge()");
        byte byteValue = 127;
        short shortValue = 15;
        int intValue = 2000;
        long longValue = 5000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longValue);
    }

    static void exploreMinMaxByte() {
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("exploreMinMaxByte()");
        System.out.println(byteMinValue);
        System.out.println(byteMaxValue);
    }

    static void exploreMinMaxShort() {
        short shortMinValue = Short.MIN_VALUE;
        short shortMaxValue = Short.MAX_VALUE;
        System.out.println("exploreMinMaxShort()");
        System.out.println(shortMinValue);
        System.out.println(shortMaxValue);
    }

    static void exploreMinMaxInt() {
        int intMinValue = Integer.MIN_VALUE;
        int intMaxValue = Integer.MAX_VALUE;
        System.out.println("exploreMinMaxInt()");
        System.out.println(intMinValue);
        System.out.println(intMaxValue);
    }

    static void exploreMinMaxLong() {
        long longMinValue = Long.MIN_VALUE;
        long longMaxValue = Long.MAX_VALUE;
        System.out.println("exploreMinMaxLong()");
        System.out.println(longMinValue);
        System.out.println(longMaxValue);
    }
}