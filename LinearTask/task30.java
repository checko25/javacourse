/* Три сопротивления R1,R2,R3 соединены параллельно. Найти сопротивление соединения
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task30
    {
    public static void main(String args[]){
        double r1, r2,r3,r;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение сопротивления R1");
        r1 = scn.nextDouble();
        System.out.println("Введите значение сопротивления R2");
        r2 = scn.nextDouble(); 
        System.out.println("Введите значение сопротивления R3");
        r3 = scn.nextDouble(); 
        r = (1/(1/r1+1/r2+1/r3));
        System.out.println("Общее сопротивление равно: " + r); 
    }
}
 
 
 

        
        
   

 
