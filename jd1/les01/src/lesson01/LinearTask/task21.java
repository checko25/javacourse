/*Дано действительное число вида nnn.ddd. (Три цифровых разряда в дробной и целых частях)Поменять местами
дробную и целую части числа и вывести полученное значение числа
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task21
    {
    public static void main(String args[]){
        double a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число в формате nnn.ddd");
        a = scn.nextDouble();
        String message = "";
        String str = Double.toString(a);
        if (str.length() !=7){
        System.out.println("Число неправильного формата!") ;
        }
        else {
         for (int i = 4; i < str.length(); i++) {
              message = message + str.charAt(i);
    }
         message = message + str.charAt(3);
          for (int i = 0; i < str.length(); i++) {
              message = message + str.charAt(i);
          if (i == 2){
          break; }
    }
        }
            System.out.println(message);
}
}
 

        
        
   

 
