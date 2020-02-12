/* Определить правильность даты, введенной с клавиатуры (число — от 1 до 31,
 месяц — от 1 до 12). Если введены некорректные данные, то сообщить об этом.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task23 {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
		System.out.println("Введите месяц");
		int m = scn.nextInt();
                for (int i = 0; m >12;i++)
                {
		if (m <= 0 || m > 12) {
			System.out.println("неверный месяц");
			System.out.println("Введите правильный месяц");
                        m = scn.nextInt();
                    }
                }
		System.out.println("Введите день");
		int d = scn.nextInt();
                    if (m == 2){
                       for (int i = 0; d >28;i++)
                {
			if (d <= 0 || d > 28) {
			System.out.println("неверный день");
			System.out.println("Введите правильный день");
                        d = scn.nextInt();
                        }
                    }
                }
                if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12){
                       for (int i = 0; d >31;i++)
                {
			if (d <= 0 || d > 31) {
			System.out.println("неверный день");
			System.out.println("Введите правильный день");
                        d = scn.nextInt();
                        }
                    }
                }
                if (m == 4 || m == 6 || m == 9 || m == 11){ 
                    for (int i = 0; d >30;i++)
                {
			if (d <= 0 || d > 30) {
			System.out.println("неверный день");
			System.out.println("Введите правильный день");
                        d = scn.nextInt();
                        }
                    } 
		}           
                System.out.println("Указанаая дата: " + d + "." + m);
	}
}
  

