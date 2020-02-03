/*Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее арифметическое модулей этих чисел
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task17
    {
    public static void main(String args[]){
        double a,b,s1,s2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения числа a");
        a = scn.nextDouble();
        System.out.println("Введите значения числа b");
        b = scn.nextDouble();     
        s1 = (Math.pow(a,3)+Math.pow(b,3))/2;
        s2 = (Math.abs(a)+ Math.abs(b))/2;
                System.out.println("Среднее арифметическое кубов равно: "+  s1);
                System.out.println("Среднее арифметическое модулей равно: " +  s2);
                
    }
}
 

        
        
   

 
