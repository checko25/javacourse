/* Написать программу, которая по заданным трем числам определяет, является ли сумма каких-либо двух из них положительной.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task32 {
    public static void main(String... args) {
        double a,b,с;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число a: ");
        a = sc.nextDouble();
        System.out.print("Введите число b: ");
        b = sc.nextDouble();
        System.out.print("Введите число с: ");
        с = sc.nextDouble();
            if ((a + b) > 0) {
		System.out.println("Сумма чисел a и b положительная");
		}
            if ((a + с) > 0) {
		System.out.println("Сумма чисел a и c положительная");
		}
            if ((b + с) > 0) {
		System.out.println("Сумма чисел b и c положительная");
            } else {
		System.out.println("Сумма любых двух чисел отрицательная");
                }
	}
}
  

