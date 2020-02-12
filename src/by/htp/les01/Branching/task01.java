/* Составить программу сравнения двух чисел 1 и 2. Если 1 меньше 2 – вывести  на экран цифру 7, в противном случае – цифру 8.
*/
package by.htp.les01.Branching;
import java.util.Scanner;
public class task01 {
    public static void main(String args[]){
        int number1, number2, r ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  первое число");
        number1 = scn.nextInt();
        System.out.println("Ведите  второе число");
        number2 = scn.nextInt();
        if (number1 < number2) {
			System.out.println('\n'+ "7");
		} else {
			System.out.println('\n'+"8");
		}
	}
}
  

