/*  Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task14 {
    public static void main(String args[]){
        int a,b;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите значение угла a");
        a = scn.nextInt();
        System.out.println("Ведите значение угла b");
        b = scn.nextInt();
        if ((180 - a - b) <= 0) {
            System.out.println("Такого треугольника не существует");
	} else if (a == 90 || b == 90 || (a + b) == 90) {
            System.out.println("Такой треугольник существует и он прямоугольный");
	} else {
            System.out.println("Такой треугольник существует");
	}
    }    
}
 
  

