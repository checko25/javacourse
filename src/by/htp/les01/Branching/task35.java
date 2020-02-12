/* Вычислить число и месяц в невисокосном году по номеру дня.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task35 {
    public static void main(String... args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер дня: ");
        a = sc.nextInt();
            System.out.print(a + "-й день в невисокосном году - это ");
		if (a <= 31) {
			System.out.println(a + " января");
		} else if (a <= 59) {
			a -= 31;
			System.out.println(a + " февраля");
		} else if (a <= 90) {
			a -= 59;
			System.out.println(a + " марта");
		} else if (a <= 120) {
			a -= 90;
			System.out.println(a + " апреля");
		} else if (a <= 151) {
			a -= 120;
			System.out.println(a + " мая");
		} else if (a <= 181) {
			a -= 151;
			System.out.println(a + " июня");
		} else if (a <= 212) {
			a -= 181;
			System.out.println(a + " июля");
		} else if (a <= 243) {
			a -= 212;
			System.out.println(a + " августа");
		} else if (a <= 273) {
			a -= 243;
			System.out.println(a + " сентября");
		} else if (a <= 304) {
			a -= 273;
			System.out.println(a + " октября");
		} else if (a <= 334) {
			a -= 304;
			System.out.println(a + " ноября");
		} else if (a <= 365) {
			a -= 334;
			System.out.println(a + " декабря");
		} else {
			System.out.println("что?? Неправельно введен день!");
                }
    }
}
  

