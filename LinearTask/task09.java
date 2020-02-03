/*Вычислить значения выражения по формуле a      b      ab-c
                                          --- *  --- - -------
                                           c      d      cd
(все переменные принимают действительные значения)
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task09
    {
    public static void main(String args[]){
        double a,b,c,d,s;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите число a");
        a = scn.nextInt();
        System.out.println(" Введите число b");
        b = scn.nextInt();
        System.out.println(" Введите число c");
        c = scn.nextInt();
        System.out.println(" Введите число d");
        d = scn.nextInt();
        s = (a/c) * (b/d) - ((a*b-c)/c*d);
                System.out.println("Значение выражения равно - " +  s);
                
    }
}
  

        
        
   

 
