/* Составить программу: определения наименьшего из двух чисел а и b.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task05 {
    public static void main(String args[]){
        int a,b ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите число a");
        a = scn.nextInt();
        System.out.println("Ведите число b");
        b = scn.nextInt();
        if (a < b) {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее: " + a);
		} else {
			System.out.println("Из чисел " + a + " и " + b + " наименьшее: " + b);
		}
	}
}
  

