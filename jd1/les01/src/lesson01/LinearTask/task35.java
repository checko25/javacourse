/* Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task35
    {
    public static void main(String[] args) {
        int m,n,l,h;
        double s;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        m = in.nextInt();
        System.out.println("Введите число:");
        n = in.nextInt();
        s = (double)m/n;
        h = (10*m/n) %10;
        l = (m/n) %10;
         System.out.println("Старшая цифра дробной части: " + h);
         System.out.println("Младшая цифра целой части: " + l);
    }
} 
      
 
 
 

        
        
   

 
