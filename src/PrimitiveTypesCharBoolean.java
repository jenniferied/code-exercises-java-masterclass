/** Primitive Types - Char, Boolean
 * With this lesson we will have looked at all 8 primitive types that Java has.
 * byte(8-bit), short(16-bit), int(32-bit), long(64-bit), float(32-bit), double(64-bit), char(16-bit), boolean
 */

public class PrimitiveTypesCharBoolean {
    public static void main(String[] args) {
        declareChar();
        breakLine();
        declareBoolean();
        breakLine();
        testBoolean();
    }

    static void breakLine() {
        System.out.println();
    }

    static void declareChar() {
        /* A char occupies two bytes of memory (16-bits) and thus has a width of 16.
        The reason it's not just a single byte is that it allows the storage of Unicode characters. */
        char charValue = 'd';

        /* Unicode is an international encoding standard for use with different languages and scripts,
        by which each letter, digit, or symbol is assigned a unique numeric value that applies across
        different platforms and programs. A char can represent 65535 different types of characters. */
        char charValueUnicode = '\u1234';

        System.out.println("declareChar()");
        System.out.println(charValue);
        System.out.println(charValueUnicode);
    }

    static void declareBoolean() {
        /* A boolean value allows for two choices True or False, Yes or No, 1 or 0. In java terms we
        * have a boolean primitive type and it can be set to two values only. true or false. */
        boolean booleanValue = false;
        System.out.println("declareBoolean()");
        System.out.println(booleanValue);
    }

    static void testBoolean() {
        int number = 12;
        boolean isNumberGreaterThan10 = number > 10;
        System.out.println("Number " + number + " is greater than 10 is: " + isNumberGreaterThan10 + ".");
    }
}