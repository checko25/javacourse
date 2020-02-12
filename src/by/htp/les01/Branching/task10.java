/* Составить программу, которая определит площадь какого круга меньше.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task10 {
    public static void main(String args[]){
        double a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите радиус круга a");
        a = scn.nextDouble();
        System.out.println("Ведите радиус круга b");
        b = scn.nextDouble();
        a = Math.PI*a*a;
        b = Math.PI*b*b;
        if (a < b) {
			System.out.println("Меньшая площадь у круга А");
		} else {
			System.out.println("Меньшая площадь у круга B");
		}
    }
}
  

