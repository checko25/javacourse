/* Подсчитать количество положительных среди чисел а, b, с.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task19 {
    public static void main(String args[]){
        int [] arr = new int[3];
        int count  = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите три  числа");
        for(int i = 0; i < 3; i++) {
         arr[i] = scn.nextInt();
        }
        for(int i = 0; i < 3; i++) {
           if (arr[i] > 0)
           count++;
        }
           System.out.println("Количество положительных чисел: " + count); 
    }
}
  

