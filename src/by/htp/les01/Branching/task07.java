/* Составить программу нахождения модуля выражения a*x*x + b*x + c при
заданных значениях a, b, c и х
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task07 {
    public static void main(String args[]){
        int a,b,c,x,y ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите число a");
        a = scn.nextInt();
        System.out.println("Ведите число b");
        b = scn.nextInt();
        System.out.println("Ведите число c");
        c = scn.nextInt();
        System.out.println("Ведите число x");
        x = scn.nextInt();
        y = Math.abs(a * x * x + b * x + c);
        System.out.println("Модуль выражения равен " + y);
    }
}
  

