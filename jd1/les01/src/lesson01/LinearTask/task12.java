/* Вычислить расстояние между двумя точками с данными координатами (х1, у1)и (x2, у2)
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task12
    {
    public static void main(String args[]){
        double x1,x2,y1,y2,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение точки x1");
        x1 = scn.nextDouble();
        System.out.println("Введите значение точки x2");
        x2 = scn.nextDouble();
        System.out.println("Введите значение точки y1");
        y1 = scn.nextDouble();
        System.out.println("Введите значение точки y2");
        y2 = scn.nextDouble();
        s = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
                System.out.println("Расстояние между точками равно: " +  s);
                
    }
}
  

        
        
   

 
