/* Написать программу нахождения суммы большего и меньшего из трех чисел.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task27 {
    public static int min1(int[] arr1) {
        int min1 = arr1[0];
        for (int i = 0; i < arr1.length; i++)
        if (arr1[i]<min1)
        min1 = arr1[i]; 
        return min1;
    }
    public static int min2(int[] arr2) {
        int min2 = arr2[0];
        for (int i = 0; i < arr2.length; i++)
        if (arr2[i]<min2)
        min2 = arr2[i]; 
        return min2;      
    }
    public static int max(int[] arrM) {
        int max = arrM[0];
        for (int i = 0; i < arrM.length; i++)
        if (arrM[i]>max)
        max = arrM[i]; 
        return max;  
    }
    public static void main(String args[]){
        int [] arr1 = new int[2];
        int [] arr2 = new int[2];
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите числа a,b");
        for(int i = 0; i < 2; i++) {
         arr1[i] = scn.nextInt();
        }
        System.out.println("Введите числа c,d");
        for(int j = 0; j < 2; j++) {
         arr2[j] = scn.nextInt();
        }
        int y = task27.min1(arr1);
        int z = task27.min2(arr2);
        int [] arrM = {y,z};
        int x = task27.max(arrM);
     System.out.println('\n' + "max of min = " + x);

    }
    
}
  

