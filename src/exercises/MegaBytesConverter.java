/* Code Exercise 02
* "Write a method called printMegaBytesAndKiloBytes that has 1 parameter of type int with the name kiloBytes.
* The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes
* from the kilobytes parameter.
* Then it needs to print a message in the format "XX KB = YY MB and ZZ KB"."
 */

package exercises;

public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(1025);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainderKiloBytes = kiloBytes % 1024;
        if(kiloBytes<0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainderKiloBytes + " KB");
        }
    }
}
