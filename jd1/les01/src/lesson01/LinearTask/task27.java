/* Дано значение a. Не используя никаких функций и операций, кроме умножения, получить
значение a^3 за три операции, и a^10 за четыре операции.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task27
    {
    public static void main(String args[]){
        int a, b3,a10,b10, s3,s10;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число a");
        a = scn.nextInt();
        b3 = a*a;
        s3 = b3*a;
        b10 = a*a;
        a10 = b10*b10;
        b10 = b10*b10;
        s10 = a10*b10;
    System.out.println("Число a^3 равно:" + s3);
    System.out.println("Число a^10 равно:" + s10);
        
    }
}
 
 

        
        
   

 
