/* Вычислить значения выражения по формуле b + sqrt(b^2+4ac) 
                                          --------------------
                                            a^2 * c + b^-2
(все переменные принимают действительные значения)
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task08
    {
    public static void main(String args[]){
        double a,b,c,s;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите число a");
        a = scn.nextDouble();
        System.out.println(" Введите число b");
        b = scn.nextDouble();
        System.out.println(" Введите число c");
        c = scn.nextDouble();
        s = b + Math.sqrt(Math.pow (b,2) + 4*a*c)/ (Math.pow (a,2) * c + Math.pow (b,-2));
                System.out.println("Значение выражения равно - " +  s);
                
    }
}
  

        
        
   

 
