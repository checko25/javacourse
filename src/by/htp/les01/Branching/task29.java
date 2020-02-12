/* Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они  расположены на одной прямой.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task29 {
    public static void main(String... args) {
        double x1,x2,x3,y1,y2,y3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите координату x1: ");
        x1 = sc.nextDouble();
        System.out.print("Введите координату x2: ");
        x2 = sc.nextDouble();
        System.out.print("Введите координату x3: ");
        x3 = sc.nextDouble();
        System.out.print("Введите координату y1: ");
        y1 = sc.nextDouble();
        System.out.print("Введите координату y2: ");
        y2 = sc.nextDouble();
        System.out.print("Введите координату y3: ");
        y3= sc.nextDouble();
            if (((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) == 0) {
		System.out.println("Точки лежат на одной прямой");
		} else {
		System.out.println("Точки не лежат на одной прямой");
		}
	}
}
  

