/* Составить алгоритм нахождения среднего арифметического двух чисел
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task05 
    {
    public static void main(String args[]){
        double a,b,s ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  переменную a");
        a = scn.nextDouble();
        System.out.println("Ведите  переменную b");
        b = scn.nextDouble();
        s = (a + b) / 2;
                System.out.println("Среднее арифметическое чисел" + a + "и" + b + "равно: " + s);           
    }
}
  

        
        
   

 
