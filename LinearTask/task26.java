/*Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task26
    {
    public static void main(String args[]){
        double a, b,y,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите сторону a");
        a = scn.nextDouble();
        System.out.println("Введите сторону b");
        b = scn.nextDouble();
        System.out.println("Введите угол y");
        y = scn.nextDouble();
            y = Math.toRadians(y); 
            y = Math.sin(y); 
            s = (a * b * y) / 2; 
        System.out.println("Площадь треугольника рана: " + s );
    
    }
}
 

        
        
   

 
