/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения
,сложения и вычитания, вычислите за минимальное число операций: 2x 4 - 3х 3 + 4х 2 - 5х + 6.
*/
package by.htp.les01.main; 
import java.util.Scanner;
public class task39 {
    public static void main(String[] args) {
        double x,y;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число x:");
        x = in.nextDouble();
	y = (x*x * (2 * x*x - 3 * x + 4)) - 5 * x + 6;
         System.out.println(y);
        }
        
        
    } 
      
 
 
 

        
        
   

 
