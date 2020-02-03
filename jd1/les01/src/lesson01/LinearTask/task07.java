/* Дан прямоугольник,ширина которого в 2 раза меньше длины. Найти площать прямоугольника
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task07 
    {
    public static void main(String args[]){
        int a;
        float s;
        Scanner scn = new Scanner(System.in);
        System.out.println(" Введите длину прямоугольника");
        a = scn.nextInt();
        s = a* (float)a/2;
                System.out.println("Площадь прямоугольника равна - " +  s);
                
    }
}
  

        
        
   

 
