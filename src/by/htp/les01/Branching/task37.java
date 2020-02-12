/* Вычислить значение функции: / -x^2 + 3x + 9 если x => 3
                               |
                               |    1
                               |  -----       если x<3
                               \  x^3-6
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task37 {
    public static void main(String... args) {
        double x,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();
        if (x >= 3) {
            f = Math.pow(-x, 2) + 3 * x + 9;
            System.out.printf("При х >= 3 значение функции равно %.3f%n", f);
	} else {
            f = 1 / (Math.pow(x, 3) - 6);
            System.out.printf("При х < 3 значение функции равно %.3f%n", f);
            }
    }
}
  

