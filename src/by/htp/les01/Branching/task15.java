/* Даны действительные числа х и у, не равные друг другу. Меньшее из этихдвух чисел заменить половиной их суммы, а большее — их удвоенным произведением..
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task15 {
    public static void main(String args[]){
        int x,y;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите значение числа x");
        x = scn.nextInt();
        System.out.println("Ведите значение числа y");
        y = scn.nextInt();
        if (x < y) {
            x = (x + y) / 2;
            y = x * y * 2;
            System.out.println("x = " + x + '\n' + "y = " + y);
	} 
            else if (x>y)
        {
            y = (x + y) / 2;
            x = x * y * 2;
            System.out.println("x = " + x + '\n' + "y = " + y);
	}
            else
        {
            System.out.println("Заданные числа не соответствуют условиям задания!");    
        }
    }
}
  

