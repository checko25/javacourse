/*Найти площадь кольца, внутренний радиус которого равен r, а внешний - R (R>r)
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task23
    {
    public static void main(String args[]){
        double ri,ro, s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину внутреннего радиуса");
        ri = scn.nextInt();
        System.out.println("Введите длину внешнего радиуса");
        ro = scn.nextInt();
        if (ri>=ro)
        { 
            System.out.println("Внутренний радиус больше или равен внешнему! Неправильные условия!");
        }
        else 
        {
            s = Math.PI *(ro*ro - ri*ri);
            System.out.println("Площадь кольца равна:" + s);
        }           
    }
}
 

        
        
   

 
