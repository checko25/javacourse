/* Вычислить значение функции: /  x^x    если 0 <= x <= 3
                               |
                               |    
                               |    4    если x>3 или x<0
                               \  
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task38 {
    public static void main(String... args) {
        double x,f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение x: ");
        x = sc.nextDouble();
        if (x >= 0 && x <= 3) {
            f = Math.pow(x, 2);
            System.out.printf("При 0 <= х <= 3 значение функции равно %.3f%n", f);
	} else {
            f = 4;
            System.out.printf("При х > 3 или x < 0 значение функции равно %.3f%n", f);
	}
    }
}
  

