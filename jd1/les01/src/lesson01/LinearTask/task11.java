/* Вычислить периметр и площадь прямоугольного треугольника по длинам a и b двух катетов
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task11
    {
    public static void main(String args[]){
        double a,b,c,p,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения катета a");
        a = scn.nextDouble();
        System.out.println("Введите значения катета b");
        b = scn.nextDouble();
        c = Math.pow(a, 2) + Math.pow(b, 2);
	c = Math.sqrt(c);
        p = a + b + c;
        s = a*b/2;
                System.out.println("Периметр равен: " +  p);
                System.out.println("Площадь равна: " +  s);
                
    }
}
  

        
        
   

 
