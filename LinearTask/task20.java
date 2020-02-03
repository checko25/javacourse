/*Известна длина окружности. Найти площадь круга, ограниченного этой окружностью
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task20
    {
    public static void main(String args[]){
        double l,r,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения длины окружности");
        l = scn.nextInt(); 
        r = l/(2*Math.PI);
        s = r*r*Math.PI;
                System.out.println("Площадь круга равна: " +  s);
                
    }
}
 

        
        
   

 
