/* Составить программу: равны ли два числа а и b?
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task04 {
    public static void main(String args[]){
        int a,b ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите число a");
        a = scn.nextInt();
        System.out.println("Ведите число b");
        b = scn.nextInt();
        if (a == b) {
			System.out.println("Числа a и b равны");
		} else {
			System.out.println("Числа a и b не равны");
		}
	}
}
  

