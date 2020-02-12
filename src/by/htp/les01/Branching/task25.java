/* Написать программу — модель анализа пожарного датчика в помещении, которая выводит сообщение «Пожароопасная ситуация »,
 если температура в комнате превысила 60° С.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task25 {
    public static void main(String args[]){
        int t;
        Scanner scn = new Scanner(System.in);
	System.out.println("Введите температуру t");
	t = scn.nextInt();
            if (t>60){
            System.out.println("Пожароопасная ситуация!");
            } else {
            System.out.println("Непожароопасная ситуация!");   
            }
	}
}
  

