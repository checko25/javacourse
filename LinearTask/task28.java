/* Составить программу радианной меры угла в градусы, минуты и секунды
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task28
    {
    public static void main(String args[]){
        double r, g,m,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число радиан");
        r = scn.nextDouble(); 
        g = r*(180/Math.PI);
        m = g*60;
        s = g*3600;
        System.out.println("Градусы: " + g);
        System.out.println("Минуты: " + m);
        System.out.println("Секунды: " + s);
    }
}
 
 

        
        
   

 
