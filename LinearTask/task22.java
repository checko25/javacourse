/*Дано натуральное число T, которое представляет длительность прошедшего времени в секундах.
Вывести данное значение длительности в часах минутах и секундах в следующей форме: HHч MM мин SSс
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task22
    {
    public static void main(String args[]){
        int t,h,m,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        t = scn.nextInt();
        h = t/3600;
        m = t/60;
        s = t%60;
                System.out.println(h + " ч " + m + "м " + s + "с ");            
    }
}
 

        
        
   

 
