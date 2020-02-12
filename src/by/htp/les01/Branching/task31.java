/* Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task31 {
    public static void main(String... args) {
        double a,b,x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину отверстия А: ");
        a = sc.nextDouble();
        System.out.print("Введите ширину отверстия B: ");
        b = sc.nextDouble();
        System.out.print("Введите длину кирпича x: ");
        x = sc.nextDouble();
        System.out.print("Введите ширину кирпича y: ");
        y = sc.nextDouble();
        System.out.print("Введите высоту кирпича z: ");
        z = sc.nextDouble();
        if (a >= y && b >= z) {
			System.out.println("Кирпич пройдет");
		} else {
			System.out.println("Кирпич НЕ пройдет");
		}
	}
}
  

