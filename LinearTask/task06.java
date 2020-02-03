/* Написать код для решения задачи. В n малых бидонах 80 л молока. Сколько литров в m больших бидонах,
если в каждом большом бидоне на 12 л больше чем в малом.
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task06 
    {
    public static void main(String args[]){
        int n ,m;
        double l;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите  количество малых бидонов");
        n = scn.nextInt();
        System.out.println("Введите колиество больших бидонов");
        m = scn.nextInt();
        l = (80/n+12)*m;
                System.out.println("Количество молока в больших бидонах - " +  l);
                
    }
}
  

        
        
   

 
