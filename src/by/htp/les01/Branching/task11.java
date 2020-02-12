/* Составить программу, которая определит площадь какого круга меньше.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task11 {
    public static void main(String args[]){
        double a1,b1,c1,a2,b2,c2,s1,s2,pp1,pp2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите сторону A первого треугольника");
        a1 = scn.nextDouble();
        System.out.println("Ведите сторону B первого треугольника");
        b1 = scn.nextDouble();
        System.out.println("Ведите сторону C первого треугольника");
        c1 = scn.nextDouble();
        System.out.println("Ведите сторону A второго треугольника");
        a2 = scn.nextDouble();
        System.out.println("Ведите сторону B второго треугольника");
        b2 = scn.nextDouble();
        System.out.println("Ведите сторону C второго треугольника");
        c2 = scn.nextDouble();
        pp1 = (a1+b1+c1)/2;
        pp2 = (a2+b2+c2)/2;
        s1 = Math.sqrt(pp1 * (pp1-a1)*(pp1-b1)*(pp1-c1));
        s2 = Math.sqrt(pp2 * (pp2-a2)*(pp2-b2)*(pp2-c2));
        if (s1 > s2) {
                System.out.println("Большая площадь у треугольника А");
            } else {
		System.out.println("Большая площадь у треугольника B");
		}
    }
}
  

