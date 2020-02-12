/* Составить программу: определения наибольшего из двух чисел а и b.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task06 {
    public static void main(String args[]){
        int a,b ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите число a");
        a = scn.nextInt();
        System.out.println("Ведите число b");
        b = scn.nextInt();
        if (a > b) {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее: " + a);
		} else {
			System.out.println("Из чисел " + a + " и " + b + " наибольшее: " + b);
		}
    }
}
  

