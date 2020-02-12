/* Составить программу, определяющую результат гадания на ромашке —«любит—не любит», взяв за исходное данное количество лепестков п.
*/
package by.htp.les01.main;
import java.util.Scanner;
public class task24 {
    public static void main(String args[]){
        int m;
        String message = "";
        Scanner scn = new Scanner(System.in);
	System.out.println("Введите количество лепестков");
	m = scn.nextInt();
            for (int i = 0; m >0;i++)
            {
                if (m!=0){
                message  = "Любит";    
		System.out.println(message);
                m = m-1;
                } else {
                break;
                }    
                if (m!=0){
                message  = "Не любит"; 
		System.out.println(message);
                m = m-1;
                } else {
                break;
                }            
            } 
               System.out.println("Всё таки " + message + "!");
	}
}
  

