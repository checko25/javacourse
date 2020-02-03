/*  Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task14
    {
     public static void main(String args[]){
        double r,p,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения радиуса");
        r = scn.nextInt();     
        p = r*Math.PI*2;
        s = r*r*Math.PI;
                System.out.println("Длина окружности равна: "+  p);
                System.out.println("Площадь круга равна: " +  s);
                
    }
}
 

        
        
   

 
