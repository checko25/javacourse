/* Даны три числа a, b, с. Определить, какое из них равно d. Если ни одно не равно d, то найти max(d — a, d — b, d — c).
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task28 {
    public static int max(int[] arrM) {
        int max = arrM[0];
        for (int i = 0; i < arrM.length; i++)
        if (arrM[i]<max)
        max = arrM[i]; 
        return max;  
    }
    public static void main(String args[]){
        int [] arr1 = new int[3];
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число d");
        int d = scn.nextInt();
        System.out.println("Введите числа a,b,c");
        for(int i = 0; i < 3; i++) {
         arr1[i] = scn.nextInt();
        }
        for(int j = 0; j < 3; j++) {
            if (arr1[0] == d){
            System.out.println("число d равно числу a = " + d);
            }
            if (arr1[1] == d){
            System.out.println("число d равно числу b = " + d);
            }
            if (arr1[2] == d){
            System.out.println("число d равно числу c = " + d);
            }
            if (arr1[2] == d || arr1[0] == d || arr1[1] == d){
                break;
            }else{
         int [] arrM = {d - arr1[0],d - arr1[1], d - arr1[2]};
        int x = task27.max(arrM);
     System.out.println('\n' + "Максимальное значение разностей = " + x);
            }   
        }    
    }
    
}
  

