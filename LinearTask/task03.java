/* Найдите значение функции: z = 2 * x + ( y – 2 ) * 5
*/

package by.htp.les01.main; 
import java.util.Scanner;
    public class task03 
    {
    public static void main(String args[]){
        double x,y,z ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  переменную x");
        x = scn.nextDouble();
        System.out.println("Ведите  переменную y");
        y = scn.nextDouble();
        z = 2 * x + (y - 2) * 5;
                System.out.println("Значение функции z:" + z);           
    }
}
  

        
        
   

 
