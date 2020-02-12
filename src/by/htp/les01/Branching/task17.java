/* Даны целые числа n, m. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
из исходных, а если равны, то заменить числа нулями.

*/
package by.htp.les01.main;
import java.util.Scanner;
public class task17 {
    public static void main(String args[]){
        int m,n;
        Scanner scn = new Scanner(System.in);
        System.out.println("Ведите значение числа m");
        m = scn.nextInt();
        System.out.println("Ведите значение числа n");
        n = scn.nextInt();
        if (m == n) 
        {
            m = 0;
            n = 0;
            System.out.println("Так как m=n, то - m равно " + m + ", n равно " + n);
	}
	else if (m > n) 
        {
            n = m;
            System.out.println("Так как m>n, то - m и n равны " + m);
	} 
        else 
        {
            m = n;
            System.out.println("Так как m<n, то - m и n равны " + n);
	}
		
    }
}
  

