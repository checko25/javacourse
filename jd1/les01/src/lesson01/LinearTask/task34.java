/* Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task34
    {
    public static void main(String args[]){
        double A;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение количества байтов");
        A = scn.nextDouble();
        A = (A/1024) ;
        System.out.println (A + " Килобайт") ;
        A = (A/1024) ;
        System.out.println (A + " Мегабайт") ;
        A = (A/1024) ;
        System.out.println (A + " Гигабайт") ;
    }
}
 
 
 

        
        
   

 
