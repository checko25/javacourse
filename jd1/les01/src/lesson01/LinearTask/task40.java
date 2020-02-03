/* Дано значение х. Получить значения -2х + 3х 2 - 4х 3 и 1 + 2х + 3х 2 + 4х3. Позаботьтесь об экономии операций
*/
package by.htp.les01.main; 
import java.util.Scanner;
public class task40 {
    public static void main(String[] args) {
        double x,y1,y2;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x:");
        x = in.nextDouble();
	y1 = -2 * x + (x*x * (3 - 4 * x));
	y2 = 1 + 2 * x + (x*x * (3 + 4 * x));
	System.out.println("y1 = " + y1 + ", y2 = " + y2);    
    }   
} 
      
 
 
 

        
        
   

 
