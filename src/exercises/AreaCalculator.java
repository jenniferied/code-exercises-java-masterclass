/* Code Exercise 08
 * "Write a method named area with one double parameter named radius.
 * The method needs to return a double value that represents the area of a circle.
 * If the parameter radius is negative then return -1.0 to represent an invalid value.
 *
 * Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.
 * The method needs to return an area of a rectangle.
 * If either or both parameters is/are a negative return -1.0 to indicate an invalid value.
 *
 * For formulas and PI value please check the tips below.
 * TIP: The formula for calculating the area of a rectangle is x * y.
 * TIP: The formula for calculating a circle area is radius * radius * PI.
 * TIP: For PI use a constant from Math class e.g. Math.PI"
 */

package exercises;

public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(12,3));
        System.out.println(area(3, 14));
        System.out.println(area(21));
        System.out.println(area(1));
    }

    public static double area(double radius) {
        if(radius >= 0) {
            return radius * radius * Math.PI;
        }
        return -1;
    }

    public static double area(double x, double y) {
        if(x >= 0 && y >= 0) {
            return x * y;
        }
        return -1;
    }
}