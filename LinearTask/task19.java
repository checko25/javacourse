/*Дана строна равностороннего треугольника. Найти площадь этого треугольника, 
его высоту, радиусы вписанной и описанной окружности.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task19
    {
    public static void main(String args[]){
        double a,s,h,ri,ro;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения стороны треугольника");
        a = scn.nextInt();      
        s = a*a*Math.sqrt(a)/4;
        h = Math.sqrt(3)*a/2;
        ro = a/Math.sqrt(3);
        ri = a/(Math.sqrt(3)*2);
                System.out.println("Площадь треугольника равна: " +  s);
                System.out.println("Высота треугольника равна: " +  h);
                System.out.println("Радиус вписанной окружности равен: " +  ri);
                System.out.println("Радиус описанной окружности равен: " +  ro);
                
    }
} 
 

        
        
   

 
