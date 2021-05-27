public class IfThen {
    public static void main(String[] args) {
        ifAndThen();
        breakLine();
        ifOrThen();
    }

    static void breakLine() {
        System.out.println();
    }

    static void ifAndThen() {
        int intValue = 10;
        if(12 > intValue && intValue < 15) {
            System.out.println("Both expressions evaluate to true.");
        }
    }

    static void ifOrThen() {
        int intValue = 10;
        if(12 > intValue || intValue < 11) {
            System.out.println("One of the expressions evaluates to true.");
        }
    }
}
