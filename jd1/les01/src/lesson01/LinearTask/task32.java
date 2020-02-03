/* Текущее показание электронных часов: m часов (0<=m<=23) n мин(0<=n<=59), k c(0<=k<=59).
Какое время будут показывать часы через p часов, q мин, r c?
*/
package by.htp.les01.main; 
import java.util.Scanner;
    public class task32
    {
   public static void main(String args[]){
        int m,n,k,p,q,r,x,y,z,b,c;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите значение часов");
        m = scn.nextInt();
        System.out.println("Введите значение минут ");
        n = scn.nextInt(); 
        System.out.println("Введите значение секунд ");
        k = scn.nextInt(); 
        System.out.println("Введите значение прибавленных часов");
        p = scn.nextInt(); 
        System.out.println("Введите значение прибавленных минут");
        q = scn.nextInt(); 
        System.out.println("Введите значение прибавленных секунд");
        r = scn.nextInt(); 
        y=m*3600+n*60+k;
        z=p*3600+q*60+r;
        x= y+z;
        m = x/3600;
        if (m>=24)
        {
            m = m-24;
        }
        n = (x % 3600) / 60;
        if (n>=60){
        b = n / 60;
        m = m+b;
        n = n % 60;
        }
        k=(x % 3600)% 60;
        if (k>=60) {
        c=k / 60;
        n=n+k;
        k=k / 60;
        }
         System.out.println(m +  "часов" + n + " минут " + k + "секунд");
    }
}
 
 
 

        
        
   

 
