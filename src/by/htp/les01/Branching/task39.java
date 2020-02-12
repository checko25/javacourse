/* Вычислить значение функции: /  -x^2 +x-9   если x => 8
                               |
                               |     1
                               | - ------       если  x<8
                               \   x^4 -6
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task39 {
    public static void main(String... args) {
        double x,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();
        if (x >= 8) {
            f = Math.pow(-x, 2) + x - 9;
            System.out.printf("При х >= 8 значение функции равно %.3f%n", f);
	} else {
            f = 1 / (Math.pow(x, 4) - 6);
            System.out.printf("При х < 8 значение функции равно %.3f%n", f);
	}
    }
}
  

