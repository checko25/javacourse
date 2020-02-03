/* Заданы координаты трёх вершин треугольгика (x1y1),(x2y2),(x3y3)
Найти его периметр и площадь
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task13
    {
     public static void main(String args[]){
        double x1,x2,x3,y1,y2,y3,d1,d2,d3,p,pp,s;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значения координаты x1");
        x1 = scn.nextDouble();
        System.out.println("Введите значения координаты y1");
        y1 = scn.nextDouble();
        System.out.println("Введите значения координаты x2");
        x2 = scn.nextDouble();
        System.out.println("Введите значения координаты y2");
        y2 = scn.nextDouble();
        System.out.println("Введите значения координаты x3");
        x3 = scn.nextDouble();
        System.out.println("Введите значения координаты y3");
        y3 = scn.nextDouble();
        d1 = Math.sqrt (Math.pow((x2-x1),2)+ Math.pow((y2-y1), 2));
        d2 = Math.sqrt (Math.pow((x3-x2),2)+ Math.pow((y3-y2), 2));
        d3 = Math.sqrt (Math.pow((x1-x3),2)+ Math.pow((y1-y3), 2));
        p = d1+d2+d3;
        pp = p/2;
        s = Math.sqrt(pp*(pp-d1)*(pp-d2)*(pp-d3));
                System.out.println("Периметр треугольника равен " +  p);
                System.out.println("Площадь треугольника равна: " +  s);
                
    }
} 

        
        
   

 
