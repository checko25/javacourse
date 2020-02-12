/* Составить программу, которая определит по трем введенным сторонам,является ли данный треугольник равносторонним.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task09 {
    public static void main(String args[]){
        int a,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите сторону a");
        a = scn.nextInt();
        System.out.println("Ведите сторону b");
        b = scn.nextInt();
        System.out.println("Ведите сторону c");
        c = scn.nextInt();
        if (a == b && a == c) {
		System.out.println("Треугольник равносторонний");
		} 
        else if (a == b || b == c || a == c) {
		System.out.println("Треугольник равнобедренный");        
		}
        else {
		System.out.println("Треугольник не равносторонний");
	}
    }
}
  

