/* Написать программу нахождения суммы большего и меньшего из трех чисел.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task26 {
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        if (arr[i]>max)
        max = arr[i]; 
        return max;
    }
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        if (arr[i]<min)
        min = arr[i]; 
        return min;
    }
    public static void main(String args[]){
        int [] arr = new int[3];
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите три  числа");
        for(int i = 0; i < 3; i++) {
         arr[i] = scn.nextInt();
        }
        int y = task26.max(arr);
        int z = task26.min(arr);
        y = y+z;
     System.out.println('\n' + "Сумма наибольшего и наименьшего чисел равна: " + y);

    }
}
  

