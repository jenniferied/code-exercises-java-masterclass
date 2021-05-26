/** Datatype - String
 *  "A String is a sequence of characters. In the case of the char which you can see above
 *  which we discussed in the previous video, it could contain a single character only
 *  (regular character or Unicode character).
 *
 *  A String can contain a sequence of characters. A large number of characters. Technically
 *  it's limited by the memory of the MAX_VALUE of an int which was 2.14 Billion."
 */

public class DatatypeString {
    public static void main(String[] args) {
        defineString();
        breakLine();
        stringOperations();
    }

    static void breakLine() {
        System.out.println("");
    }

    static void defineString() {
        /* A String is a datatype in Java, which is not a primitive Type. It's actually a Class,
         * but it enjoys a bt of favoritism by Java to make it easier to use than a regular class. */
        String stringValue = "This is a sequence of characters.";
        System.out.println("defineString()");
        System.out.println(stringValue);
    }

    static void stringOperations() {
        System.out.println("stringOperations()");
        String stringValue = "I like ice cream";
        System.out.println(stringValue);
        stringValue += " and watermelons.";
        System.out.println(stringValue);

        stringValue = "\u00A9 2021";
        System.out.println(stringValue);

        stringValue = "20";
        int intValue = 21;
        stringValue = stringValue + intValue;
        System.out.println(stringValue);
    }

    /* Note: Strings in Java are immutable. When appending a value to a String a new String is created and the old
    one is discarded. This is inefficient - instead a StringBuffer can be used. */

}