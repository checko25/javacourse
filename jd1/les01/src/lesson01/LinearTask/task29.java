/* Найти в радианах и градусах все углы треугольника со сторонами a,b,c.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task29
    {
    public static void main(String args[]){
        double ab, bc,ac,a,b,c,ga,gb,gc;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение стороны a");
        ab = scn.nextDouble();
        System.out.println("Введите значение стороны b");
        bc = scn.nextDouble(); 
        System.out.println("Введите значение стороны c");
        ac = scn.nextDouble(); 
        a = Math.acos((ac*ac-ab*ab+bc*bc/(2*ac*bc)));
        b = Math.acos((ab*ab-ac*ac+bc*bc/(2*ab*bc)));
        c = Math.acos((ab*ab-bc*bc+ac*ac/(2*ab*ac)));
        ga = a*180/Math.PI;
        gb = b*180/Math.PI;
        gc = c*180/Math.PI;
        System.out.println("Градусы: " + a + "   " + (int)ga);
        System.out.println("Минуты: " + b + "   " + (int)gb);
        System.out.println("Секунды: " + c +  "   " + (int)gc);
    }
}
 
 

        
        
   

 
