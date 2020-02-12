/* Вычислить значение функции: /  -x^3 + 9   если x <= 13
                               |
                               |     3
                               | - ------    если  x>13
                               \    x+1
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task40{
    public static void main(String... args) {
        double x,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();
        if (x <= 13) {
            f = Math.pow(-x, 3) + 9;
            System.out.printf("При х <= 13 значение функции равно %.3f%n", f);
	} else {
            f = -(3 / (x + 1));
            System.out.printf("При х > 13 значение функции равно %.3f%n", f);
	}
    }
}
  

