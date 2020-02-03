/* составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде V км/ч, 
скорость течения реки V1 км/ч, время движения по озеру t1 ч, а против течения реки t2 ч.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task31
    {
   public static void main(String args[]){
        int v1,v2,t1,t2,S;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение скорости в стоячей воде");
        v1 = scn.nextInt();
        System.out.println("Введите значение скорости течения реки ");
        v2 = scn.nextInt(); 
        System.out.println("Введите значение времени движения по озеру ");
        t1 = scn.nextInt(); 
        System.out.println("Введите значение времени движения против течения реки");
        t2 = scn.nextInt(); 
        S = t1*v1+t2*(v1-v2);
        System.out.println("Путь, пройденный лодкой, равен: " + S + "км.");
        
    }
}
 
 
 

        
        
   

 
