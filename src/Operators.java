/** Operands
 *  "An operand is a term used to describe any object that is manipulated by an operator.
 *  If we consider this statement:
 *  int inValue = 15 + 12; Then + is the operator, and 15 and 12 are the operands.
 *  Variables used instead of literals are also operands.
 *
 *  Expression
 *  An expression is formed by combining variables, literals, method return values (which we
 *  haven't covered yet) and operators.
 */

public class Operators {
    public static void main(String[] args) {
        operators();
        breakLine();
        abbreviatingOperators();
    }

    static void breakLine() {
        System.out.println("");
    }

    static void operators() {
        // = assignment operator, assigns value to the right to the variable on the left
        // + operator, sums operand to the left to the operand to the right
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;

        // - operator, subtracts operand on the right from the operand to the left
        result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        // * operator, multiplies the operand on the right with the operand on the left
        result = result * 6;
        System.out.println(result);

        // / operator, divides operand to the left by the operand to the right
        result = result / 2;
        System.out.println(result);

        // % operator, gets the remainder of ()
        result = result % 4;
        System.out.println(result);
    }

    static void abbreviatingOperators() {
        int result = 1;

        // ++ operator, increments value by 1
        result++;
        System.out.println(result);

        // -- operator, decrements value by 1
        result--;
        System.out.println(result);

        // += operator
        result += 5;
        System.out.println(result);

        // -= operator
        result -= 5;
        System.out.println(result);

        // *= operator
        result *= 2;
        System.out.println(result);

        // /= operator
        result /= 2;
        System.out.println(result);
    }
}