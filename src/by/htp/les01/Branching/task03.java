/* Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», 
если число а меньше 3; если больше, то вывести слово «no».
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task03 {
    public static void main(String args[]){
        int a ;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите  первое число");
        a = scn.nextInt();
        if (a < 3) {
			System.out.println('\n'+ "yes");
		} else {
			System.out.println('\n'+"no");
		}
	}
}
  

