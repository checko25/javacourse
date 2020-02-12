/* Составить программу нахождения наименьшего из квадратов двух чисел а и b.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task08 {
    public static void main(String args[]){
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите число a");
        a = scn.nextInt();
        System.out.println("Ведите число b");
        b = scn.nextInt();
        a = a*a;
        b = b*b;
        if (a < b) {
			System.out.println("Из квадратов чисел a" +   " (" +  a + ") и b"  + " (" + b
					+ ") наименьший: " +  a);
		} else {
			System.out.println("Из квадратов чисел a"  + " (" + a + ") и b"  + " (" + b
					+ ") наименьший: " + b);
		}
    }
}
  

