/* Определить, делителем каких чисел а, b, с является число k
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task22 {
    public static void main(String args[]){
        int x,y,z;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число x");
        x = scn.nextInt();
        System.out.println("Введите число y");
        y = scn.nextInt();
            System.out.println("Было x = " + x + ", y = " + y);
            if (x < y) {
		z = x;
		x = y;
		y = z;
            }
            System.out.println("Стало x = " + x + ", y = " + y);
    }
}
  

