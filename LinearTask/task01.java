package by.htp.les01.main; 
import java.util.Scanner;
public class task01 {
    public static void main(String args[]){
        int number1, number2, r ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  первое число");
        number1 = scn.nextInt();
        System.out.println("Ведите  второе число");
        number2 = scn.nextInt();
        r = number1 - number2;
                System.out.println("Сумма чисел:" + number1 + number2);
                System.out.println("Разность чисел:" + r);
                System.out.println("Произведение чисел:" +  number1 * number2);
                System.out.println("Частное чисел:" + number1 / number2);
                
    }
}
  

        
        
   

 
