/* Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task30 {
    public static void main(String... args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = sc.nextDouble();
        System.out.print("Введите число b: ");
        b = sc.nextDouble();
        System.out.print("Введите число c: ");
        c = sc.nextDouble();
            if (a > b && b > c) {
		a *= 2;
		b *= 2;
		c *= 2;
            } else {
		a = Math.abs(a);
		b = Math.abs(b);
		c = Math.abs(c);
		}
	System.out.println("a = " + a + "\nb = " + b + "\nc = " + c);
	}
}
  

