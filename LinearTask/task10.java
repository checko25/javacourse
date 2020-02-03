/*Вычислить значения выражения по формуле  sin x + cos y     
                                          -------------- * tg xy
                                           sin x - cos y  
(все переменные принимают действительные значения)
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task10
    {
    public static void main(String args[]){
        double x,y,s;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите число x");
        x = scn.nextDouble();
        System.out.println(" Введите число y");
        y = scn.nextDouble();
        s = (Math.sin(x)- Math.cos(y))/ (Math.sin(x)- Math.cos(y)) * Math.tan(x*y);
                System.out.println("Значение выражения равно - " +  s);
    }
}
  

        
        
   

 
