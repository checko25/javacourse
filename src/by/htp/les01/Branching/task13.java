/* Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий,
которая из точек находится ближе к началу координат.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task13 {
    public static void main(String args[]){
        int x1,x2,y1,y2;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите координату точки x1");
        x1 = scn.nextInt();
        System.out.println("Ведите координату точки x2");
        x2 = scn.nextInt();
        System.out.println("Ведите координату точки y1");
        y1 = scn.nextInt();
        System.out.println("Ведите координату точки y2");
        y2 = scn.nextInt();
        if (Math.sqrt(x1*x1+y1*y1)<Math.sqrt(x2*x2+y2*y2))
        {
         System.out.println("Точка A ближе к началу координат");
        }
        else if (Math.sqrt(x1*x1+y1*y1) == Math.sqrt(x2*x2+y2*y2))
        {
         System.out.println("Точки равноудалены");   
        }
        else
        {
         System.out.println("Точка B ближе к началу координат");   
        }
       
    }
}
  

