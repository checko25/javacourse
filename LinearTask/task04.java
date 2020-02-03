/* Найдите значение функции: z = ( (a – 3 ) * b / 2) + c
*/

package by.htp.les01.main; 
import java.util.Scanner;
    public class task04 
    {
    public static void main(String args[]){
        double a,b,c,z ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  переменную a");
        a = scn.nextDouble();
        System.out.println("Ведите  переменную b");
        b = scn.nextDouble();
        System.out.println("Ведите  переменную c");
        c = scn.nextDouble();
        z = ((a - 3) * b / 2) + c;
                System.out.println("Значение функции z:" + z);           
    }
}
  

        
        
   

 
