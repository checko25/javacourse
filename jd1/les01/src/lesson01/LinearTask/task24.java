/*Найти площадь равнобедренной трапеции с основаниями a и b и углом alpha при большем основании a.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task24
    {
    public static void main(String args[]){
        double a, b,r,s;
        double rad = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите меньшего основания");
        a = scn.nextInt();
        System.out.println("Введите длину большего основания");
        b = scn.nextInt();
        System.out.println("угол в градусах");
        r = scn.nextInt();
        
        if (b<a || r>90)
        { 
            System.out.println("Неправильные условия!");
        }
        else
            rad = Math.toRadians(r);
            s = (b*b - a*a)* Math.tan(rad)/4; 
        {
            System.out.println("Площадь трапеции равна:" + s);
        }           
    }
}
 

        
        
   

 
