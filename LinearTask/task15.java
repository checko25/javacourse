/* Написать программу, которая выводит на экран первые четыре степени числа Пи
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task15
    {
     public static void main(String args[]){
        int i;
        double s = Math.PI ;
        for (i=0;i<4;i++){         
            System.out.println(s);
            s = s*Math.PI;
        }            
    }
}
 

        
        
   

 
