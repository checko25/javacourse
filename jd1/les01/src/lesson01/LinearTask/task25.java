/*Вычислить корни квадратного уравнения ax^2 + bx + c = 0 с заданными коэффициентами a,b,c 
(предполагается, что a !=0 и что дискриминант уравнения неотрицательный.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task25
    {
    public static void main(String args[]){
        double a, b,c,d,x1,x2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число a");
        a = scn.nextDouble();
        System.out.println("Введите число b");
        b = scn.nextDouble();
        System.out.println("Ведите число c");
        c = scn.nextDouble();
        d = b * b - 4 * a * c;
        if (d > 0) {
    x1 = (-b - Math.sqrt(d)) / (2 * a);
    x2 = (-b + Math.sqrt(d)) / (2 * a);
    System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (d == 0) {
        double x;
        x = -b / (2 * a);
        System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
        System.out.println("Уравнение не имеет действительных корней!");
        }
    }
}
 

        
        
   

 
