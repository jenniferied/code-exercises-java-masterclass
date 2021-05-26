/**  Primitive Types Challenge - Decimal Places
 * "Convert a given number of pounds to kilograms.
 * STEPS:
 *  1. Create a variable with the appropriate type to store the numbers of pounds to be converted to kilograms.
 *  2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store
 *  the result in a 2nd appropriate variable.
 *  HINT: 1 pound is equal to 0.45359237 of a kilogram. This should help you perform the calculation."
 *
 *  Objectives
 *  - Explore declaration
 *  - Explore division between primitive numeric data types
 *  - Explore MIN_VALUE and MAX_VALUE of each primitive numeric data type - float and double
 *  - Note: Float requires 32-bits. Double (larger, more precise) requires 64-bits and runs faster on new architecture.
 *  - Both are not great when precise calculations are required. This is where BigDecimal is required.
 */

public class PrimitiveTypesChallengeDecimal {
    public static void main(String[] args) {
        challenge();
        breakLine();
        declareInt();
        breakLine();
        declareFloat();
        breakLine();
        declareDouble();
        breakLine();
        division();
        breakLine();
        exploreMinMaxFloat();
        breakLine();
        exploreMinMaxDouble();
    }

    static void breakLine() {
        System.out.println();
    }

    static void challenge() {
        double poundsToBeConverted = 10d;
        double conversionRatePoundToKilograms = 0.45359237d;
        double conversionRate = poundsToBeConverted * conversionRatePoundToKilograms;
        System.out.println("challenge()");
        System.out.println(poundsToBeConverted + "lbs -> " + conversionRate + "kg");
    }

    static void declareInt() {
        /* Integer is accepted as the default data type for whole numbers */
        int intValue = 5;
        System.out.println("declareInt()");
        System.out.println(intValue);
    }

    static void division() {
        int intDivision = 5 / 2;
        float floatDivision = 5f / 3f;
        double doubleDivision = 5.0 / 3.0;
        System.out.println("division()");
        System.out.println(intDivision);
        System.out.println(floatDivision);
        System.out.println(doubleDivision);

    }

    static void declareFloat() {
        /* Float is a 32-bit data type storing decimal numbers
        Needs to be declared with f or cast(not recommended) */
        float floatValue = 5.25f;
        float floatValueCast = (float)5.25;
        System.out.println("declareFloat()");
        System.out.println(floatValue);
        System.out.println(floatValueCast);
    }

    static void declareDouble() {
        /* Double is a 64-bit data type storing decimal numbers as default
        Can be declared with d, cast is not recommended as it is redundant */
        double doubleValue = 5.25;
        double doubleValueExplicit = 5.25d;
        double doubleValueUnderscore = 1_564_121.1_998_231;
        System.out.println("declareDouble()");
        System.out.println(doubleValue);
        System.out.println(doubleValueExplicit);
        System.out.println(doubleValueUnderscore);
    }
    
    static void exploreMinMaxFloat() {
        float floatMinValue = Float.MIN_VALUE;
        float floatMaxValue = Float.MAX_VALUE;
        System.out.println("exploreMinMaxFloat()");
        System.out.println(floatMinValue);
        System.out.println(floatMaxValue);
    }

    static void exploreMinMaxDouble() {
        double doubleMinValue = Double.MIN_VALUE;
        double doubleMaxValue = Double.MAX_VALUE;
        System.out.println("exploreMinMaxDouble()");
        System.out.println(doubleMinValue);
        System.out.println(doubleMaxValue);
    }
}