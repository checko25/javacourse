/* Определить, делителем каких чисел а, b, с является число k
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task20 {
    public static void main(String args[]){
        double [] arr = new double[3];
        int k;
        String message = "Число k является делителем чисел: ";
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите три  числа");
        for(int i = 0; i < 3; i++) {
         arr[i] = scn.nextDouble();
        }
        System.out.println("Введите число k");
        k = scn.nextInt();
        for(int i = 0; i < 3; i++) {
           if (arr[i] % k == 0)
           message = message + (int)arr[i] + "; ";
        }
           System.out.println(message); 
    }
}
  

