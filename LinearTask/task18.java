/*Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объём этого куба
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task18
    {
    public static void main(String args[]){
        double a,sg,sp,v;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения ребра куба");
        a = scn.nextDouble(); 
        sg = a*a;
        sp = a*a*6;
        v = Math.pow(a,3);
                System.out.println("Площадь грани равна: " +  sg);
                System.out.println("Площадь полной поверхности равна: " +  sp);
                System.out.println("Объём куба равен: " +  v);
                
    }
}
 

        
        
   

 
