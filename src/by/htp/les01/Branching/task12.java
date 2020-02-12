/* Даны три действительных числа. Возвести в квадрат те из них, значения
которых неотрицательны, и в четвертую степень — отрицательные.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task12 {
    public static void main(String args[]){
        double [] array = new double[3];
        double s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите три действительных числа");
        for(int i=0; i<3; i++ ) {
         array[i] = scn.nextDouble();
        }
        for(int i = 0; i <  3; i++) {
           if (array[i] > 0)
        {
           s = array[i] * array[i];
           System.out.println("Число " + array[i] + " неотрицательное. Полученный результат: " + s); 
        }
           else 
        {
           s = Math.pow(array[i], 4);
           System.out.println("Число " + array[i] + " отрицательное. Полученный результат: " + s); 
        }
       }
    }
}
  

